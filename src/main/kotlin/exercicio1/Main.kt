package exercicio1

fun main() {
    println("Digite um valor: ")
    val valorRecebido = readln().toInt()
    println("A soma de 1 à $valorRecebido é ${somaIntervalo(valorRecebido)}")

}
fun somaIntervalo(valoRecebido:Int):Int{
    var soma = 0
    for (i in 1 ..valoRecebido){
        soma+=i
    }
    return soma
}