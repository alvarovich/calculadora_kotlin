fun main() {
    var opcion: Int

    do {
        mostrarMenu()
        opcion = leerOpcion()

        when (opcion) {
            1, 2, 3, 4, 5 -> {
                val a = leerNumero("Introduce el primer número: ")
                val b = leerNumero("Introduce el segundo número: ")

                when (opcion) {
                    1 -> println("El resultado de la suma es: ${a + b}")
                    2 -> println("El resultado de la resta es: ${a - b}")
                    3 -> println("El resultado de la multiplicación es: ${a * b}")
                    4 -> {
                        if (b == 0.0) {
                            println("Error: no se puede dividir entre cero.")
                        } else {
                            println("El resultado de la división es: ${a / b}")
                        }
                    }
                    5 -> {
                        if (b == 0.0) {
                            println("Error: no se puede calcular el resto si el segundo número es cero.")
                        } else {
                            println("El resto de la división es: ${a % b}")
                        }
                    }
                }
            }
            6 -> println("Saliendo de la calculadora. ¡Hasta pronto!")
            else -> println("Error: opción no válida. Elige un número del 1 al 6.")
        }

        println()
    } while (opcion != 6)
}

fun mostrarMenu() {
    println("===== CALCULADORA BÁSICA =====")
    println("1. Sumar")
    println("2. Restar")
    println("3. Multiplicar")
    println("4. Dividir")
    println("5. Calcular resto")
    println("6. Salir")
    print("Seleccione una opción: ")
}

fun leerOpcion(): Int {
    val entrada = readln()
    return entrada.trim().toIntOrNull() ?: -1
}

fun leerNumero(mensaje: String): Double {
    while (true) {
        print(mensaje)
        val numero = readln().trim().replace(',', '.').toDoubleOrNull()
        if (numero != null) {
            return numero
        }
        println("Error: introduce un número válido (por ejemplo, 5 o 3.5).")
    }
}