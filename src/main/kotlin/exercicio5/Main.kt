package exercicio5

fun main() {
    println("Quantos itens deseja adicionar a sua lista? ")
    val listaDeCompras = ListaDeCompras(readln().toInt())

    listaDeCompras.insereValoresALista()
    listaDeCompras.exibeLista()
}