package com.example.wavesoffood

import SignUpScreen
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityLoginBinding
import com.example.wavesoffood.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private val binding: ActivityStartBinding by lazy{
        ActivityStartBinding .inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        //setContentView(R.layout.activity_start)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.button.setOnClickListener{
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}