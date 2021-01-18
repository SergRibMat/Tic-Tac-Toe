package com.example.cruzraya

class CheckWholeBoard(
    val board: Array<Array<Int>>,
    val num: Int
) {

    val win: Boolean

    init {
        win = (checkRow() || checkCol() || checkDiagonal())
    }



    fun checkRow(): Boolean{
        //loop works perfectly
        val row = arrayOf(num, num, num)//posible comprobacion porque se crea cada vez que se llama
        for (array in board) {
            if(array contentEquals row){
                return true
            }
        }
        return false
    }

    fun checkCol():Boolean{
        var i = 0
        var j = 0
        while (i < 3){
            while (j < 3){
                if(board[i][j] == num){
                    i++
                    break
                }else{
                    j++
                    i = 0
                }
            }
            if(j == 3){
                break
            }
            if(i == 3){
                return true
            }
        }
        return false
    }

    fun checkDiagonal():Boolean{

        if (upDownDiagonal() || downUpDiagonal()){
            return true
        }

        return false
    }

    fun upDownDiagonal(): Boolean{
        if(board[0][0] == num && board[1][1] == num && board[2][2] == num){
            return true
        }
        return false
    }

    fun downUpDiagonal(): Boolean{
        if(board[2][0] == num && board[1][1] == num && board[0][2] == num){
            return true
        }
        return false
    }
}