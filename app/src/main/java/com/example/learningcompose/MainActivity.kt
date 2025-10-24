package com.example.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudyCard(
                msg = StudyMessage(
                    author = "Beatris",
                    body = "Estou aprendendo sobre funções Composable no Jetpack Compose!"
                )
            )
        }
    }
}

data class StudyMessage(val author: String, val body: String)

    @Composable
    fun StudyCard(msg: StudyMessage) {
        Row {
            Image(
                painter = painterResource(R.drawable.profile_picture),
                contentDescription = "Contact profile picture",
            )
        }
        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewStudyCard() {
        StudyCard(
            msg = StudyMessage(
                author = "Beatris",
                body = "O aprendizado de hoje é sobre como criar interfaces modernas com Compose!"
            )
        )
    }