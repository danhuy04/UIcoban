package com.example.uicoban.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.uicoban.navigation.Screen

@Composable
fun ComponentsListScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "UI Components List")
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Text(text = "Display")
        
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                ComponentCard(
                    title = "Text",
                    description = "Displays text",
                    onClick = { navController.navigate(Screen.TextDetail.route) }
                )
            }
            
            item {
                ComponentCard(
                    title = "Image",
                    description = "Displays an image",
                    onClick = { }
                )
            }
            
            item {
                Text(text = "Input", modifier = Modifier.padding(vertical = 8.dp))
            }
            
            item {
                ComponentCard(
                    title = "TextField",
                    description = "Input field for text",
                    onClick = { }
                )
            }
            
            item {
                ComponentCard(
                    title = "PasswordField",
                    description = "Input field for passwords",
                    onClick = { }
                )
            }
            
            item {
                Text(text = "Layout", modifier = Modifier.padding(vertical = 8.dp))
            }
            
            item {
                ComponentCard(
                    title = "Column",
                    description = "Arranges elements vertically",
                    onClick = { }
                )
            }
            
            item {
                ComponentCard(
                    title = "Row",
                    description = "Arranges elements horizontally",
                    onClick = { }
                )
            }
        }
    }
}

@Composable
fun ComponentCard(
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(
            containerColor = Color(0x4D2196F3) // Màu #2196F34D
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = title)
            Text(text = description)
        }
    }
} 