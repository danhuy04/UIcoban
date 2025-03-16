package com.example.uicoban

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uicoban.navigation.Screen
import com.example.uicoban.screens.ComponentsListScreen
import com.example.uicoban.screens.TextDetailScreen
import com.example.uicoban.screens.WelcomeScreen
import com.example.uicoban.ui.theme.UIcobanTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIcobanTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    
                    NavHost(
                        navController = navController,
                        startDestination = Screen.Welcome.route
                    ) {
                        composable(Screen.Welcome.route) {
                            WelcomeScreen(navController)
                        }
                        
                        composable(Screen.ComponentsList.route) {
                            ComponentsListScreen(navController)
                        }
                        
                        composable(Screen.TextDetail.route) {
                            TextDetailScreen(navController)
                        }
                    }
                }
            }
        }
    }
}