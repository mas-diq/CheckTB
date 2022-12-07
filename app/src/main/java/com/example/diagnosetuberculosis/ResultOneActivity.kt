package com.example.diagnosetuberculosis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.databinding.ActivityResultOneBinding

class ResultOneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}