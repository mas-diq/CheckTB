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
                binding.question11.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question11.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question11.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question11.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question11.Setuju.isChecked -> "Setuju"
                binding.question11.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_12 = when (binding.question12.rbGroup.isNotEmpty()) {
                binding.question12.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question12.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question12.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question12.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question12.Setuju.isChecked -> "Setuju"
                binding.question12.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_13 = when (binding.question13.rbGroup.isNotEmpty()) {
                binding.question13.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question13.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question13.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question13.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question13.Setuju.isChecked -> "Setuju"
                binding.question13.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_14 = when (binding.question14.rbGroup.isNotEmpty()) {
                binding.question14.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question14.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question14.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question14.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question14.Setuju.isChecked -> "Setuju"
                binding.question14.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_15 = when (binding.question15.rbGroup.isNotEmpty()) {
                binding.question15.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question15.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question15.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question15.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question15.Setuju.isChecked -> "Setuju"
                binding.question15.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_16 = when (binding.question16.rbGroup.isNotEmpty()) {
                binding.question16.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question16.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question16.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question16.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question16.Setuju.isChecked -> "Setuju"
                binding.question16.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_17 = when (binding.question17.rbGroup.isNotEmpty()) {
                binding.question17.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question17.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question17.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question17.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question17.Setuju.isChecked -> "Setuju"
                binding.question17.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_18 = when (binding.question18.rbGroup.isNotEmpty()) {
                binding.question18.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question18.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question18.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question18.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question18.Setuju.isChecked -> "Setuju"
                binding.question18.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_19 = when (binding.question19.rbGroup.isNotEmpty()) {
                binding.question19.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question19.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question19.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question19.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question19.Setuju.isChecked -> "Setuju"
                binding.question19.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_20 = when (binding.question20.rbGroup.isNotEmpty()) {
                binding.question20.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question20.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question20.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question20.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question20.Setuju.isChecked -> "Setuju"
                binding.question20.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_21 = when (binding.question21.rbGroup.isNotEmpty()) {
                binding.question21.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question21.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question21.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question21.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question21.Setuju.isChecked -> "Setuju"
                binding.question21.SangatSetuju.isChecked -> "SangatSetuju"
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