package com.example.diagnosetuberculosis.View

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diagnosetuberculosis.View.Results.ResultOneActivity
import com.example.diagnosetuberculosis.databinding.ActivityLoadingBinding
import java.util.*
import kotlin.concurrent.schedule

class LoadingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoadingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val move = Intent(this, ResultOneActivity::class.java)
        if (bundle != null) move.putExtras(bundle)

        Timer().schedule(3000) {
            startActivity(move)
        }
    }
}