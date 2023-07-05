package exercicio7

class Turma {
    var alunos = arrayOf<Double>()

    fun adicionarAluno(){
        println("Quantos Alunos terá a turma: ")
        var qtdAlunos = readln().toInt()
        for (j in 0 until qtdAlunos){
            println("Digite a média do aluno ${j+1}")
            alunos = alunos.plus(readln().toDouble())
        }
    }
    fun mediaTurma(){
        var soma = 0.0
        for (i in alunos.indices){
                soma+=alunos[i]
        }
        println("A média da turma é ${soma/alunos.size}")
    }

}