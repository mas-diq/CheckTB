package com.example.diagnosetuberculosis.View.Articles.Objects

import com.example.diagnosetuberculosis.View.Articles.Articles

object ArticleOtak {
    fun getData(): List<Articles> {
        // 5. Brain tuber / otak
        val article_otak_1 = Articles(
            "Meningitis - tuberculous",
            "Tuberculous meningitis is caused by Mycobacterium tuberculosis. This is the bacterium ...",
            "https://medlineplus.gov/ency/article/000650.htm#:~:text=Tuberculous%20meningitis%20is%20caused%20by,rare%20in%20the%20United%20States.",
            "Source: medlineplus.gov"
        )
        val article_otak_2 = Articles(
            "Tuberculosis of the Brain",
            "Tuberculosis (TB) is a common infection seen in mostly developing countries. Tuberculosis ...",
            "https://www.ankitparakh.com/tuberculosis-of-the-brain/",
            "Source: www.ankitparakh.com"
        )
        val article_otak_3 = Articles(
            "Tuberculous meningitis",
            "Tuberculous meningitis, also known as TB meningitis or tubercular meningitis, is a ...",
            "https://en.wikipedia.org/wiki/Tuberculous_meningitis",
            "Source: en.wikipedia.org"
        )
        val article_otak_4 = Articles(
            "Meningeal Tuberculosis",
            "Tuberculosis (TB) is a contagious, airborne disease that typically affects the lungs ...",
            "https://www.healthline.com/health/meningitis-tuberculosis",
            "Source: www.healthline.com"
        )

        return arrayListOf(
            article_otak_1,
            article_otak_2,
            article_otak_3,
            article_otak_4,
        )
    }
}