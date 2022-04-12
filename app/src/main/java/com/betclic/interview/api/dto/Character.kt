package com.betclic.interview.api.dto

import com.squareup.moshi.Json

data class Character(
    @field:Json(name= "char_id") val id: Int,
    @field:Json(name= "name") val name: String,
    @field:Json(name= "img") val img: String,
    @field:Json(name= "nickname") val nickname: String,
    @field:Json(name= "portrayed") val portrayed: String
)