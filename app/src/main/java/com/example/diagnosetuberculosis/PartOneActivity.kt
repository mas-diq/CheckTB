package com.example.diagnosetuberculosis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diagnosetuberculosis.databinding.ActivityPartOneBinding

class PartOneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPartOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPartOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnNext()
        changeContent()
    }

    private fun btnNext() {
        binding.buttonNextOne.setOnClickListener {
            val move = Intent(this, PartTwoActivity::class.java)
            startActivity(move)
            finish()
        }
    }

    private fun changeContent() {
        binding.apply {
            question1.apply {
                textNomor.text = "Pertanyaan 1"
                textPertanyaan.text = "Batuk terus-menerus dan berdahak selama tiga minggu/lebih"
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
                textPertanyaan.setLines(2)
            }
            question9.apply {
                textNomor.text = "Pertanyaan 9"
                textPertanyaan.text =
                    "Munculnya benjolan-benjolan pada bagian yang mengalami gangguan kelenjar seperti leher, sela paha, serta ketiak."
                textPertanyaan.setLines(2)
            }
            question10.apply {
                textNomor.text = "Pertanyaan 10"
                textPertanyaan.text = "Ada tanda-tanda radang di daerah sekitar benjolan kelenjar."
                textPertanyaan.setLines(2)
            }
        }
    }
}