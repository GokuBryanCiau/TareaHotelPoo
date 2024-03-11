package entities

import entities.Habitacion

class HabitacionSuit(
    numero: Int,
    capacidaddepersonas: Int,
    precioNoche: Double,
    val HasJacuzzi : Boolean = true
) : Habitacion(numero, capacidaddepersonas, precioNoche)



