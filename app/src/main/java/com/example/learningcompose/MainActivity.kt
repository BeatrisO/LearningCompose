package com.example.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                StudyCard(
                    msg = StudyMessage(
                        author = "Beatris",
                        body = "Hoje estou aprendendo a criar layouts com Row e Column no Jetpack Compose!"
                    )
                )
            }
        }
    }
}

data class StudyMessage(val author: String, val body: String)

@Composable
fun StudyCard(msg: StudyMessage) {
    Row(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Foto do perfil",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(text = msg.author,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body,
                fontSize = 14.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStudyCard() {
    StudyCard(
        msg = StudyMessage(
            author = "Beatris",
            body = "Hoje estou aprendendo a criar layouts com Row e Column no Jetpack Compose!"
        )
    )
}