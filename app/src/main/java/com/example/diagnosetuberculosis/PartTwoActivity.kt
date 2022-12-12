package com.example.diagnosetuberculosis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.diagnosetuberculosis.databinding.ActivityPartTwoBinding

class PartTwoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundleData = intent.extras
        changeContent()
        btnNext(bundleData)
    }

    private fun btnNext(bundleData: Bundle?) {
        binding.buttonNext.button.setOnClickListener() {
            val question_11 = if (binding.question11.Ya.isChecked) "Ya" else "Tidak"
            val question_12 = if (binding.question12.Ya.isChecked) "Ya" else "Tidak"
            val question_13 = if (binding.question13.Ya.isChecked) "Ya" else "Tidak"
            val question_14 = if (binding.question14.Ya.isChecked) "Ya" else "Tidak"
            val question_15 = if (binding.question15.Ya.isChecked) "Ya" else "Tidak"
            val question_16 = if (binding.question16.Ya.isChecked) "Ya" else "Tidak"
            val question_17 = if (binding.question17.Ya.isChecked) "Ya" else "Tidak"
            val question_18 = if (binding.question18.Ya.isChecked) "Ya" else "Tidak"
            val question_19 = if (binding.question19.Ya.isChecked) "Ya" else "Tidak"
            val question_20 = if (binding.question20.Ya.isChecked) "Ya" else "Tidak"
            val question_21 = if (binding.question21.Ya.isChecked) "Ya" else "Tidak"

            bundleData?.apply {
                putString("question_11", question_11)
                putString("question_12", question_12)
                putString("question_13", question_13)
                putString("question_14", question_14)
                putString("question_15", question_15)
                putString("question_16", question_16)
                putString("question_17", question_17)
                putString("question_18", question_18)
                putString("question_19", question_19)
                putString("question_20", question_20)
                putString("question_21", question_21)
            }
            val move = Intent(this, PartThreeActivity::class.java)
            if (bundleData != null) {
                move.putExtras(bundleData)
                Log.i("PartTwo = ", bundleData.toString())
            } else {
                Log.i("PartTwo = ", "DATA KOSONG!")
            }
            startActivity(move)
        }
    }

    private fun changeContent() {
        binding.apply {
            question11.apply {
                textNomor.text = "Pertanyaan 11"
                textPertanyaan.text = "Benjolan kelenjar mudah digerakkan."
            }
            question12.apply {
                textNomor.text = "Pertanyaan 12"
                textPertanyaan.text = "Benjolan kelenjar yang timbul terasa kenyal."
            }
            question13.apply {
                textNomor.text = "Pertanyaan 13"
                textPertanyaan.text =
                    "Membesarnya benjolan kelenjar yang mengakibatkan hari demi hari kondisinya semakin memburuk dan merusak tubuh."
                textPertanyaan.setLines(2)
            }
            question14.apply {
                textNomor.text = "Pertanyaan 14"
                textPertanyaan.text =
                    "Benjolan kelenjar pecah dan mengeluarkan cairan seperti nanah kotor."
                textPertanyaan.setLines(2)
            }
            question15.apply {
                textNomor.text = "Pertanyaan 15"
                textPertanyaan.text =
                    "Terdapat luka pada jaringan kulit atau kulit yang disebabkan pecahnya benjolan kelenjar getah bening."
                textPertanyaan.setLines(2)
            }
            question16.apply {
                textNomor.text = "Pertanyaan 16"
                textPertanyaan.text = "Timbulnya benjolan di payudara."
            }
            question17.apply {
                textNomor.text = "Pertanyaan 17"
                textPertanyaan.text = "Rasa nyeri di bagian payudara."
            }
            question18.apply {
                textNomor.text = "Pertanyaan 18"
                textPertanyaan.text =
                    "Adanya tanda radang di sekitar benjolan yang timbul di payudara."
            }
            question19.apply {
                textNomor.text = "Pertanyaan 19"
                textPertanyaan.text =
                    "Rasa nyeri pada bagian punggung atau mengalami kekakuan punggung."
            }
            question20.apply {
                textNomor.text = "Pertanyaan 20"
                textPertanyaan.text = "Penderita enggan menggerakkan punggungnya."
            }
            question21.apply {
                textNomor.text = "Pertanyaan 21"
                textPertanyaan.text =
                    "Penderita menolak untuk membungkuk atau mengangkat barang dari lantai, bila diminta penderita akan menekuk lututunya agar punggung tetap lurus."
                textPertanyaan.setLines(3)
            }
        }
    }
}