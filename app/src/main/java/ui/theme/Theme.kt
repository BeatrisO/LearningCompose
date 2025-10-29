package com.example.learningcompose.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF6200EE),
    secondary = Color(0xFF03DAC5),
    background = Color(0xFFF2F2F2),
    surfaceVariant = Color(0xFFEDE7F6)
)

@Composable
fun LearningComposeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = androidx.compose.material3.Typography(),
        shapes = androidx.compose.material3.Shapes(),
        content = content
    )
}
