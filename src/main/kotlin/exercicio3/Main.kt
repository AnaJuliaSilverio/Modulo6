package exercicio3

fun main() {
    println("Digite um valor:")
    val valorRecebido = readln().toInt()
    if (multiploDe5(valorRecebido)) println("O valor é multiplo de 5")
    else println("O valor não é multiplo de 5")

}
fun multiploDe5(valor:Int):Boolean{
    return valor%5==0
}