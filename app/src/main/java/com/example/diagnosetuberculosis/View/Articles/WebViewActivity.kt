package com.example.diagnosetuberculosis.View.Articles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diagnosetuberculosis.databinding.ActivityWebViewBinding


class WebViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.extras?.getString("link") ?: "Kosong"
        val browser = binding.webview
        browser.loadUrl(data)
    }
}