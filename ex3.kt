package tps.tp9

class MonThread(val nom: String) : Runnable {
    override fun run() {
        for (i in 1..5) {
            println("Thread $nom : message $i")
            Thread.sleep(1000)
        }
    }
}
fun main() {
    Thread(MonThread("A")).start()
//    Thread(MonThread("B")).start()
}
