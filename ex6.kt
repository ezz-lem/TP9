package tps.tp9

class UtilisateurService {
    fun afficher() {
        println("Service utilisateur actif")
    }
}

class Application {
    lateinit var service: UtilisateurService

    fun initService() {
        service = UtilisateurService()
    }

    fun utiliser() {
        if (::service.isInitialized) {
            service.afficher()
        } else {
            println("Service pas encore initialisé")
        }
    }
}

fun main() {
    val app = Application()
    app.utiliser()
    app.initService()
    app.utiliser()
}
