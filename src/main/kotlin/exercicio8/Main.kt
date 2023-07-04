package exercicio8

fun main() {
    println("Digite o nome do Aluno: ")
    val nome = readln()
    val notas = recebeNotas()
    imprimeNotas(notas)
}
fun recebeNotas():DoubleArray{
    val arrayNotas = DoubleArray(3)
    for (i in 0 until 3){
        println("Digite a nota ${i+1}")
        arrayNotas[i] = readln().toDouble()
    }
    return arrayNotas
}
fun imprimeNotas(array: DoubleArray){
    for (i in array.indices){
        println("Nota ${i+1}: ${array[i]}")
    }
    println("A média é : ${array.average()}")
}