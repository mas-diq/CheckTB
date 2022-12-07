package com.example.diagnosetuberculosis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.databinding.ActivityPartOneBinding

class PartOneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}