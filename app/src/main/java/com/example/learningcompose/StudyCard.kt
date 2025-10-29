package com.example.learningcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learningcompose.ui.theme.LearningComposeTheme

data class StudyMessage(val author: String, val body: String)

@Composable
fun StudyCard(msg: StudyMessage) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Foto de perfil da autora",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                text = msg.author,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(4.dp))
            Surface(
                shape = MaterialTheme.shapes.medium,
                shadowElevation = 1.dp,
                color = MaterialTheme.colorScheme.surfaceVariant
            ) {
                Text(
                    text = msg.body,
                    modifier = Modifier.padding(all = 8.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStudyCard() {
    LearningComposeTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            StudyCard(
                msg = StudyMessage(
                    author = "Beatris",
                    body = "O aprendizado de hoje é sobre como criar interfaces modernas com Material Design e Compose!"
                )
            )
        }
    }
}
