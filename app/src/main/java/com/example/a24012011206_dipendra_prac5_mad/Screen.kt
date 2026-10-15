package com.example.a24012011206_dipendra_prac5_mad

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Registration : Screen("registration")
    object CheckBoxLevel : Screen("checkbox_level")
}
