package com.betclic.interview.repository

import com.betclic.interview.api.ExerciseApiClient
import com.betclic.interview.api.dto.CharacterDetails
import com.betclic.interview.api.dto.Character
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExerciseRepository @Inject constructor(
    private val exerciseApiClient: ExerciseApiClient
) {

    fun getCharacters(): Single<List<Character>> =
        exerciseApiClient.getCharacters()

    fun getCharacter(id: Int): Single<CharacterDetails> =
        exerciseApiClient.getCharacter(id)
}