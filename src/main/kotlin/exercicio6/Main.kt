package exercicio6

fun main() {
    println("Digite o nome da banda")
    val banda = Banda(readln())
    banda.insereMusicasALista()
    banda.imprimeInfoBanda()
}