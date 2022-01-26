package com.betclic.interview.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.betclic.interview.R
import com.betclic.interview.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainAdapter = MainAdapter()

        binding.recyclerView.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(MarginItemDecoration(resources.getDimensionPixelSize(R.dimen.margin_medium)))
        }
    }

    override fun onStart() {
        super.onStart()

        viewModel.getCharacters()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { characterList, throwable ->
                if (throwable != null) {
                    Log.e("MainActivity", "Could not retrieve list of characters", throwable)
                } else {
                    mainAdapter.characters = characterList
                }
            }
    }
}