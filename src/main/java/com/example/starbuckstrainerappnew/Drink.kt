package com.example.starbuckstrainerappnew

var drinkList = mutableListOf<Drink>()

val DRINK_EXTRA = "drinkExtra"

class Drink (
    var drinkImage: Int,
    var drinkName: String,
    var drinkInstructions: Int,
    val id: Int? = drinkList.size
)