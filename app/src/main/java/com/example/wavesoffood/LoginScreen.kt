package com.example.wavesoffood

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController? = null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo Image
        Image(
            painter = painterResource(id = R.drawable.food_logo),
            contentDescription = "App Logo",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 50.dp)
        )


        Text(
            text = "Waves of Food",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 15.dp)
        )

        // Tagline
        Text(
            text = "Deliver Favourite Food",
            fontSize = 14.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 8.dp)
        )

        // Login Header
        Text(
            text = "Login To Your Account",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 30.dp)
        )

        // Name Label
        Text(
            text = "Name",
            modifier = Modifier.padding(top = 15.dp)
        )

        // Email Input
        var email by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email Address") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email
            )
        )

        // Password Input
        var password by remember { mutableStateOf("") }
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = PasswordVisualTransformation()
        )

        // OR Separator
        Text(
            text = "Or",
            modifier = Modifier.padding(top = 20.dp)
        )

        // Continue With
        Text(
            text = "Continue With",
            modifier = Modifier.padding(top = 15.dp)
        )

        // Social Media Buttons
        Row(
            modifier = Modifier.padding(top = 15.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = { /* Handle Gmail Login */ },
                modifier = Modifier
                    .weight(1f)
                    .height(57.dp)
            ) {
                Icon(painterResource(id = R.drawable.google_icon), contentDescription = "Google")
                Spacer(modifier = Modifier.width(10.dp))
                Text("Gmail")
            }

            Button(
                onClick = { /* Handle Facebook Login */ },
                modifier = Modifier
                    .weight(1f)
                    .height(57.dp)
            ) {
                Icon(painterResource(id = R.drawable.facebook), contentDescription = "Facebook")
                Spacer(modifier = Modifier.width(10.dp))
                Text("Facebook")
            }
        }

        // Login Button
        Button(
            onClick = { /* Handle Login */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            Text("Login")
        }
    }
}
