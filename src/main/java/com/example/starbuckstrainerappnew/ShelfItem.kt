package com.example.starbuckstrainerappnew

var shelfItemList = mutableListOf<ShelfItem>()

val SHELF_ITEM_EXTRA = "shelfItemExtra"
class ShelfItem (
    var shelfItemImage: Int,
    var shelfItemName: String,
    var shelfItemDetails: Int,
    val id: Int? = shelfItemList.size
)