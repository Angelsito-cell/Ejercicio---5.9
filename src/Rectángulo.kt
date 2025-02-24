class Rectángulo(private val base: Double, private val altura: Double) : Figura() {
    override fun calcularArea(): Double = base * altura
}
