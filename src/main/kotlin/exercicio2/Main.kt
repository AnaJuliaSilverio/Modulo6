package exercicio2

fun main() {
    println("Digite um valor: ")
    val vetor = dobroVetor(readln().toInt())
    mostrarVetor(vetor)
}
fun dobroVetor(valor:Int): IntArray {
    val vetor = IntArray(10)
    vetor[0] = valor
    for (i in 1 until vetor.size){
        vetor[i] = vetor[i-1] *2
    }
    return vetor
}

fun mostrarVetor(vetor:IntArray){
    for (i in vetor.indices){
        println(vetor[i])
    }
}