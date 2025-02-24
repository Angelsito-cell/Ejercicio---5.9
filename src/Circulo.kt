import kotlin.math.PI

class Circulo(private val radio: Double) : Figura() {
    override fun calcularArea(): Double = PI * radio * radio
}
