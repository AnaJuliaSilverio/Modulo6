package exercicio2

fun main(){
    println("Digite seu nome: ")
    val nome = readln()
    println("Digite sua idade: ")
    val idade = readln().toInt()

    val pessoa =Pessoa (nome,idade)
    println(pessoa.nome+", você já viveu ${pessoa.calculaDiasDeVida()} dias")
}