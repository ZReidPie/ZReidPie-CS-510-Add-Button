package com.example.buttonhelloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.buttonhelloworld.ui.theme.ButtonHelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ButtonHelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    // Declare a state to track whether the button has been clicked
    var isButtonClicked by remember { mutableStateOf(false) }

    // Column to place elements vertically
    Column(modifier = modifier) {
        // Only show the text "Hello World" when the button is clicked
        if (isButtonClicked) {
            Text(text = "Hello World!")
        }

        // Button
        Button(onClick = {
            // Set the state to true when the button is clicked
            isButtonClicked = true
        }) {
            Text("Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ButtonHelloWorldTheme {
        Greeting()
    }
}
