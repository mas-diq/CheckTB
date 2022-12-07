package com.example.diagnosetuberculosis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.databinding.ActivityPartThreeBinding

class PartThreeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        changeContent()
    }

    private fun changeContent() {
        binding.apply {
            question22.apply {
                textNomor.text = "Pertanyaan 22"
                textPertanyaan.text =
                    "Rasa nyeri pada punggung berkurang bila penderita beristirat."
            }
            question23.apply {
                textNomor.text = "Pertanyaan 23"
                textPertanyaan.text =
                    "Timbulnya benjolan di bagian punggung/tulang belakang."
            }
            question24.apply {
                textNomor.text = "Pertanyaan 24"
                textPertanyaan.text =
                    "Sakit kepala terus menerus."
            }
            question25.apply {
                textNomor.text = "Pertanyaan 25"
                textPertanyaan.text = "Mual dan muntah."
            }
            question26.apply {
                textNomor.text = "Pertanyaan 26"
                textPertanyaan.text = "Timbulnya benjolan di payudara."
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
            }
            question31.apply {
                textNomor.text = "Pertanyaan 31"
                textPertanyaan.text =
                    "Mulut miring."
            }
            question32.apply {
                textNomor.text = "Pertanyaan 31"
                textPertanyaan.text =
                    "Gangguan pada penglihatan."
            }
        }
    }
}