package sergio.ribera.tic_tac_toe

import org.junit.Test

import org.junit.Assert.*

class PlayBoardTest {

    @Test
    fun fillArray() {
        //array filled with 0
        val row1: IntArray = intArrayOf(0, 0, 0)
        val row2: IntArray = intArrayOf(0, 0, 0)
        val row3: IntArray = intArrayOf(0, 0, 0)

        val lala: Array<IntArray> = arrayOf(row1, row2, row3)
        //array generated by the method
        var board = arrayOf<Array<Int>>()
        for (i in 0..2) {
            var array = arrayOf<Int>()
            for (j in 0..2) {
                array += 0
            }
            board += array
        }

        assertArrayEquals( lala, board)
    }

    @Test
    fun checkRow() {
        var arr = fillArray()

        val row: IntArray = intArrayOf(1, 1, 1)



        /*for (array in arr) {

            if (array contentEquals row){
                println("perfecto")
            }

        }*/
    }
}