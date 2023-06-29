package exercicio6

fun main() {
    println("Digite um valor:")
    val valorRecebido = readln().toDouble()
    println("O valor de $ $valorRecebido convertido em reais é ${valorEmReal(valorRecebido)}")
}
fun valorEmReal(valor:Double):Double{
    return (valor*4.86)
}