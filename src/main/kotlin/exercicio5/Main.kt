package exercicio5

fun main() {
    println("Digite um valor:")
    val valorRecebido = readln().toDouble()
    if (negOuPos(valorRecebido)) println("O valor é positivo")
    else println("O valor é negativo")
}
fun negOuPos(valor:Double):Boolean {
    return valor > 0
}
