package com.example.jetpackcompose_notifications

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcompose_notifications.screens.MainScreen
import com.example.jetpackcompose_notifications.ui.theme.JetpackComposeNotificationsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNotificationsTheme {
                MainScreen()
            }
        }
    }
}

