package exercicio10

fun main() {
    println("Digite um valor:")
    val valorRecebido = readln().toInt()
    println("O sucessor do valor recebido é : ${meuSucessor(valorRecebido)}")
}

fun meuSucessor(valor:Int):Int{
    return valor+1
}