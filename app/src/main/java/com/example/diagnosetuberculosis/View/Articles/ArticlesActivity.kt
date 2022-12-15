package com.example.diagnosetuberculosis.View.Articles

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diagnosetuberculosis.View.MainActivity
import com.example.diagnosetuberculosis.databinding.ActivityArticlesBinding

class ArticlesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArticlesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticlesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext.button.text = "Kembali Ke Beranda"
        binding.buttonNext.button.setOnClickListener {
            val move = Intent(this, MainActivity::class.java)
            startActivity(move)
        }
    }

    override fun onResume() {
        super.onResume()
        binding.recyclerView.adapter = ArticlesAdapter(ArticleGenerator.getArticles())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}