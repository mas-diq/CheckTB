package com.example.diagnosetuberculosis.View.Questions

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isNotEmpty
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
            val question_11 = when (binding.question11.rbGroup.isNotEmpty()) {
                binding.question11.PastiTidak.isChecked -> "PastiTidak"
                binding.question11.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question11.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question11.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question11.TidakTahu.isChecked -> "TidakTahu"
                binding.question11.Mungkin.isChecked -> "Mungkin"
                binding.question11.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question11.HampirPasti.isChecked -> "HampirPasti"
                binding.question11.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_12 = when (binding.question12.rbGroup.isNotEmpty()) {
                binding.question12.PastiTidak.isChecked -> "PastiTidak"
                binding.question12.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question12.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question12.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question12.TidakTahu.isChecked -> "TidakTahu"
                binding.question12.Mungkin.isChecked -> "Mungkin"
                binding.question12.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question12.HampirPasti.isChecked -> "HampirPasti"
                binding.question12.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_13 = when (binding.question13.rbGroup.isNotEmpty()) {
                binding.question13.PastiTidak.isChecked -> "PastiTidak"
                binding.question13.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question13.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question13.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question13.TidakTahu.isChecked -> "TidakTahu"
                binding.question13.Mungkin.isChecked -> "Mungkin"
                binding.question13.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question13.HampirPasti.isChecked -> "HampirPasti"
                binding.question13.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_14 = when (binding.question14.rbGroup.isNotEmpty()) {
                binding.question14.PastiTidak.isChecked -> "PastiTidak"
                binding.question14.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question14.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question14.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question14.TidakTahu.isChecked -> "TidakTahu"
                binding.question14.Mungkin.isChecked -> "Mungkin"
                binding.question14.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question14.HampirPasti.isChecked -> "HampirPasti"
                binding.question14.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_15 = when (binding.question15.rbGroup.isNotEmpty()) {
                binding.question15.PastiTidak.isChecked -> "PastiTidak"
                binding.question15.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question15.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question15.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question15.TidakTahu.isChecked -> "TidakTahu"
                binding.question15.Mungkin.isChecked -> "Mungkin"
                binding.question15.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question15.HampirPasti.isChecked -> "HampirPasti"
                binding.question15.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_16 = when (binding.question16.rbGroup.isNotEmpty()) {
                binding.question16.PastiTidak.isChecked -> "PastiTidak"
                binding.question16.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question16.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question16.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question16.TidakTahu.isChecked -> "TidakTahu"
                binding.question16.Mungkin.isChecked -> "Mungkin"
                binding.question16.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question16.HampirPasti.isChecked -> "HampirPasti"
                binding.question16.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_17 = when (binding.question17.rbGroup.isNotEmpty()) {
                binding.question17.PastiTidak.isChecked -> "PastiTidak"
                binding.question17.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question17.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question17.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question17.TidakTahu.isChecked -> "TidakTahu"
                binding.question17.Mungkin.isChecked -> "Mungkin"
                binding.question17.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question17.HampirPasti.isChecked -> "HampirPasti"
                binding.question17.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_18 = when (binding.question18.rbGroup.isNotEmpty()) {
                binding.question18.PastiTidak.isChecked -> "PastiTidak"
                binding.question18.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question18.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question18.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question18.TidakTahu.isChecked -> "TidakTahu"
                binding.question18.Mungkin.isChecked -> "Mungkin"
                binding.question18.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question18.HampirPasti.isChecked -> "HampirPasti"
                binding.question18.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_19 = when (binding.question19.rbGroup.isNotEmpty()) {
                binding.question19.PastiTidak.isChecked -> "PastiTidak"
                binding.question19.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question19.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question19.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question19.TidakTahu.isChecked -> "TidakTahu"
                binding.question19.Mungkin.isChecked -> "Mungkin"
                binding.question19.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question19.HampirPasti.isChecked -> "HampirPasti"
                binding.question19.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_20 = when (binding.question20.rbGroup.isNotEmpty()) {
                binding.question20.PastiTidak.isChecked -> "PastiTidak"
                binding.question20.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question20.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question20.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question20.TidakTahu.isChecked -> "TidakTahu"
                binding.question20.Mungkin.isChecked -> "Mungkin"
                binding.question20.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question20.HampirPasti.isChecked -> "HampirPasti"
                binding.question20.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_21 = when (binding.question21.rbGroup.isNotEmpty()) {
                binding.question21.PastiTidak.isChecked -> "PastiTidak"
                binding.question21.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question21.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question21.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question21.TidakTahu.isChecked -> "TidakTahu"
                binding.question21.Mungkin.isChecked -> "Mungkin"
                binding.question21.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question21.HampirPasti.isChecked -> "HampirPasti"
                binding.question21.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }

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
            }
            question14.apply {
                textNomor.text = "Pertanyaan 14"
                textPertanyaan.text =
                    "Benjolan kelenjar pecah dan mengeluarkan cairan seperti nanah kotor."
            }
            question15.apply {
                textNomor.text = "Pertanyaan 15"
                textPertanyaan.text =
                    "Terdapat luka pada jaringan kulit atau kulit yang disebabkan pecahnya benjolan kelenjar getah bening."
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
            }
        }
    }
}