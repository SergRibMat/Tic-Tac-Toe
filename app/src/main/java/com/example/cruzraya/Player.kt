package com.example.cruzraya

data class Player(

    var color: Int,
    var id: Int,
    val name: String = "Player",//this should be static
    val image: Int

) {
    fun obtainPlayerName(): String{
        return "$name ${id + 1}"
    }
}