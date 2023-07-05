package exercicio5

import java.time.LocalDateTime

fun main() {
    println("Digite seu nome: ")
    saudacoes(readln())
}
fun saudacoes(nome:String){
    val hora = LocalDateTime.now().hour
    var turno: String
    if (hora in 7..11) turno = "Bom dia"
    else if (hora in 12..18) turno = "Boa tarde"
    else turno = "Boa noite"
    println("$turno, $nome")
}