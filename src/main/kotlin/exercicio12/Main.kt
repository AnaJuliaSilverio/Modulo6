package exercicio12

import java.time.LocalDate

fun main() {
    println("Em qual ano você nasceu?")
    var anoNascimento = readln().toInt()
    var anoAtual = LocalDate.now().year
    var idade =0
    while (anoNascimento<anoAtual){
        println("Em $anoNascimento você tinha $idade anos")
        idade++
        anoNascimento++

    }
}