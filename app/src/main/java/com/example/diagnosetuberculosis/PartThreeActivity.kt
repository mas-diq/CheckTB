package com.example.diagnosetuberculosis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.databinding.ActivityPartThreeBinding

class PartThreeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}