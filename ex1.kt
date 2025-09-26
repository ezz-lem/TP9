package tps.tp9

fun main() {
//    print("Entrer le premier nombre : ")
//    val a = readLine()!!.toInt()
//    print("Entrer le deuxième nombre : ")
//    val b = readLine()!!.toInt()
//
//    println("Addition : ${a + b}")
//    println("Soustraction : ${a - b}")
//    println("Multiplication : ${a * b}")
//
//    if (b != 0) {
//        println("Division : ${a / b}")
//    } else {
//        println("Division impossible (par zéro)")
//    }
//
//    println("a > b ? ${a > b}")
//
//    val somme = a + b
//    if (somme % 2 == 0) println("Somme paire") else println("Somme impaire")







print("Entrer le premier nombre : ")
val a = readLine()!!.toInt()
print("Entrer le deuxième nombre : ")
val b = readLine()!!.toInt()


//println("Addition : ${a + b}")






//    println("Soustraction : ${a - b}")

    println("Multiplication : ${a * b}")

    if (b != 0) {
        println("Division : ${a / b}")
    } else {
        println("Division impossible (par zéro)")
    }

    if (a > b) {
        println("a est superior")
    }else if (a < b) {
        println("b est superior")
    }else {
        println("a et b sont ego")
    }

    val somme = a + b
    if (somme % 2 == 0) println("Somme paire") else println("Somme impaire")




}