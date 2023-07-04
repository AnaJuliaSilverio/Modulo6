package exercicio10

fun main() {
    println("Digite a cotação atual:")
    val cotacao = readln().toDouble()
    println("Agora digite o valor em dólares: ")
    val valor = readln().toDouble()
    println("O valor convertido em Reais é ${converteValor(cotacao, valor)}")
}

fun converteValor(cotacao:Double,valor:Double):Double{
    return valor*cotacao
}