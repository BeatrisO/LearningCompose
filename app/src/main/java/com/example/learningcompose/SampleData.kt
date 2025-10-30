package com.example.learningcompose

object SampleData {
    val conversationSample = listOf(
        StudyMessage("Lexi", "Test...Test...Test..."),
        StudyMessage(
            "Lexi",
            """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trimMargin()
        ),
        StudyMessage(
            "Lexi",
            """I think Kotlin is my favorite programming language.
            |It's so much fun!""".trimMargin()
        ),
        StudyMessage("Lexi", "Searching for alternatives to XML layouts..."),
        StudyMessage(
            "Lexi",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's Android’s modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trimMargin()
        ),
        StudyMessage("Lexi", "It's available from API 21+ :)"),
        StudyMessage("Lexi", "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"),
        StudyMessage("Lexi", "Android Studio next version's name is Arctic Fox"),
        StudyMessage("Lexi", "Android Studio Arctic Fox tooling for Compose is top notch ^_^"),
        StudyMessage("Lexi", "You can now run the emulator directly from Android Studio!"),
        StudyMessage("Lexi", "Compose Previews are great to check how a composable layout looks!"),
        StudyMessage("Lexi", "Previews are interactive after enabling the experimental setting."),
        StudyMessage("Lexi", "Have you tried writing build.gradle with KTS?")
    )
}
