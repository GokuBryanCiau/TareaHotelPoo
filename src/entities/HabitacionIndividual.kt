package entities


class HabitacionIndividual(
    numero: Int,
    capacidaddepersonas: Int,
    precioNoche: Double,
    val Unacama: Int
) : Habitacion(numero, capacidaddepersonas, precioNoche)
