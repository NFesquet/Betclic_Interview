package com.betclic.interview.api.dto

import com.squareup.moshi.Json

data class Character(
    @Json(name= "id") val id: Int,
    @Json(name= "name") val name: String,
    @Json(name= "img") val img: String,
    @Json(name= "nickname") val nickname: String,
    @Json(name= "portrayed") val portrayed: String
)