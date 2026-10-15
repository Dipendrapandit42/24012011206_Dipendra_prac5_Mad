package com.example.a24012011206_dipendra_prac5_mad

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun AppNavigation() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Login) }

    when (currentScreen) {
        is Screen.Login -> {
            LoginScreen(
                onNavigateToRegister = {
                    currentScreen = Screen.Registration
                },
                onLoginSuccess = {
                    currentScreen = Screen.CheckBoxLevel
                }
            )
        }
        is Screen.Registration -> {
            RegistrationScreen(
                onNavigateToLogin = {
                    currentScreen = Screen.Login
                },
                onRegisterSuccess = {
                    currentScreen = Screen.CheckBoxLevel
                }
            )
        }
        is Screen.CheckBoxLevel -> {
            CheckBoxLevelScreen(
                onLogout = {
                    currentScreen = Screen.Login
                }
            )
        }
    }
}
