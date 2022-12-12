package com.example.diagnosetuberculosis

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.diagnosetuberculosis.databinding.ActivityResultOneBinding

class ResultOneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultOneBinding
    private lateinit var viewModel: CertaintyFactorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[CertaintyFactorViewModel::class.java]
        binding = ActivityResultOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundleData = intent.extras
        getData(bundleData)
    }

    private fun getData(bundleData: Bundle?) = if (bundleData != null) {
        val g1 = bundleData.getString("question_1")
        val g2 = bundleData.getString("question_2")
        val g3 = bundleData.getString("question_3")
        val g4 = bundleData.getString("question_4")
        val g5 = bundleData.getString("question_5")
        val g6 = bundleData.getString("question_6")
        val g7 = bundleData.getString("question_7")
        val g8 = bundleData.getString("question_8")
        val g9 = bundleData.getString("question_9")
        val g10 = bundleData.getString("question_10")
        val g11 = bundleData.getString("question_11")
        val g12 = bundleData.getString("question_12")
        val g13 = bundleData.getString("question_13")
        val g14 = bundleData.getString("question_14")
        val g15 = bundleData.getString("question_15")
        val g16 = bundleData.getString("question_16")
        val g17 = bundleData.getString("question_17")
        val g18 = bundleData.getString("question_18")
        val g19 = bundleData.getString("question_19")
        val g20 = bundleData.getString("question_20")
        val g21 = bundleData.getString("question_21")
        val g22 = bundleData.getString("question_22")
        val g23 = bundleData.getString("question_23")
        val g24 = bundleData.getString("question_24")
        val g25 = bundleData.getString("question_25")
        val g26 = bundleData.getString("question_26")
        val g27 = bundleData.getString("question_27")
        val g28 = bundleData.getString("question_28")
        val g29 = bundleData.getString("question_29")
        val g30 = bundleData.getString("question_30")
        val g31 = bundleData.getString("question_31")
        val g32 = bundleData.getString("question_32")

        changesData(
            viewModel.tbParuParu(g1, g3, g5, g6, g7, g8, g2, g4),
            viewModel.tbKelenjarGetahBeing(
                g1,
                g3,
                g5,
                g6,
                g7,
                g8,
                g9,
                g10,
                g11,
                g12,
                g13,
                g14,
                g15
            ),
            viewModel.tbPayudara(g1, g3, g5, g6, g7, g8, g16, g17, g18),
            viewModel.tbTulangBelakang(g1, g3, g5, g6, g7, g8, g19, g20, g21, g22, g23),
            viewModel.tbOtak(g1, g3, g5, g6, g7, g8, g24, g25, g26, g27, g28, g29, g30, g31, g32)
        )
    } else {
        Toast.makeText(applicationContext, "Maaf, Data Kosong!", Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("SetTextI18n")
    private fun changesData(
        tbParu: Double,
        tbKelenjar: Double,
        tbPayudara: Double,
        tbTulang: Double,
        tbOtak: Double
    ) {
        binding.apply {
            answer1.apply {
                textPersentase.text = "$tbParu%"
            }
            answer2.apply {
                textPersentase.text = "$tbKelenjar%"
                textPertanyaan.text =
                    """
                        Kelenjar
                        Getah Bening
                    """.trimIndent()
                textPertanyaan.setLines(2)
            }
            answer3.apply {
                textPersentase.text = "$tbPayudara%"
                textPertanyaan.text = "Payudara"
            }
            answer4.apply {
                textPersentase.text = "$tbTulang%"
                textPertanyaan.text =
                    """
                        Tulang
                        Belakang
                    """.trimIndent()
                textPertanyaan.setLines(2)
            }
            answer5.apply {
                textPersentase.text = "$tbOtak%"
                textPertanyaan.text = "Otak"
            }
        }
    }
}