package com.example.tic_tac_toe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BoardViewModel(): ViewModel() {

    private val boardData = MutableLiveData<Array<Array<Int>>>()
    private val boardArrayVal: BoardArray


    fun setBoardData(boardArrayVal:Array<Array<Int>>){
        boardData.value = boardArrayVal
    }

    //Podemos usar corutinas para pedir informacion que sea asyncrona
    //esto va al repositorio a coger la lista de frutas

        init {
            boardArrayVal = BoardArray()
            setBoardData(boardArrayVal.boardArray)
        }

    fun getBoardArrayVal(): BoardArray{
        return boardArrayVal
    }
    fun getBoardData(): MutableLiveData<Array<Array<Int>>>{
        return boardData
    }


    fun getBoardDataLiveData(): LiveData<Array<Array<Int>>> {
        return boardData
    }

}