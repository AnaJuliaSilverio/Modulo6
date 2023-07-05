package exercicio4

class PetShop(var qtdAnimais:Int) {
    private var gatos = 0
    private var cachorro = 0
    private var tipo = ""

    fun adicionaAnimal() {
        var cont = 0
        while (cont<qtdAnimais){
            println("Qual animal deseja adicionar:\n1-Cachorro\n2-Gato")
            when (readln()) {
                "2" -> {
                    tipo = "Gato"
                    gatos++
                }
                "1" -> {
                    tipo = "Cachorro"
                    cachorro++
                }
                else ->{println("Opcao Invalida")
                cont--}
            }
            cont++
        }
    }

    fun infoPetShop(){
        println("Número de gatos: $gatos")
        println("Número de cachorros: $cachorro")
    }

}