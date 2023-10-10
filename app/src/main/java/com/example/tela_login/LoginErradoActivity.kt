package com.example.tela_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tela_login.databinding.ActivityLoginErradoBinding
import com.example.tela_login.databinding.ActivityLoginOkBinding

class LoginErradoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginErradoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErradoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener {
            finish()
        }
    }
}