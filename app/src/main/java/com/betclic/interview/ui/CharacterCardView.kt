package com.betclic.interview.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import com.betclic.interview.databinding.ViewCharacterCardBinding
import com.betclic.interview.extension.topCrop
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

class CharacterCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private val binding = ViewCharacterCardBinding.inflate(LayoutInflater.from(context), this)

    fun set(state: CharacterCardState) {
        Glide.with(this)
            .load(state.iconUrl)
            .topCrop()
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(binding.characterAvatar)
        binding.characterName.text = state.name
        binding.characterDescription.text = "\"${state.description}\""
        binding.characterPortrayed.text = state.portrayed
    }

}

data class CharacterCardState(
    val iconUrl: String,
    val name: String,
    val description: String,
    val portrayed: String
)