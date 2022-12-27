package com.example.diagnosetuberculosis.View.Questions

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isNotEmpty
import com.example.diagnosetuberculosis.View.LoadingActivity
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
            val question_22 = when (binding.question22.rbGroup.isNotEmpty()) {
                binding.question22.PastiTidak.isChecked -> "PastiTidak"
                binding.question22.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question22.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question22.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question22.TidakTahu.isChecked -> "TidakTahu"
                binding.question22.Mungkin.isChecked -> "Mungkin"
                binding.question22.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question22.HampirPasti.isChecked -> "HampirPasti"
                binding.question22.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_23 = when (binding.question23.rbGroup.isNotEmpty()) {
                binding.question23.PastiTidak.isChecked -> "PastiTidak"
                binding.question23.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question23.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question23.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question23.TidakTahu.isChecked -> "TidakTahu"
                binding.question23.Mungkin.isChecked -> "Mungkin"
                binding.question23.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question23.HampirPasti.isChecked -> "HampirPasti"
                binding.question23.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_24 = when (binding.question24.rbGroup.isNotEmpty()) {
                binding.question24.PastiTidak.isChecked -> "PastiTidak"
                binding.question24.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question24.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question24.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question24.TidakTahu.isChecked -> "TidakTahu"
                binding.question24.Mungkin.isChecked -> "Mungkin"
                binding.question24.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question24.HampirPasti.isChecked -> "HampirPasti"
                binding.question24.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_25 = when (binding.question25.rbGroup.isNotEmpty()) {
                binding.question25.PastiTidak.isChecked -> "PastiTidak"
                binding.question25.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question25.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question25.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question25.TidakTahu.isChecked -> "TidakTahu"
                binding.question25.Mungkin.isChecked -> "Mungkin"
                binding.question25.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question25.HampirPasti.isChecked -> "HampirPasti"
                binding.question25.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_26 = when (binding.question26.rbGroup.isNotEmpty()) {
                binding.question26.PastiTidak.isChecked -> "PastiTidak"
                binding.question26.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question26.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question26.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question26.TidakTahu.isChecked -> "TidakTahu"
                binding.question26.Mungkin.isChecked -> "Mungkin"
                binding.question26.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question26.HampirPasti.isChecked -> "HampirPasti"
                binding.question26.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_27 = when (binding.question27.rbGroup.isNotEmpty()) {
                binding.question27.PastiTidak.isChecked -> "PastiTidak"
                binding.question27.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question27.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question27.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question27.TidakTahu.isChecked -> "TidakTahu"
                binding.question27.Mungkin.isChecked -> "Mungkin"
                binding.question27.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question27.HampirPasti.isChecked -> "HampirPasti"
                binding.question27.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_28 = when (binding.question28.rbGroup.isNotEmpty()) {
                binding.question28.PastiTidak.isChecked -> "PastiTidak"
                binding.question28.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question28.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question28.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question28.TidakTahu.isChecked -> "TidakTahu"
                binding.question28.Mungkin.isChecked -> "Mungkin"
                binding.question28.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question28.HampirPasti.isChecked -> "HampirPasti"
                binding.question28.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_29 = when (binding.question29.rbGroup.isNotEmpty()) {
                binding.question29.PastiTidak.isChecked -> "PastiTidak"
                binding.question29.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question29.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question29.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question29.TidakTahu.isChecked -> "TidakTahu"
                binding.question29.Mungkin.isChecked -> "Mungkin"
                binding.question29.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question29.HampirPasti.isChecked -> "HampirPasti"
                binding.question29.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_30 = when (binding.question30.rbGroup.isNotEmpty()) {
                binding.question30.PastiTidak.isChecked -> "PastiTidak"
                binding.question30.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question30.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question30.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question30.TidakTahu.isChecked -> "TidakTahu"
                binding.question30.Mungkin.isChecked -> "Mungkin"
                binding.question30.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question30.HampirPasti.isChecked -> "HampirPasti"
                binding.question30.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_31 = when (binding.question31.rbGroup.isNotEmpty()) {
                binding.question31.PastiTidak.isChecked -> "PastiTidak"
                binding.question31.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question31.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question31.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question31.TidakTahu.isChecked -> "TidakTahu"
                binding.question31.Mungkin.isChecked -> "Mungkin"
                binding.question31.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question31.HampirPasti.isChecked -> "HampirPasti"
                binding.question31.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_32 = when (binding.question32.rbGroup.isNotEmpty()) {
                binding.question32.PastiTidak.isChecked -> "PastiTidak"
                binding.question32.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question32.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question32.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question32.TidakTahu.isChecked -> "TidakTahu"
                binding.question32.Mungkin.isChecked -> "Mungkin"
                binding.question32.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question32.HampirPasti.isChecked -> "HampirPasti"
                binding.question32.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }

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
            val move = Intent(this, LoadingActivity::class.java)
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
            }
            question23.apply {
                textNomor.text = "Pertanyaan 23"
                textPertanyaan.text = "Timbulnya benjolan di bagian punggung / tulang belakang."
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
                textPertanyaan.text = "Kejang-kejang."
            }
            question30.apply {
                textNomor.text = "Pertanyaan 30"
                textPertanyaan.text = "Tangan dan kaki sulit digerakkan."
            }
            question31.apply {
                textNomor.text = "Pertanyaan 31"
                textPertanyaan.text = "Mulut miring."
            }
            question32.apply {
                textNomor.text = "Pertanyaan 32"
                textPertanyaan.text = "Gangguan pada penglihatan."
            }
        }
    }
}