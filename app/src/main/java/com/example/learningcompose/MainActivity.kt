package com.example.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudyMessage("Aprendendo Jetpack Compose")
        }
    }
}

@Composable
fun StudyMessage(mensagem: String) {
    Text(text = " Estudo do dia: $mensagem!")
}

