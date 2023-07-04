package exercicio9

fun main() {
    println("Digite a temperatura em Celsius: ")
    val temperatura = readln().toDouble()
    println("A temperatura $temperatura em celsius corresponde a ${converteTemp(temperatura)} em Fahrenheit")
}

fun converteTemp(temperatura:Double):Double{
    return (9*temperatura+160)/5
}