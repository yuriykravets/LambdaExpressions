fun main(args: Array<String>) {

    val coffeeMachine = CoffeeMachine()

    val coffeeType: String = "Americano"
    val filter: (String) -> Unit = { argName: String ->
        println("Filtered $argName.")
    }


    coffeeMachine.prepareToDrink(coffeeType, filter)

}

class CoffeeMachine {

    fun prepareToDrink(
        coffeeType: String,
        myFilter: (String) -> Unit
    ) {
        myFilter.invoke(coffeeType)
        println("Prepared $coffeeType.")
    }

}