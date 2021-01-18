package com.example.cruzraya

class PlayerArray {


    fun fillPlayersArray(): Array<Player>{//returns nothing but must be executed
        return arrayOf(
            Player(
                color = -0xFA0202,
                id = 0,
                image = R.drawable.cruz
            ),
            Player(
                color = -0x00D4FF,
                id = 1,
                image = R.drawable.circulo
            )
        )
    }
}