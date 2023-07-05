package exercicio9

class Funcionario {
    var nome =""
    var mesesServico = 0
    var listaFuncionario = arrayOf<Funcionario>()
    var qtdFuncionario = 0
    var qtdFuncionarioFerias = 0

    fun inserirFuncionarios(){
        for (i in 0 until qtdFuncionario){
            println("Digite o funcionario ${i+1}")
            val funcionario = Funcionario()
            println("Digite o nome: ")
            funcionario.nome =readln()
            println("Digite o tempo de serviço(em meses): ")
            funcionario.mesesServico =readln().toInt()
            listaFuncionario = listaFuncionario.plus(funcionario)
            funcionario.ferias()
        }
    }

    private fun ferias(){
        if (mesesServico >=12) {
            println("$nome tem direito a férias\n")
        }
        else println("$nome não tem direito a férias\n")
    }
    fun infoFerias(){
        for (i in listaFuncionario.indices){
            if (listaFuncionario[i].mesesServico >=12) qtdFuncionarioFerias++
        }
        println("$qtdFuncionarioFerias tem direito a férias")
        println("${listaFuncionario.size - qtdFuncionarioFerias} não tem direiro a férias")
    }

}