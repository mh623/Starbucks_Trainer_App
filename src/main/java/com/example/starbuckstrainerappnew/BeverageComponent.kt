package com.example.starbuckstrainerappnew

var beverageComponentList = mutableListOf<BeverageComponent>()

val BEVERAGE_COMPONENT_EXTRA = "beverageComponentExtra"
class BeverageComponent (
    var beverageComponentImage: Int,
    var beverageComponentName: String,
    var beverageComponentInstructions: Int,
    val id: Int? = beverageComponentList.size
)