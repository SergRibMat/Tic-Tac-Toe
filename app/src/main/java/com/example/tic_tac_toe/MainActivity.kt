package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView



import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var boardArray: BoardArray
    lateinit var playerUserCase: PlayerUseCase

    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initClasses()
        setNameAndColor()
        setImageClickListeners()
        buttonsListeners()
    }

    fun initClasses(){
        boardArray = BoardArray()
        playerUserCase = PlayerUseCase()
        i = 0

    }



    fun setNameAndColor(){

        tv_player_name.text = playerUserCase.playerArray[i].obtainPlayerName()
        tv_player_name.setTextColor(playerUserCase.playerArray[i].color)
    }

    fun setImageClickListeners(){

        imageView_0_0.setOnClickListener {

            toDo(it,0,0)
        }
        imageView_0_1.setOnClickListener {
            toDo(it,0,1)
        }
        imageView_0_2.setOnClickListener {
            toDo(it,0,2)

        }
        imageView_1_0.setOnClickListener {
            toDo(it,1,0)

        }
        imageView_1_1.setOnClickListener {
            toDo(it,1,1)

        }
        imageView_1_2.setOnClickListener {

            toDo(it,1,2)

        }
        imageView_2_0.setOnClickListener {
            toDo(it,2,0)

        }
        imageView_2_1.setOnClickListener {
            toDo(it,2,1)

        }
        imageView_2_2.setOnClickListener {

            toDo(it,2,2)
        }

    }

    fun doAfterImageClicked(it: View, x: Int, y: Int){
        if (it is ImageView) {
            Glide.with(this).load(playerUserCase.playerArray[i].image).into(it)
        }
        boardArray.modifyArray(x,y, playerUserCase.playerArray[i].id)
        it.isClickable = false


    }

    fun passToNextPlayer(){
        if(i == 0) i++ else i--
    }

    fun winActions(){
        tv_player_name.text = "${playerUserCase.playerArray[i].obtainPlayerName()} wins"
    }

    fun buttonsListeners(){
        button_PlayAgain.setOnClickListener {
            setBoardToBlank()
            initClasses()
            setNameAndColor()
        }
        button_exit.setOnClickListener{
            finish()
        }
    }

    fun createArrayImageViews(): Array<Array<ImageView>>{
        val row1 = arrayOf(imageView_0_0, imageView_0_1, imageView_0_2)
        val row2 = arrayOf(imageView_1_0, imageView_1_1, imageView_1_2)
        val row3 = arrayOf(imageView_2_0, imageView_2_1, imageView_2_2)
        var board = arrayOf(row1, row2, row3)
        return board
    }

    fun setAttrToValue(value: ImageView, condition: Boolean){
        Glide.with(this).load(R.color.colorWhite).into(value)
        value.isClickable = condition
    }

    fun toDo(it: View, x: Int, y: Int){
        doAfterImageClicked(it, x, y)
        val checkWholeBoard = CheckWholeBoard(boardArray.boardArray, playerUserCase.playerArray[i].id)
        if(checkWholeBoard.win){
            winActions()
            removeClickable()
        }else{
            passToNextPlayer()
            setNameAndColor()
        }
    }
    //there must be a way to execute a function for each value the array has
    //these 2 functions below only differ in 1 line, that can be solved if i had some kind of for each
    fun removeClickable(){
        val board = createArrayImageViews()
        for (row in board) {
            for (value in row) {
                value.isClickable = false
            }
        }
    }

    fun setBoardToBlank(){
        val board = createArrayImageViews()
        for (row in board) {
            for (value in row) {
                setAttrToValue(value, true)
            }
        }
    }

}
