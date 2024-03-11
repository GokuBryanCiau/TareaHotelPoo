package entities

class ClienteIndividual(
      nombre:String,
      telefono:Long,
      correo:String,
      Numerosocial:String,
    val Unapersona: Int
    ) : Cliente(nombre, telefono, correo, Numerosocial)

