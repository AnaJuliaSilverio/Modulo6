package exercicio4

fun main() {
    println("Digite a Temperatura:")
    val valorRecebido = readln().toInt()
    println(informaClima(valorRecebido))
}
fun informaClima(temperatura:Int):String{
    if (temperatura<=18) return "Frio"
    else if (temperatura in 19..23) return "Agradável"
    else if (temperatura in 24..35) return "Quente"
    else return "Muito Quente"
}