import model.*

fun main() {
    var recetas = ListRecipes()


    println("Bienvenido a Recipes Maker")

    do {
        print("""Por favor, seleciones la accion que desea realizar
            |1.Crear receta
            |2.Ver recetas
            |3.Modificar recetas
            |4.Eliminar recetas
            |E. Salir
            |
            |Option: 
        """.trimMargin())
        var option:String = readLine()?.toUpperCase() ?: "0"

        when(option){
            "1"->{
                if (recetas.add(Recipe()))
                    println("\n***Agregado correctamente***\n")
                else
                    println("\n***Ya existe una receta con ese nombre.***\n")
            }

            "2"->{
                var result = recetas.viewAll()
                if(result!=null)
                    for (i  in result)
                        println("\n$i\n")

                else
                    println("No se encontraron recetas")
            }
        }

    }while (option != "E")
}


