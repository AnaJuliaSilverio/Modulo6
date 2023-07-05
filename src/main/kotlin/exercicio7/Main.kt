package exercicio7

fun main() {
    println("Quantas turmas deseja adicionar: ")
    var turmas = arrayOf<Turma>()
    val qtdTurma = readln().toInt()
    for (i in 0 until qtdTurma){
        println("TURMA ${i+1}")
        val turma = Turma()
        turma.adicionarAluno()
        turmas = turmas.plus(turma)
        println()
    }
    for (i in 0 until qtdTurma){
        println("TURMA ${i+1}")
        turmas[i].mediaTurma()
    }

}