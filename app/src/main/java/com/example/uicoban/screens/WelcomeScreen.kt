package com.example.uicoban.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.uicoban.R
import com.example.uicoban.navigation.Screen

@Composable
fun WelcomeScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(width = 216.dp, height = 233.dp),
                contentScale = ContentScale.Fit
            )
            
            Spacer(modifier = Modifier.height(32.dp))
            
            Text(
                text = "Jetpack Compose",
                textAlign = TextAlign.Center
            )
            
            Text(
                text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center
            )
        }

        Button(
            onClick = { navController.navigate(Screen.ComponentsList.route) },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 32.dp)
                .size(width = 315.dp, height = 52.dp)
                .shadow(
                    elevation = 100.dp,
                    shape = RoundedCornerShape(50.dp),
                    ambientColor = Color(0x1A2196F3),
                    spotColor = Color(0x1A2196F3)
                ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0x1A2196F3)
            ),
            shape = RoundedCornerShape(50.dp)
        ) {
            Text("I'm ready", color = Color.Black)
        }
    }
} 