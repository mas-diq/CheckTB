package com.example.diagnosetuberculosis.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.View.Questions.PartOneActivity
import com.example.diagnosetuberculosis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSelanjutnya.button.setOnClickListener() {
            val move = Intent(this, PartOneActivity::class.java)
            startActivity(move)
        }
    }
}