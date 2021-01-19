package sergio.ribera.tic_tac_toe

class PlayerUseCase {

    val playerArray: Array<Player>

    init {
        playerArray = PlayerArray().fillPlayersArray()
    }


}