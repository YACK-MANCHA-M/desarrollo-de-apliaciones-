package com.example.myapplication

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.painterResource

import myapplication.shared.generated.resources.Res
import myapplication.shared.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }

    main()
}
fun main() {

    // --- Tipo explícito: yo declaro el tipo ---
    val nombreProducto: String = "Trucha frita"
    val precioUnitario: Double = 24.50
    val stockDisponible: Int = 12
    val estaActivo: Boolean = true
    val inicial: Char = 'T'

    // --- Tipo inferido: Kotlin lo deduce del valor ---
    val categoria = "Platos de fondo" // String
    val descuento = 0.15              // Double
    val vendidosHoy = 7               // Int

    println("Producto: $nombreProducto")
    println("Precio: S/ $precioUnitario")
    println("Stock: $stockDisponible unidades")
    println("Activo: $estaActivo | Inicial: $inicial")
    println("Categoria: $categoria | Descuento: $descuento")
    println("Total del dia: ${precioUnitario * vendidosHoy}")


    val totalVentas = precioUnitario * vendidosHoy


    val stockRestante = stockDisponible - vendidosHoy


    val suma = precioUnitario + descuento


    val precioMitad = precioUnitario / 2


    println("Total de ventas: S/ $totalVentas")
    println("Stock restante: $stockRestante unidades")
    println("Resultado de la suma: $suma")
    println("Mitad del precio: S/ $precioMitad")


    val iva = 0.18
// iva = 0.21 // &lt;- descomente esta línea y observe el error
    var contador = 0
    contador = contador + 1
    contador += 1
    println("Contador: $contador")
}
