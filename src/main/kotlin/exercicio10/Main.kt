package exercicio10

fun main() {
    var cont = 1
    var soma = 0

    do {
        soma+=cont
        cont++
    }while (cont<=15)
    println("O resultado da soma é $soma")
}