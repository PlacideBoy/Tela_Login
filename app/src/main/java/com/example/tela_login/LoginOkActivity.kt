package com.example.tela_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tela_login.databinding.ActivityLoginOkBinding
import com.example.tela_login.databinding.ActivityMainBinding

class LoginOkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginOkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogout.setOnClickListener {
            finish()
        }
    }
}