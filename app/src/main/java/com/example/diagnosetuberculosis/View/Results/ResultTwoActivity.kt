package com.example.diagnosetuberculosis.View.Results

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diagnosetuberculosis.View.Articles.ArticlesAdapter
import com.example.diagnosetuberculosis.View.Articles.Objects.*
import com.example.diagnosetuberculosis.View.MainActivity
import com.example.diagnosetuberculosis.databinding.ActivityResultTwoBinding

class ResultTwoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundleDataResults = intent.extras
        changeContent(bundleDataResults)

        binding.btnSelanjutnya.button.text = "Kembali ke beranda"
        binding.btnSelanjutnya.button.setOnClickListener() {
            val move = Intent(this, MainActivity::class.java)
            startActivity(move)
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun changeContent(bundleDataResults: Bundle?) {
        if (bundleDataResults != null) {
            val tbParu = bundleDataResults.getString("tbParu")?.toDouble()
            val tbKelenjar = bundleDataResults.getString("tbKelenjar")?.toDouble()
            val tbPayudara = bundleDataResults.getString("tbPayudara")?.toDouble()
            val tbTulang = bundleDataResults.getString("tbTulang")?.toDouble()
            val tbOtak = bundleDataResults.getString("tbOtak")?.toDouble()

            if (tbParu != null && tbKelenjar != null && tbPayudara != null && tbTulang != null && tbOtak != null) {
                if (tbParu > tbKelenjar && tbParu > tbPayudara && tbParu > tbTulang && tbParu > tbOtak) {
                    binding.tvPersentages.text = "$tbParu%"
                    binding.tvValue.text = "Tuberkulosis Paru-Paru"
                    getDataParu()
                } else if (tbKelenjar > tbPayudara && tbKelenjar > tbTulang && tbKelenjar > tbOtak) {
                    binding.tvPersentages.text = "$tbKelenjar%"
                    binding.tvValue.text = "Tuberkulosis Kelenjar Getah Bening"
                    binding.tvValue.setLines(2)
                    getDataKelenjar()
                } else if (tbPayudara > tbTulang && tbPayudara > tbOtak) {
                    binding.tvPersentages.text = "$tbPayudara%"
                    binding.tvValue.text = "Tuberkulosis Payudara"
                    getDataPayudara()
                } else if (tbTulang > tbOtak) {
                    binding.tvPersentages.text = "$tbTulang%"
                    binding.tvValue.text = "Tuberkulosis Tulang Belakang"
                    getDataTulang()
                } else {
                    binding.tvPersentages.text = "$tbOtak%"
                    binding.tvValue.text = "Tuberkulosis Otak"
                    getDataOtak()
                }

            } else {
                Log.i("Data Results = ", "TERDAPAT DATA KOSONG!")
            }
        } else {
            Log.i("Data Results = ", "DATA KOSONG!")
        }
    }

    private fun getDataParu() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticleParu.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }

    private fun getDataKelenjar() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticleKelenjar.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }

    private fun getDataPayudara() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticlePayudara.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }

    private fun getDataTulang() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticleTulang.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }

    private fun getDataOtak() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticleOtak.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }


}