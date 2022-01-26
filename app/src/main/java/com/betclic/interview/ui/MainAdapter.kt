package com.betclic.interview.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.betclic.interview.R
import com.betclic.interview.api.dto.Character

class MainAdapter : RecyclerView.Adapter<MainAdapter.CharacterViewHolder>() {

    var characters: List<Character> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_character, parent, false) as CharacterCardView
        )
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.item.set(
            CharacterCardState(
                character.img,
                character.name,
                character.nickname,
                character.portrayed
            )
        )
    }

    override fun getItemCount(): Int = characters.size

    class CharacterViewHolder(
        val item: CharacterCardView
    ) : RecyclerView.ViewHolder(item)
}