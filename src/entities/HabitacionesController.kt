package entities

class HabitacionesController {

    val HabitacionesList = mutableListOf<Habitacion>()


    fun registrarHabitaciones() {

        println("Seleccione la Habitacion para registrar")
        println("1. Individual")
        println("2. Doble")
        println("3. Suit")

        val selectedOption = readln().toInt()
        when (selectedOption) {
            1 -> registerIndividual()
            2 -> registerDoble()
            3 -> registerSuit()
        }

    }

    private fun registerIndividual() {

        println("Ingrese el numero")
        val numeroHabitacion = readln().toInt()
        println("Ingrese la capacidad de personas")
        val capacidaddeoersonas = readln().toInt()
        println("ingrear precio por noche")
        val preciopornoche = readln().toInt()


        val Individual = HabitacionIndividual(Unacama = )

        HabitacionesList.add(Individual)

    }

    private fun registerDoble() {

        println("Ingrese el numero")
        val numeroHabitacion = readln().toInt()
        println("Ingrese la capacidad de personas")
        val capacidaddeoersonas = readln().toInt()
        println("ingrear precio por noche")
        val preciopornoche = readln().toInt()


        val Doble = HabitacionDoble(NumeroCuartos = )

        HabitacionesList.add(Doble)

    }

    private fun registerSuit() {

        println("Ingrese el numero")
        val numeroHabitacion = readln().toInt()
        println("Ingrese la capacidad de personas")
        val capacidaddeoersonas = readln().toInt()
        println("ingrear precio por noche")
        val preciopornoche = readln().toInt()


        val Suit = HabitacionSuit(HasJacuzzi = )

        HabitacionesList.add(Suit)

    }

    fun ShowHabitaciones() {

        for (Habitacion in HabitacionesList) {
            when (Habitacion) {
                is HabitacionIndividual -> {
                    Habitacion.Unacama
                }
            }
        }

        for (Habitacion in HabitacionesList) {
            when (Habitacion) {
                is HabitacionDoble -> {
                    Habitacion.NumeroCuartos
                }
            }
        }

        for (Habitacion in HabitacionesList) {
            when (Habitacion) {
                is HabitacionSuit -> {
                    Habitacion.HasJacuzzi
                }
            }
        }
    }
}

