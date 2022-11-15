package com.example.madpractical3_20012011049

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012011049.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val login=findViewById<Button>(R.id.login)
        val register=findViewById<Button>(R.id.register)

        login.setOnClickListener {
            val intent1 = Intent(this,LoginActivity::class.java)
            startActivity(intent1)
        }
        register.setOnClickListener {
            val intent2 = Intent(this, RegistrationActivity::class.java)
            startActivity(intent2)
        }

        setSupportActionBar(binding.toolbar)
    }
}