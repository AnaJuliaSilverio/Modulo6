package exercicio4

fun main() {
    println("Digite quantos animais são: ")
    val petShop = PetShop(readln().toInt())
    petShop.adicionaAnimal()
    petShop.infoPetShop()
}
