package com.adammcneilly.composingwithconfidence

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.adammcneilly.composingwithconfidence.home.HomeScreen
import com.adammcneilly.composingwithconfidence.login.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            Scaffold { paddingValues ->
                NavHost(
                    navController = navController,
                    startDestination = "login",
                    modifier = Modifier.padding(paddingValues),
                ) {
                    composable("login") {
                        LoginScreen(
                            onLoginClicked = {
                                navController.navigate("home")
                            }
                        )
                    }

                    composable("home") {
                        HomeScreen()
                    }
                }
            }
        }
    }
}
