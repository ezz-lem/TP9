package tps.tp9

fun calcul() : Int {
    println("Calcul en cours...")
    return 10 * 10
}

val resultat by lazy { calcul() }

fun main() {
    println("Programme lancé")
    println("Résultat : $resultat")
}
