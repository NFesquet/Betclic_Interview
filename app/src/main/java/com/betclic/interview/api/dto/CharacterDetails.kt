package com.betclic.interview.api.dto

import com.squareup.moshi.Json

data class CharacterDetails(
    @field:Json(name= "char_id") val id: Int,
    @field:Json(name= "name") val name: String,
    @field:Json(name= "birthday") val birthday: String,
    @field:Json(name= "occupation") val occupation: List<String>,
    @field:Json(name= "img") val img: String,
    @field:Json(name= "status") val status: String,
    @field:Json(name= "nickname") val nickname: String,
    @field:Json(name= "appearance") val appearance: List<Int>,
    @field:Json(name= "portrayed") val portrayed: String
)