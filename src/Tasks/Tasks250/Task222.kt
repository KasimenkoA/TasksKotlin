package Tasks.Tasks250

internal interface Sportsman {
    fun go()
    fun run()
}

internal class FootballPlayer : Sportsman {
    override fun go() {
        println("Football player is coming.")
    }

    override fun run() {
        println("Football player is runs.")
    }
}

internal class HockeyPlayer : Sportsman {
    override fun go() {
        println("Hockey player is coming.")
    }

    override fun run() {
        println("Hockey player is runs.")
    }
}

fun main() {
    val footballPlayer = FootballPlayer()
    footballPlayer.go()
    footballPlayer.run()

    val hockeyPlayer = HockeyPlayer()
    hockeyPlayer.go()
    hockeyPlayer.run()
}