package com.example.cruzraya

import org.junit.Test

import org.junit.Assert.*

class MainActivityTest {

    @Test
    fun checkCol() {
        var arr = fillArray()
        arr[0][0] = 1
        arr[2][0] = 1
        //arr[0][1] = 1
        //assertFalse()

        //assertTrue()
    }

    fun fillArray(): Array<Array<Int>>{
        var board = arrayOf<Array<Int>>()
        for (i in 0..2) {
            var array = arrayOf<Int>()
            for (j in 0..2) {
                array += 0
            }
            board += array
        }
        return board
    }
}