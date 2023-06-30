package exercicio11

fun main() {
    var soma = 0
    for (i in 1..15){
        println("Digite o $i valor: ")
        val valor = readln().toInt()
        soma+=valor
    }
    println("A média desses valores é ${soma/15}")
}