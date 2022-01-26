package com.betclic.interview.ui

import androidx.lifecycle.ViewModel
import com.betclic.interview.api.dto.Character
import com.betclic.interview.repository.ExerciseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.Single
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val exerciseRepository: ExerciseRepository
) : ViewModel() {

    fun getCharacters() : Single<List<Character>> =
        exerciseRepository.getCharacters()
}