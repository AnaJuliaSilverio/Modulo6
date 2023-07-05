package exercicio3

fun main() {
    println("Digite quantos produtos são: ")
    val caixa = Caixa(readln().toInt())
    caixa.adicionarPreco()
    println(caixa.precoTotal)
}