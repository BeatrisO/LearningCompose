import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningcompose.SampleData
import com.example.learningcompose.StudyCard
import com.example.learningcompose.StudyMessage
import com.example.learningcompose.ui.theme.LearningComposeTheme

@Composable
fun Conversation(messages: List<StudyMessage>) {
    LazyColumn {
        items(messages) { message ->
            StudyCard(msg = message)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewConversation() {
    LearningComposeTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}
