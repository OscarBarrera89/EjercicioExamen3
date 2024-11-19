package com.oscarbarrera.examenEj3.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.oscarbarrera.examenEj3.ui.screen.HomeScreen
import com.oscarbarrera.examenEj3.ui.screen.Screen1

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Primera) {
        composable<Primera> {
            Screen1 { id ->
                navController.navigate(Home(id))
            }
        }
        composable<Home> { backStackEntry ->
            val home = backStackEntry.toRoute<Home>()
            val id = home.id
            HomeScreen(id)
        }
    }
}