package entities

import entities.*

class ControllerCliente {

    val Clientelist = mutableListOf<Cliente>()

    fun registerCliente(){

        println("Selecciona un Cliente para registrar ")
        println("1 Cliente Individual")
        println("2 Cliente Doble")
        println("3 Cliente Suit")

        val selectedOption = readln().toInt()
        when (selectedOption) {
            1 -> registerClienteIndividual()
            2 -> registerDoble()
            3 -> registerSuit()

        }

    }


    private fun registerClienteIndividual() {

        println("Ingrese el numero")
        val numeroHabitacion = readln().toInt()
        println("Ingrese la capacidad de personas")
        val capacidaddeoersonas = readln().toInt()
        println("ingrear precio por noche")
        val preciopornoche = readln().toInt()


        val Individual = HabitacionIndividual(Unacama = )

        C.add(Individual)

class Clientecontroller {
}

class Clientecontroller {
}