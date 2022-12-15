package com.example.diagnosetuberculosis.View

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diagnosetuberculosis.View.Articles.ArticlesActivity
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

        binding.btnArtikel.button.setOnClickListener {
            val move = Intent(this, ArticlesActivity::class.java)
            startActivity(move)
        }
    }
}