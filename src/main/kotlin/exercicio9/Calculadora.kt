package exercicio9

class Calculadora(var primeiroValor:Int,var segundoValor:Int) {
    fun somar():Int{
        return primeiroValor+segundoValor
    }
    fun subtrair():Int{
        return primeiroValor-segundoValor
    }
    fun multiplicar():Int{
        return primeiroValor*segundoValor
    }
    fun dividir():Int{
        if (segundoValor==0){
            println("O segundo valor não pode ser 0")
        }
        return primeiroValor/segundoValor
    }
}