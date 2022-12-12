package com.example.diagnosetuberculosis.View.Results

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.databinding.ActivityRecommandationBinding

class RecommandationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecommandationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecommandationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}