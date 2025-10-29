package com.example.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import com.example.learningcompose.ui.theme.LearningComposeTheme

class ComposeLearningActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LearningComposeTheme {
                Surface(
                    modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    StudyCard(
                        msg = StudyMessage(
                            author = "Beatris",
                            body = "Hoje estou aprendendo sobre como criar layouts com Jetpack Compose!"
                        )
                    )
                }
            }
        }
    }
}
