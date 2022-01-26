package com.betclic.interview.api.dto

import com.squareup.moshi.Json

data class CharacterDetails(
    @Json(name= "char_id") val id: Int,
    @Json(name= "name") val name: String,
    @Json(name= "birthday") val birthday: String,
    @Json(name= "occupation") val occupation: List<String>,
    @Json(name= "img") val img: String,
    @Json(name= "status") val status: String,
    @Json(name= "nickname") val nickname: String,
    @Json(name= "appearance") val appearance: List<Int>,
    @Json(name= "portrayed") val portrayed: String
)