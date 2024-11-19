package com.oscarbarrera.examenEj3.ui.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Screen1(id: (Any) -> Unit) {
    // Aquí va el contenido de la pantalla 1
    Button(onClick = { id(Any()) }) {
        Text("Ir al Home Screen")
    }
}