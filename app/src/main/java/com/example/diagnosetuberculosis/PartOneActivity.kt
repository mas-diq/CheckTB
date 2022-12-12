package com.example.diagnosetuberculosis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
            val question_1 = if (binding.question1.Ya.isChecked) "Ya" else "Tidak"
            val question_2 = if (binding.question2.Ya.isChecked) "Ya" else "Tidak"
            val question_3 = if (binding.question3.Ya.isChecked) "Ya" else "Tidak"
            val question_4 = if (binding.question4.Ya.isChecked) "Ya" else "Tidak"
            val question_5 = if (binding.question5.Ya.isChecked) "Ya" else "Tidak"
            val question_6 = if (binding.question6.Ya.isChecked) "Ya" else "Tidak"
            val question_7 = if (binding.question7.Ya.isChecked) "Ya" else "Tidak"
            val question_8 = if (binding.question8.Ya.isChecked) "Ya" else "Tidak"
            val question_9 = if (binding.question9.Ya.isChecked) "Ya" else "Tidak"
            val question_10 = if (binding.question10.Ya.isChecked) "Ya" else "Tidak"

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
                textPertanyaan.text = "Batuk terus-menerus dan berdahak selama tiga minggu / lebih"
                textPertanyaan.setLines(3)
            }
            question2.apply {
                textNomor.text = "Pertanyaan 2"
                textPertanyaan.text = "Dahak bercampur darah/batuk darah."
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
                textPertanyaan.text = "Rasa kurang enak badan/malaise, lemah."
                textPertanyaan.setLines(2)
            }
            question8.apply {
                textNomor.text = "Pertanyaan 8"
                textPertanyaan.text = "Berkeringat di malam hari walaupun tidak melakukan apa-apa."
                textPertanyaan.setLines(3)
            }
            question9.apply {
                textNomor.text = "Pertanyaan 9"
                textPertanyaan.text =
                    "Munculnya benjolan-benjolan pada bagian yang mengalami gangguan kelenjar seperti leher, sela paha, serta ketiak."
                textPertanyaan.setLines(4)
            }
            question10.apply {
                textNomor.text = "Pertanyaan 10"
                textPertanyaan.text = "Ada tanda-tanda radang di daerah sekitar benjolan kelenjar."
                textPertanyaan.setLines(3)
            }
        }
    }
}