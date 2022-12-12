package com.example.diagnosetuberculosis.View.Results

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.diagnosetuberculosis.databinding.ActivityResultTwoBinding

class ResultTwoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundleDataResults = intent.extras
        changeContent(bundleDataResults)
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
                    binding.tvValue.text = "Tuberculosis Paru-Paru"
                } else if (tbKelenjar > tbPayudara && tbKelenjar > tbTulang && tbKelenjar > tbOtak) {
                    binding.tvPersentages.text = "$tbKelenjar%"
                    binding.tvValue.text = "Tuberculosis Kelenjar Getah Bening"
                    binding.tvValue.setLines(2)
                } else if (tbPayudara > tbTulang && tbPayudara > tbOtak) {
                    binding.tvPersentages.text = "$tbPayudara%"
                    binding.tvValue.text = "Tuberculosis Payudara"
                } else if (tbTulang > tbOtak) {
                    binding.tvPersentages.text = "$tbTulang%"
                    binding.tvValue.text = "Tuberculosis Tulang Belakang"
                } else {
                    binding.tvPersentages.text = "$tbOtak%"
                    binding.tvValue.text = "Tuberculosis Otak"
                }

            } else {
                Log.i("Data Results = ", "TERDAPAT DATA KOSONG!")
            }
        } else {
            Log.i("Data Results = ", "DATA KOSONG!")
        }
    }
}