package exercicio6

fun main() {
    println("-----------TABUADA---------")
    tabuada()
}
fun tabuada(){
    for (i in 1 ..9){
        for (j in 1..9){
            println("$i x $j = ${i*j}")
        }
        println()
    }
}