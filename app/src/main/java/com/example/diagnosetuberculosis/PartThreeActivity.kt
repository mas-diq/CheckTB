package com.example.diagnosetuberculosis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.diagnosetuberculosis.databinding.ActivityPartThreeBinding

class PartThreeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundleData = intent.extras
        changeContent()
        btnNext(bundleData)
    }

    private fun btnNext(bundleData: Bundle?) {
        binding.buttonNext.button.setOnClickListener() {
            val question_22 = if (binding.question22.Ya.isChecked) "Ya" else "Tidak"
            val question_23 = if (binding.question23.Ya.isChecked) "Ya" else "Tidak"
            val question_24 = if (binding.question24.Ya.isChecked) "Ya" else "Tidak"
            val question_25 = if (binding.question25.Ya.isChecked) "Ya" else "Tidak"
            val question_26 = if (binding.question26.Ya.isChecked) "Ya" else "Tidak"
            val question_27 = if (binding.question27.Ya.isChecked) "Ya" else "Tidak"
            val question_28 = if (binding.question28.Ya.isChecked) "Ya" else "Tidak"
            val question_29 = if (binding.question29.Ya.isChecked) "Ya" else "Tidak"
            val question_30 = if (binding.question30.Ya.isChecked) "Ya" else "Tidak"
            val question_31 = if (binding.question31.Ya.isChecked) "Ya" else "Tidak"
            val question_32 = if (binding.question32.Ya.isChecked) "Ya" else "Tidak"

            bundleData?.apply {
                putString("question_22", question_22)
                putString("question_23", question_23)
                putString("question_24", question_24)
                putString("question_25", question_25)
                putString("question_26", question_26)
                putString("question_27", question_27)
                putString("question_28", question_28)
                putString("question_29", question_29)
                putString("question_30", question_30)
                putString("question_31", question_31)
                putString("question_32", question_32)
            }
            val move = Intent(this, ResultOneActivity::class.java)
            if (bundleData != null) {
                move.putExtras(bundleData)
                Log.i("PartThree = ", bundleData.toString())
            } else {
                Log.i("PartThree = ", "DATA KOSONG!")
            }
            startActivity(move)
        }
    }

    private fun changeContent() {
        binding.apply {
            question22.apply {
                textNomor.text = "Pertanyaan 22"
                textPertanyaan.text =
                    "Rasa nyeri pada punggung berkurang bila penderita beristirat."
                textPertanyaan.setLines(2)
            }
            question23.apply {
                textNomor.text = "Pertanyaan 23"
                textPertanyaan.text = "Timbulnya benjolan di bagian punggung/tulang belakang."
                textPertanyaan.setLines(2)
            }
            question24.apply {
                textNomor.text = "Pertanyaan 24"
                textPertanyaan.text = "Sakit kepala terus menerus."
            }
            question25.apply {
                textNomor.text = "Pertanyaan 25"
                textPertanyaan.text = "Mual dan muntah."
            }
            question26.apply {
                textNomor.text = "Pertanyaan 26"
                textPertanyaan.text = "Timbulnya benjolan di payudara."
                textPertanyaan.setLines(2)
            }
            question27.apply {
                textNomor.text = "Pertanyaan 27"
                textPertanyaan.text = "Bicara meracau."
            }
            question28.apply {
                textNomor.text = "Pertanyaan 28"
                textPertanyaan.text = "Disorientasi."
            }
            question29.apply {
                textNomor.text = "Pertanyaan 29"
                textPertanyaan.text = "Kejang."
            }
            question30.apply {
                textNomor.text = "Pertanyaan 30"
                textPertanyaan.text = "Tangan dan kaki sulit digerakkan."
                textPertanyaan.setLines(2)
            }
            question31.apply {
                textNomor.text = "Pertanyaan 31"
                textPertanyaan.text = "Mulut miring."
            }
            question32.apply {
                textNomor.text = "Pertanyaan 31"
                textPertanyaan.text = "Gangguan pada penglihatan."
                textPertanyaan.setLines(2)
            }
        }
    }
}