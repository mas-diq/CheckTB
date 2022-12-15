package com.example.diagnosetuberculosis.View.Articles.Objects

import com.example.diagnosetuberculosis.View.Articles.Articles

object ArticlePayudara {
    fun getData(): List<Articles> {
        // 3. Breast  Tuberculosis / payudara
        val article_payudara_1 = Articles(
            "Breast tuberculosis: Diagnosis, management and treatment",
            "Mammary (breast) tuberculosis is a rare manifestation of extra-pulmonary localization ...",
            "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3437393/",
            "Source: www.ncbi.nlm.nih.gov"
        )
        val article_payudara_2 = Articles(
            "Primary breast tuberculosis: imaging findings of a rare disease",
            "Breast tuberculosis is a rare form of extrapulmonary tuberculosis which tends to affect females ...",
            "https://insightsimaging.springeropen.com/articles/10.1186/s13244-021-00961-3",
            "Source: insightsimaging.springeropen.com"
        )
        val article_payudara_3 = Articles(
            "Breast tuberculosis, a rare entity",
            "Breast tuberculosis is a rare form of extra-pulmonary tuberculosis. It is rare in western ...",
            "https://www.sciencedirect.com/science/article/pii/S221425091930023X#:~:text=Breast%20tuberculosis%20is%20a%20rare,a%20breast%20abscess%20or%20carcinoma.",
            "Source: www.sciencedirect.com"
        )
        val article_payudara_4 = Articles(
            "Breast tuberculosis: a case series",
            "Breast tuberculosis is a rare disease, even in endemic areas. The diagnosis can be challenging ...",
            "https://jmedicalcasereports.biomedcentral.com/articles/10.1186/s13256-020-02646-9",
            "Source: jmedicalcasereports.biomedcentral.com"
        )

        return arrayListOf(
            article_payudara_1,
            article_payudara_2,
            article_payudara_3,
            article_payudara_4,
        )
    }
}