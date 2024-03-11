package entities


class HabitacionDoble(
    numero: Int,
    capacidaddepersonas: Int,
    precioNoche: Double,
    val NumeroCuartos: Int,
) : Habitacion(numero, capacidaddepersonas, precioNoche)
