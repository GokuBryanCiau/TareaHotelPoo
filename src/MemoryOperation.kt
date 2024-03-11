class MemoryOperation(
    val Cliente: Int,
    val Habitacion:  Int,
    val TipeData: String,
    val Reservas:  Long,

) {

    fun getFullOperation(): String {
         return "$Cliente $TipeData $Habitacion = $Reservas"
    }
}
