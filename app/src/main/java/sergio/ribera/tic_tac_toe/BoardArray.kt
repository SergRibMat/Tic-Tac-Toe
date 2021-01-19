package sergio.ribera.tic_tac_toe

class BoardArray {

    val board = BoardData()
    val boardArray: Array<Array<Int>>

    init {
        boardArray = board.fillArray()
    }

    fun modifyArray(x: Int, y:Int, value: Int){
        boardArray[x][y] = value
    }

    fun showArray(): String{
        var text = ""
        for (array in boardArray) {
            for (value in array){
                text += value
            }
            text += "\n"
        }
        return text
    }

}