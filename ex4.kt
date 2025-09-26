package tps.tp9

class Configuration {
    init {
        println("Configuration chargée")
    }
    fun utiliser() {
        println("Configuration utilisée")
    }
}

class App {
    val config: Configuration by lazy { Configuration() }
}

fun main() {
    val app = App()
    println("Application démarrée")
    app.config.utiliser()
}

