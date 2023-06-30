package exercicio1

fun main() {
    val array = IntArray(5)
    var soma = 0
    for (i in array.indices){
        println("Digite a posição do numero ${i+1}")
        val  intOutput = readln().toInt()
        array[i] = intOutput
        soma+=intOutput

    }
    println("A soma do vetor é $soma")
}