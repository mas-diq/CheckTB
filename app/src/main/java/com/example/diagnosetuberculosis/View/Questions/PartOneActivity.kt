package com.example.diagnosetuberculosis.View.Questions

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import com.example.diagnosetuberculosis.databinding.ActivityPartOneBinding


class PartOneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        changeContent()
        btnNext()
    }

    private fun btnNext() {
        binding.buttonNext.button.setOnClickListener() {
            val bundleData = Bundle()
            val question_1 =
                when (binding.question2.rbGroup.isNotEmpty()) {
                    binding.question2.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                    binding.question2.TidakSetuju.isChecked -> "TidakSetuju"
                    binding.question2.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                    binding.question2.CukupSetuju.isChecked -> "CukupSetuju"
                    binding.question2.Setuju.isChecked -> "Setuju"
                    binding.question2.SangatSetuju.isChecked -> "SangatSetuju"
                    else -> "NULL"
                }
            val question_2 =
                when (binding.question2.rbGroup.isNotEmpty()) {
                    binding.question2.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                    binding.question2.TidakSetuju.isChecked -> "TidakSetuju"
                    binding.question2.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                    binding.question2.CukupSetuju.isChecked -> "CukupSetuju"
                    binding.question2.Setuju.isChecked -> "Setuju"
                    binding.question2.SangatSetuju.isChecked -> "SangatSetuju"
                    else -> "NULL"
                }
            val question_3 =
                when (binding.question3.rbGroup.isNotEmpty()) {
                    binding.question3.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                    binding.question3.TidakSetuju.isChecked -> "TidakSetuju"
                    binding.question3.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                    binding.question3.CukupSetuju.isChecked -> "CukupSetuju"
                    binding.question3.Setuju.isChecked -> "Setuju"
                    binding.question3.SangatSetuju.isChecked -> "SangatSetuju"
                    else -> "NULL"
                }
            val question_4 = when (binding.question4.rbGroup.isNotEmpty()) {
                binding.question4.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question4.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question4.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question4.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question4.Setuju.isChecked -> "Setuju"
                binding.question4.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_5 = when (binding.question5.rbGroup.isNotEmpty()) {
                binding.question5.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question5.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question5.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question5.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question5.Setuju.isChecked -> "Setuju"
                binding.question5.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_6 = when (binding.question6.rbGroup.isNotEmpty()) {
                binding.question6.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question6.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question6.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question6.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question6.Setuju.isChecked -> "Setuju"
                binding.question6.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_7 = when (binding.question7.rbGroup.isNotEmpty()) {
                binding.question7.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question7.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question7.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question7.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question7.Setuju.isChecked -> "Setuju"
                binding.question7.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_8 = when (binding.question8.rbGroup.isNotEmpty()) {
                binding.question8.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question8.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question8.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question8.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question8.Setuju.isChecked -> "Setuju"
                binding.question8.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_9 = when (binding.question9.rbGroup.isNotEmpty()) {
                binding.question9.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question9.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question9.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question9.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question9.Setuju.isChecked -> "Setuju"
                binding.question9.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }
            val question_10 = when (binding.question10.rbGroup.isNotEmpty()) {
                binding.question10.SangatTidakSetuju.isChecked -> "SangatTidakSetuju"
                binding.question10.TidakSetuju.isChecked -> "TidakSetuju"
                binding.question10.CukupTidakSetuju.isChecked -> "CukupTidakSetuju"
                binding.question10.CukupSetuju.isChecked -> "CukupSetuju"
                binding.question10.Setuju.isChecked -> "Setuju"
                binding.question10.SangatSetuju.isChecked -> "SangatSetuju"
                else -> "NULL"
            }

            bundleData.apply {
                putString("question_1", question_1)
                putString("question_2", question_2)
                putString("question_3", question_3)
                putString("question_4", question_4)
                putString("question_5", question_5)
                putString("question_6", question_6)
                putString("question_7", question_7)
                putString("question_8", question_8)
                putString("question_9", question_9)
                putString("question_10", question_10)
            }

            val move = Intent(this, PartTwoActivity::class.java)
            move.putExtras(bundleData)
            Log.i("PartOne = ", bundleData.toString())
            startActivity(move)
        }
    }

    private fun changeContent() {
        binding.apply {
            question1.apply {
                textNomor.text = "Pertanyaan 1"
                textPertanyaan.text = "Batuk terus-menerus dan berdahak selama tiga minggu / lebih."
            }
            question2.apply {
                textNomor.text = "Pertanyaan 2"
                textPertanyaan.text = "Dahak bercampur darah / batuk darah."
            }
            question3.apply {
                textNomor.text = "Pertanyaan 3"
                textPertanyaan.text = "Demam selama tiga minggu atau lebih."
            }
            question4.apply {
                textNomor.text = "Pertanyaan 4"
                textPertanyaan.text = "Sesak nafas dan nyeri dada."
            }
            question5.apply {
                textNomor.text = "Pertanyaan 5"
                textPertanyaan.text = "Penurunan nafsu makan."
            }
            question6.apply {
                textNomor.text = "Pertanyaan 6"
                textPertanyaan.text = "Berat badan turun."
            }
            question7.apply {
                textNomor.text = "Pertanyaan 7"
                textPertanyaan.text = "Rasa kurang enak badan / malaise, lemah."
            }
            question8.apply {
                textNomor.text = "Pertanyaan 8"
                textPertanyaan.text =
                    "Berkeringat di malam hari walaupun tidak melakukan apa - apa."
            }
            question9.apply {
                textNomor.text = "Pertanyaan 9"
                textPertanyaan.text =
                    "Munculnya benjolan - benjolan pada bagian yang mengalami gangguan kelenjar seperti leher, sela paha, serta ketiak."
            }
            question10.apply {
                textNomor.text = "Pertanyaan 10"
                textPertanyaan.text = "Ada tanda-tanda radang di daerah sekitar benjolan kelenjar."
            }
        }
    }
}