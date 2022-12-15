package com.example.diagnosetuberculosis.View.Articles.Objects

import com.example.diagnosetuberculosis.View.Articles.Articles

object ArticleTulang {
    fun getData(): List<Articles> {
        // 4. Spine Tuberculosis / tulang belakang
        val article_tulang_1 = Articles(
            "What is Spinal Tuberculosis (Pott’s disease)",
            "Spinal tuberculosis, also known as Pott’s disease or tuberculous spondylitis, is a ...",
            "https://southfloridabackspineandscoliosis.com/what-is-spinal-tuberculosis-potts-disease/",
            "Source: southfloridabackspineandscoliosis.com"
        )
        val article_tulang_2 = Articles(
            "Treatment of Tuberculosis of the Spine With Neurologic Complications",
            "Neurologic complications are the most dreaded complication of spinal tuberculosis. The patients ...",
            "https://journals.lww.com/clinorthop/fulltext/2002/05000/treatment_of_tuberculosis_of_the_spine_with.11.aspx",
            "Source: journals.lww.com"
        )
        val article_tulang_3 = Articles(
            "Tuberculosis of the spine",
            "The dismal outcome of tuberculosis of the spine in the pre-antibiotic era has improved ...",
            "https://online.boneandjoint.org.uk/doi/full/10.1302/0301-620X.92B7.24668",
            "Source: online.boneandjoint.org.uk"
        )
        val article_tulang_4 = Articles(
            "What is spinal tuberculosis?",
            "The usual sites to be involved in spinal tuberculosis are the lower thoracic and upper lumbar vertebrae ...",
            "https://patient.info/doctor/spinal-tuberculosis",
            "Source: patient.info"
        )
        return arrayListOf(
            article_tulang_1,
            article_tulang_2,
            article_tulang_3,
            article_tulang_4,
        )
    }
}