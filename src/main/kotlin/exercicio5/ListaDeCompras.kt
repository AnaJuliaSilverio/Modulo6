package exercicio5

class ListaDeCompras(var qtdItens:Int) {
    private var array = arrayOf<String>()
    fun insereValoresALista(){
        var temp = qtdItens
        while (temp>0){
            println("Digite seu item: ")
            val  intOutput = readln()
            array = array.plus(intOutput)
            temp--
        }
    }
    fun exibeLista(){
        println("Sua lista de compra é ")
        for (i in array){
            println(i)
        }
    }
}