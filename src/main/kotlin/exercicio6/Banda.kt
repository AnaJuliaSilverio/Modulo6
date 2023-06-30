package exercicio6

class Banda(val nomeBanda:String) {
    var array = arrayOf<String>()
    fun insereMusicasALista(){
        for (i in 0..2 ) {
            println("Digite a musíca: ")
            val intOutput = readln()
            array = array.plus(intOutput)
        }
    }
    fun imprimeInfoBanda(){
        println("----------NOME DA BANDA--------")
        println(nomeBanda)
        println("----------MÚSICAS--------")
        for (x in array){
            println(x)
        }
    }
}