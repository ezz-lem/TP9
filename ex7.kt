package tps.tp9

class DatabaseConnection {
    fun connecter() {
        println("Connexion établie")
    }
    fun requete(sql: String) {
        println("Requête exécutée : $sql")
    }
}

class DatabaseManager {
    lateinit var connexion: DatabaseConnection

    fun initConnexion() {
        connexion = DatabaseConnection()
        connexion.connecter()
    }

    fun executer(sql: String) {
        if (::connexion.isInitialized) {
            connexion.requete(sql)
        } else {
            println("Connexion non initialisée")
        }
    }
}

fun main() {
    val db = DatabaseManager()
    db.executer("SELECT * FROM users")
    db.initConnexion()
    db.executer("SELECT * FROM users")
}
