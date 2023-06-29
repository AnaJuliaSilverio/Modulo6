package exercicio1

fun main() {
    println("Digite um valor:")
    val valorRecebido = readln().toInt()
    println("O antecessor do valor recebido é : ${meuAntecessor(valorRecebido)}")
}

fun meuAntecessor(valor:Int):Int{
    return valor-1
}