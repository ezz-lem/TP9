package tps.tp9

fun main(){
    println("n1:")
    val n1 = readLine()!!.toDouble()
    println("n2:")
    val n2 = readLine()!!.toDouble()
    println("n3:")
    val n3 = readLine()!!.toDouble()



    val moyenne = (n1 + n2 + n3) / 3
    println("Moyenne : $moyenne")

    if (moyenne >= 50) println("Réussi") else println("Échoué")



    if (moyenne >= 80) {
        println("Réussi avec mention excellente")
    } else if (moyenne >= 50) {
        println("Réussi")
    } else {
        println("Échoué")
    }


}