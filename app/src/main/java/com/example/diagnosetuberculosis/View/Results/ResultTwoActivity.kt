package com.example.diagnosetuberculosis.View.Results

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diagnosetuberculosis.View.Articles.ArticlesAdapter
import com.example.diagnosetuberculosis.View.Articles.Objects.*
import com.example.diagnosetuberculosis.View.MainActivity
import com.example.diagnosetuberculosis.databinding.ActivityResultTwoBinding

class ResultTwoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundleDataResults = intent.extras
        changeContent(bundleDataResults)

        binding.btnSelanjutnya.button.text = "Kembali ke beranda"
        binding.btnSelanjutnya.button.setOnClickListener() {
            val move = Intent(this, MainActivity::class.java)
            startActivity(move)
            finish()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun changeContent(bundleDataResults: Bundle?) {
        if (bundleDataResults != null) {
            val tbParu = bundleDataResults.getString("tbParu")?.toDouble()
            val tbKelenjar = bundleDataResults.getString("tbKelenjar")?.toDouble()
            val tbPayudara = bundleDataResults.getString("tbPayudara")?.toDouble()
            val tbTulang = bundleDataResults.getString("tbTulang")?.toDouble()
            val tbOtak = bundleDataResults.getString("tbOtak")?.toDouble()

            if (tbParu != null && tbKelenjar != null && tbPayudara != null && tbTulang != null && tbOtak != null) {
                if (tbParu > tbKelenjar && tbParu > tbPayudara && tbParu > tbTulang && tbParu > tbOtak) {
                    binding.tvPersentages.text = "$tbParu%"
                    binding.tvValue.text = "Tuberkulosis Paru-Paru"
                    binding.tvSecondary2.text =
                        "Lakukan Pemeriksaan tes dahak, pemeriksaan darah, pemeriksaan radiologi (CT-scan atau foto toraks) dan pemeriksaan lanjutan ketika dokter sudah berada ditempat, mohon ikuti petunjuk dokter untuk penanganan medis dan pengobatan yang tepat."
                    getDataParu()
                } else if (tbKelenjar > tbPayudara && tbKelenjar > tbTulang && tbKelenjar > tbOtak) {
                    binding.tvPersentages.text = "$tbKelenjar%"
                    binding.tvValue.text = "Tuberkulosis Kelenjar Getah Bening"
                    binding.tvSecondary2.text =
                        "Lakukakn pemeriksaan tes mammografi, pemeriksaan darah, CT-Scan, MRI, pemeriksaan lanjutan akan dilakukan ketika dokter sudah berada ditempat, mohon ikuti petunjuk dokter untuk penanganan medis dan pengobatan yang tepat."
                    binding.tvValue.setLines(2)
                    binding.tvSecondary2.text =
                        "Lakukakn pemeriksaan tes mammografi, pemeriksaan darah, CT-Scan, MRI, pemeriksaan lanjutan akan dilakukan ketika dokter sudah berada ditempat, mohon ikuti petunjuk dokter untuk penanganan medis dan pengobatan yang tepat."
                    getDataKelenjar()
                } else if (tbPayudara > tbTulang && tbPayudara > tbOtak) {
                    binding.tvPersentages.text = "$tbPayudara%"
                    binding.tvValue.text = "Tuberkulosis Payudara"
                    binding.tvSecondary2.text =
                        "Lakukan pemeriksaan CT-Scan pada daerah yang timbul benjolan, tes darah, lakukan pemeriksaan dan penanganan lanjutan ketika dokter sudah berada ditempat, mohon ikuti petunjuk dokter untuk penanganan medis dan pengobatan yang tepat."
                    getDataPayudara()
                } else if (tbTulang > tbOtak) {
                    binding.tvPersentages.text = "$tbTulang%"
                    binding.tvValue.text = "Tuberkulosis Tulang Belakang"
                    binding.tvSecondary2.text =
                        "Lakukan pemeriksaan radiologi, seperti sinar-x, CT-Scan, dan MRI, pemeriksaan lanjutan akan dilakukan ketika dokter sudah berada ditempat, mohon ikuti petunjuk dokter untuk penanganan medis dan pengobatan yang tepat."
                    getDataTulang()
                } else {
                    binding.tvPersentages.text = "$tbOtak%"
                    binding.tvValue.text = "Tuberkulosis Otak"
                    binding.tvSecondary2.text =
                        "Lakukan pemeriksaan tes lumbal (spinal tap), biopsi otak, CT-Scan kepala, rontgen, pemerikasaan jumlah sel, glukosa dan rotein, pemeriksaan lanjutan akan dilakukan ketika dokter sudah berada ditempat, mohon ikuti petunjuk dokter untuk penanganan medis dan pengobatan yang tepat."
                    getDataOtak()
                }

            } else {
                Log.i("Data Results = ", "TERDAPAT DATA KOSONG!")
            }
        } else {
            Log.i("Data Results = ", "DATA KOSONG!")
        }
    }

    private fun getDataParu() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticleParu.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }

    private fun getDataKelenjar() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticleKelenjar.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }

    private fun getDataPayudara() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticlePayudara.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }

    private fun getDataTulang() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticleTulang.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }

    private fun getDataOtak() {
        onResume()
        binding.rv.adapter = ArticlesAdapter(ArticleOtak.getData())
        binding.rv.layoutManager = LinearLayoutManager(this)
    }


}