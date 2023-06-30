package exercicio4

fun main() {
    val array = IntArray(10)

    for (i in array.indices){
        println("Digite a posição do numero ${i+1}")
        val  intOutput = readln().toInt()
        array[i] = intOutput
    }
    imprimeVetor(ehPar(array))

}
fun ehPar(array: IntArray):IntArray{
    var valoresPares = intArrayOf()
    for (i in array){
        if (i%2==0){
            valoresPares= valoresPares.plus(i)
        }
    }
    return valoresPares
}
fun imprimeVetor(array: IntArray):Unit{
    println("Os valores pares são")
    for (i in array){
        println(i)
    }
}