package com.example.wavesoffood
import SignUpScreen
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ Use Jetpack Compose instead of `findViewById`
        setContent {
            SignUpScreenWithInsets()
        }
    }
}

@Composable
fun SignUpScreenWithInsets() {
    val view = LocalView.current

    // ✅ Apply insets dynamically when the view is attached
    ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.updatePadding(top = systemBars.top, bottom = systemBars.bottom)
        insets
    }

    // ✅ Pass insets padding to the screen
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp) // Apply padding if needed
    ) {
       // SignUpScreen(navController)
    }
}
