package com.example.diagnosetuberculosis.View.Questions

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
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
            val question_1 = when (binding.question1.rbGroup.isNotEmpty()) {
                binding.question1.PastiTidak.isChecked -> "PastiTidak"
                binding.question1.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question1.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question1.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question1.TidakTahu.isChecked -> "TidakTahu"
                binding.question1.Mungkin.isChecked -> "Mungkin"
                binding.question1.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question1.HampirPasti.isChecked -> "HampirPasti"
                binding.question1.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_2 = when (binding.question2.rbGroup.isNotEmpty()) {
                binding.question2.PastiTidak.isChecked -> "PastiTidak"
                binding.question2.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question2.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question2.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question2.TidakTahu.isChecked -> "TidakTahu"
                binding.question2.Mungkin.isChecked -> "Mungkin"
                binding.question2.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question2.HampirPasti.isChecked -> "HampirPasti"
                binding.question2.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_3 = when (binding.question3.rbGroup.isNotEmpty()) {
                binding.question3.PastiTidak.isChecked -> "PastiTidak"
                binding.question3.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question3.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question3.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question3.TidakTahu.isChecked -> "TidakTahu"
                binding.question3.Mungkin.isChecked -> "Mungkin"
                binding.question3.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question3.HampirPasti.isChecked -> "HampirPasti"
                binding.question3.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_4 = when (binding.question4.rbGroup.isNotEmpty()) {
                binding.question4.PastiTidak.isChecked -> "PastiTidak"
                binding.question4.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question4.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question4.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question4.TidakTahu.isChecked -> "TidakTahu"
                binding.question4.Mungkin.isChecked -> "Mungkin"
                binding.question4.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question4.HampirPasti.isChecked -> "HampirPasti"
                binding.question4.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_5 = when (binding.question5.rbGroup.isNotEmpty()) {
                binding.question5.PastiTidak.isChecked -> "PastiTidak"
                binding.question5.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question5.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question5.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question5.TidakTahu.isChecked -> "TidakTahu"
                binding.question5.Mungkin.isChecked -> "Mungkin"
                binding.question5.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question5.HampirPasti.isChecked -> "HampirPasti"
                binding.question5.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_6 = when (binding.question6.rbGroup.isNotEmpty()) {
                binding.question6.PastiTidak.isChecked -> "PastiTidak"
                binding.question6.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question6.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question6.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question6.TidakTahu.isChecked -> "TidakTahu"
                binding.question6.Mungkin.isChecked -> "Mungkin"
                binding.question6.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question6.HampirPasti.isChecked -> "HampirPasti"
                binding.question6.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_7 = when (binding.question7.rbGroup.isNotEmpty()) {
                binding.question7.PastiTidak.isChecked -> "PastiTidak"
                binding.question7.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question7.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question7.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question7.TidakTahu.isChecked -> "TidakTahu"
                binding.question7.Mungkin.isChecked -> "Mungkin"
                binding.question7.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question7.HampirPasti.isChecked -> "HampirPasti"
                binding.question7.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_8 = when (binding.question8.rbGroup.isNotEmpty()) {
                binding.question8.PastiTidak.isChecked -> "PastiTidak"
                binding.question8.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question8.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question8.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question8.TidakTahu.isChecked -> "TidakTahu"
                binding.question8.Mungkin.isChecked -> "Mungkin"
                binding.question8.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question8.HampirPasti.isChecked -> "HampirPasti"
                binding.question8.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_9 = when (binding.question9.rbGroup.isNotEmpty()) {
                binding.question9.PastiTidak.isChecked -> "PastiTidak"
                binding.question9.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question9.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question9.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question9.TidakTahu.isChecked -> "TidakTahu"
                binding.question9.Mungkin.isChecked -> "Mungkin"
                binding.question9.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question9.HampirPasti.isChecked -> "HampirPasti"
                binding.question9.Pasti.isChecked -> "Pasti"
                else -> "NULL"
            }
            val question_10 = when (binding.question10.rbGroup.isNotEmpty()) {
                binding.question10.PastiTidak.isChecked -> "PastiTidak"
                binding.question10.HampirPastiTidak.isChecked -> "HampirPastiTidak"
                binding.question10.KemungkinanBesarTidak.isChecked -> "KemungkinanBesarTidak"
                binding.question10.MungkinTidak.isChecked -> "MungkinTidak"
                binding.question10.TidakTahu.isChecked -> "TidakTahu"
                binding.question10.Mungkin.isChecked -> "Mungkin"
                binding.question10.KemungkinanBesar.isChecked -> "KemungkinanBesar"
                binding.question10.HampirPasti.isChecked -> "HampirPasti"
                binding.question10.Pasti.isChecked -> "Pasti"
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