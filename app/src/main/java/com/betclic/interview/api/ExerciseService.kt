package com.betclic.interview.api

import com.betclic.interview.api.dto.CharacterDetails
import com.betclic.interview.api.dto.Character
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ExerciseService {

    @GET("characters")
    fun getCharacters(): Single<List<Character>>

    @GET("characters/{id}")
    fun getCharacter(@Path("id") id: Int): Single<CharacterDetails>
}