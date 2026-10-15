package com.example.a24012011206_dipendra_prac5_mad

import androidx.compose.runtime.Composable

@Composable
fun CheckBoxScreen(
    onLogout: () -> Unit = {}
) {
    CheckBoxLevelScreen(onLogout = onLogout)
}
