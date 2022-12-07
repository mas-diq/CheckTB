package com.example.diagnosetuberculosis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.databinding.ActivityPartTwoBinding

class PartTwoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnNext()
        changeContent()
    }

    private fun btnNext() {
        binding.buttonNext.setOnClickListener {
            val move = Intent(this, PartThreeActivity::class.java)
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