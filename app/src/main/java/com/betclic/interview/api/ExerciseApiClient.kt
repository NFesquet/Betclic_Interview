package com.betclic.interview.api

import com.betclic.interview.api.dto.CharacterDetails
import com.betclic.interview.api.dto.Character
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class ExerciseApiClient @Inject constructor(
    retrofit: Retrofit
) {

    private val exerciseService: ExerciseService = retrofit.create(ExerciseService::class.java)

    fun getCharacters(): Single<List<Character>> =
        exerciseService.getCharacters()

    fun getCharacter(id: Int): Single<CharacterDetails> =
        exerciseService.getCharacter(id)
            .map { it[0] } // API changed, now returns a list of one element
}