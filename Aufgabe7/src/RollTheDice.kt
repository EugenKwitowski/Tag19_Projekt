import kotlin.random.Random.Default.nextInt

fun main() {
    //var roll: Int = nextInt(1, 7)
    game()
}

fun player1(): Int {
    var roll: Int = nextInt(1, 7)
    var spieler1 = roll
    return spieler1
}

fun player2(): Int {
    var roll: Int = nextInt(1, 7)
    var spieler2 = roll
    return spieler2
}


fun game() {
    val player1 = player1()
    println("Zuerst würfelt Spieler 1 und er hat die $player1")
    val player2 = player2()
    println("Dann würfelt Spieler 2 und er hat die $player2")
    if (player1 < player2) {
        println("Spieler 2 hat gewonnen!")
    } else if (player1 > player2) {
        println("Spieler 1 hat gewonnen!")
    } else if (player1 == player2) {
        println("Es ist gleichstand! \n Bitte würfelt nochmal!")
        game()
    }
}

