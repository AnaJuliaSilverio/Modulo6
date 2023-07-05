package exercicio10

fun main() {
    println("Digite o primeiro valor: ")
    val valor1 = readln().toInt()
    println("Digite o segundo valor: ")
    val valor2 = readln().toInt()
    if (saoIguais(valor1,valor2)) println("Os valores são iguais")
    else println("Os valores são diferentes")
}
fun saoIguais(valor1:Int,valor2:Int):Boolean{
    return valor1 == valor2
}