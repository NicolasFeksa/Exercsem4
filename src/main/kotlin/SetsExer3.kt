/*
fun main() {
    val numeros = setOf(1,2,3,4,5)
    val numeros2 = numeros.toList()
    println(numeros2)

}

 */
//2
/*
fun main() {
    val conjunto = setOf("a", "b", "c")
    if ("b" in conjunto) {
        println("O conjunto contém o elemento 'b'")
    }
}

 */
//3
fun main() {
    val mySet = mutableSetOf(1, 2, 3, 4, 5)
    val elementToRemove = 3
    val result = mySet.remove(elementToRemove)
    println("Elemento $elementToRemove removido? $result")
    println(mySet)
}
