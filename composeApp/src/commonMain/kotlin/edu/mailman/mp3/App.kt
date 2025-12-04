package edu.mailman.mp3

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import chaintech.videoplayer.host.MediaPlayerHost
import chaintech.videoplayer.ui.audio.AudioPlayerComposable
import chaintech.videoplayer.model.AudioFile
import mp3player.composeapp.generated.resources.Res

@Composable
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "My Multiplatform Player",
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(24.dp))

            // The Media Player Component
            // This works on Android, iOS, Desktop (Windows/Mac/Linux), and Web
            AudioPlayerComposable(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                playerHost = MediaPlayerHost(
                    Res.getUri("files/sample.mp3"),
                ),
                audios = listOf(
                    AudioFile(
                        audioUrl = Res.getUri("files/sample.mp3"),
                        audioTitle = "Carousel Music"
                    )
                )
            )
        }
    }
}