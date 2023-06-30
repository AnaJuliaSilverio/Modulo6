package exercicio8

fun main() {
    println("Qual a posição do valor Fibonnaci desejado?")
    val posicao = readln().toInt()
    println("Fib($posicao) = ${calculaFibonnaci(posicao)}")
}
fun calculaFibonnaci(posicao:Int):Int{
    var primeiroTermo = 0
    var segundoTermo = 1
    var terceiroTermo = 0
    var cont = 2
    while (cont<=posicao){
        terceiroTermo = primeiroTermo+segundoTermo
        primeiroTermo = segundoTermo
        segundoTermo = terceiroTermo
        cont++
    }
    return terceiroTermo
}