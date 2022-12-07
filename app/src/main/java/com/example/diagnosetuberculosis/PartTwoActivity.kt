package com.example.diagnosetuberculosis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.databinding.ActivityPartTwoBinding

class PartTwoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartTwoBinding.inflate(layoutInflater)
    }
}