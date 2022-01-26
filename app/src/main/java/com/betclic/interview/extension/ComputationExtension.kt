package com.betclic.interview.extension

import kotlin.math.absoluteValue

fun Float.closeTo(other: Float, precision: Float = 0.001f): Boolean =
    (this - other).absoluteValue < precision