package entities

class ClienteDoble(
    nombre:String,
    telefono:Long,
    correo:String,
    Numerosocial:String,
    val Pareja: Int
    ) : Cliente(nombre, telefono, correo, Numerosocial)

