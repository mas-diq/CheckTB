package com.example.diagnosetuberculosis.View.Questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isNotEmpty
import com.example.diagnosetuberculosis.View.Results.ResultOneActivity
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
                binding.question22.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question22.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question22.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question22.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question22.Setuju.isChecked -> "Setuju"
                binding.question22.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_23 = when (binding.question23.rbGroup.isNotEmpty()) {
                binding.question23.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question23.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question23.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question23.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question23.Setuju.isChecked -> "Setuju"
                binding.question23.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_24 = when (binding.question24.rbGroup.isNotEmpty()) {
                binding.question24.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question24.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question24.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question24.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question24.Setuju.isChecked -> "Setuju"
                binding.question24.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_25 = when (binding.question25.rbGroup.isNotEmpty()) {
                binding.question25.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question25.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question25.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question25.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question25.Setuju.isChecked -> "Setuju"
                binding.question25.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_26 = when (binding.question26.rbGroup.isNotEmpty()) {
                binding.question26.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question26.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question26.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question26.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question26.Setuju.isChecked -> "Setuju"
                binding.question26.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_27 = when (binding.question27.rbGroup.isNotEmpty()) {
                binding.question27.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question27.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question27.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question27.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question27.Setuju.isChecked -> "Setuju"
                binding.question27.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_28 = when (binding.question28.rbGroup.isNotEmpty()) {
                binding.question28.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question28.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question28.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question28.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question28.Setuju.isChecked -> "Setuju"
                binding.question28.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_29 = when (binding.question29.rbGroup.isNotEmpty()) {
                binding.question29.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question29.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question29.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question29.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question29.Setuju.isChecked -> "Setuju"
                binding.question29.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_30 = when (binding.question30.rbGroup.isNotEmpty()) {
                binding.question30.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question30.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question30.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question30.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question30.Setuju.isChecked -> "Setuju"
                binding.question30.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_31 = when (binding.question31.rbGroup.isNotEmpty()) {
                binding.question31.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question31.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question31.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question31.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question31.Setuju.isChecked -> "Setuju"
                binding.question31.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_32 = when (binding.question32.rbGroup.isNotEmpty()) {
                binding.question32.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question32.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question32.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question32.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question32.Setuju.isChecked -> "Setuju"
                binding.question32.SangatSetuju.isChecked -> "SangatSetuju"
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