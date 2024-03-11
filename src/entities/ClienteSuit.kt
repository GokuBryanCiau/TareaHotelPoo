package entities

class ClienteSuit(
     nombre:String,
     telefono:Long,
     correo:String,
     Numerosocial:String,
    val Videojuegos: Double
) : Cliente(nombre, telefono, correo, Numerosocial)

