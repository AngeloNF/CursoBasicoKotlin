package model

class ListRecipes {
    var listRecipes = ArrayList<Recipe>()

      fun add(recipe: Recipe): Boolean {
        for (i in listRecipes)
            if (i.name == recipe.name){
                return false
            }
        listRecipes.add(recipe)
        return true
    }

    fun viewAll():ArrayList<Recipe>?{
        return if(listRecipes.isEmpty())
            null
        else
            listRecipes
    }

     fun remove(recipe: Recipe): Boolean {
         for (i in listRecipes)
             if (i.name == recipe.name) {
                 listRecipes.remove(i)
                 return true
             }
         return false
     }


}