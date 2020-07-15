fun main() {
    do {
        println(":: Bienvenido a Recipe Maker ::\n" +
                "\n" +
                "\n" +
                "Selecciona la opción deseada\n" +
                "1. Hacer una receta\n" +
                "2. Ver mis recetas\n" +
                "3. Salir")
        val response: String? = readLine() ?: "0"
        when (response) {
            "1" -> ingredientes()
            "2" -> recetas()
            "3" -> println("Saliendo...")
            else -> print("Seleccione una opcion correcta")
        }
    } while (response != "3")
}

fun ingredientes(){
    println("Haz seleccionado hacer receta\n")
    do {
        println("Esta es la lista de ingredientes:\n" +
                "1. Agua\n" +
                "2. Leche\n" +
                "3. Carne\n" +
                "4. Verduras\n" +
                "5. Frutas\n" +
                "6. Cereal\n" +
                "7. Huevos\n" +
                "8. Aceite\n" +
                "9. Salir")
        val response: String? = readLine() ?: "0"
        when (response) {
            "1" -> println("+1 Agua")
            "2" -> println("+1 Leche")
            "3" -> println("+1 Carne")
            "4" -> println("+1 Verduras")
            "5" -> println("+1 Frutas")
            "6" -> println("+1 Cereal")
            "7" -> println("+1 Huevos")
            "8" -> println("+1 Aceite")
            else -> print("Seleccione una opcion correcta")
        }
    } while (response != "9")
}

fun recetas(){
    do {
        println("Haz seleccionado ver recetas\n" +
                "Esta son las recetas actuales\n" +
                "1.Salir")
        val response: String? = readLine() ?: "0"
        when (response) {
            else -> print("Seleccione una opcion correcta")
        }
    } while (response != "1")
}