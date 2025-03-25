package com.example.wavesoffood

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Logo Image
        Image(
            painter = painterResource(id = R.drawable.food_logo),
            contentDescription = "App Logo",
            modifier = Modifier.size(120.dp)
        )

        // Text Below the Logo
        Text(
            text = "Welcome to FoodApp",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )

        // Subtitle or Tagline
        Text(
            text = "Delivering Your Favourite Food",
            fontSize = 14.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}
