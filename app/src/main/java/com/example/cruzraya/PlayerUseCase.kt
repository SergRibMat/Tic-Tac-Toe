package com.example.cruzraya

class PlayerUseCase {

    val playerArray: Array<Player>

    init {
        playerArray = PlayerArray().fillPlayersArray()
    }


}