package model

open class Recipe {
    var name:String?
    var listIngredients = ArrayList<Ingredient>()

    init {
        print("Ingrese el nombre de la receta: ")
        name = readLine()
        print("\nAhora agreguemos los ingredientes:")
        addIngredient()
    }

    fun addIngredient(){
        var types:Types
        var units:Units
        var quantity:Int
        var i:Boolean
        do {
            println("""
|Ingrese el tipo de ingrediente:
|1.Fruta
|2.Verdura
|3.Agua
|4.Aceite
|5.Carne
|6.Grano
|7.Lacteo
            """.trimMargin())
            when(readLine()){
                "1"->types = Types.FRUTA
                "2"->types = Types.VERDURA
                "3"->types = Types.AGUA
                "4"->types = Types.ACEITE
                "5"->types = Types.CARNE
                "6"->types = Types.GRANO
                "7"->types = Types.LACTEO
                else -> types=Types.FRUTA
            }
            println("Ingrese la cantidad")
            quantity= readLine()?.toInt() ?:  1
            println("Ingre el tipo de unidad de medida de la cantidad dicha")
            when(readLine()){
                "1"->units = Units.KG
                "2"->units = Units.G
                "3"->units = Units.L
                "4"->units = Units.ML
                "5"->units = Units.CC
                "6"->units = Units.UNIDAD
                else -> units=Units.UNIDAD
            }
            listIngredients.add(Ingredient(types,quantity,units))
            println("¿Desea agregar mas ingredientes?\n1.Si\n2.No")
            when (readLine()){
                "2" -> i = false
                else -> i = true
            }
        } while (i)


    }

    override fun toString(): String {

        return """Name: $name 
Ingredients: This part is not created.
        """
    }

}