package sergio.ribera.tic_tac_toe

class BoardData {

    fun fillArray(): Array<Array<Int>>{
        var board = arrayOf<Array<Int>>()
        for (i in 0..2) {
            var array = arrayOf<Int>()
            for (j in 0..2) {
                array += 2
            }
            board += array
        }
        return board
    }
}