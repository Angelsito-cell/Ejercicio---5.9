fun main() {
    val figuras = listOf(
        Circulo(5.0),
        Rectángulo(4.0, 6.0)
    )

    figuras.forEach { println("Área: ${it.calcularArea()}") }
}
