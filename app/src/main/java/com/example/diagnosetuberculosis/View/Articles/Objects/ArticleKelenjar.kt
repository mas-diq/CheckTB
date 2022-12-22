package com.example.diagnosetuberculosis.View.Articles.Objects

import com.example.diagnosetuberculosis.View.Articles.Articles

object ArticleKelenjar {
    fun getData(): List<Articles> {
        // 2. Lymph Node Tuberculosis / getah bening
        val article_kelenjar_1 = Articles(
            "Difficulties In Managing Lymph Node Tuberculosis",
            "Lymph node tuberculosis constitutes 20-40% of extrapulmonary tuberculosis. It is more ...",
            "https://journals.lww.com/lungindia/Fulltext/2004/21040/DIFFICULTIES_IN_MANAGING_LYMPH_NODE_TUBERCULOSIS.4.aspx#:~:text=Tuberculous%20lymphadenitis%20usually%20presents%20as,loss%2C%20fatigue%20and%20night%20sweats.",
            "Source: journals.lww.com"
        )
        val article_kelenjar_2 = Articles(
            "Lymph nodes tuberculosis: a retrospective study on clinical and therapeutic features",
            "Lymph nodes tuberculosis represents 30 percent of extra pulmonary tuberculosis in Morocco. ...",
            "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC4450036/#:~:text=General%20signs%20(weight%20loss%2C%20sweats,90%25)%20or%20supra%20clavicular.",
            "Source: www.ncbi.nlm.nih.gov"
        )
        val article_kelenjar_3 = Articles(
            "Lymph Node Tuberculosis Is Treatable, Diagnosis Key",
            "Lymph node tuberculosis is a type of tuberculosis which affects exterior portion of the lungs ...",
            "https://www.netmeds.com/health-library/post/lymph-node-tuberculosis-is-treatable-diagnosis-key",
            "Source: www.netmeds.com"
        )
        val article_kelenjar_4 = Articles(
            "What is the difference between lymph node tuberculosis and pulmonary tuberculosis?",
            "Not as dangerous and contagious as tuberculosis, lymph node tuberculosis is not fatal ...",
            "https://www.vinmec.com/en/news/health-news/what-is-the-difference-between-lymph-node-tuberculosis-and-pulmonary-tuberculosis/",
            "Source: www.vinmec.com"
        )

        return arrayListOf(
            article_kelenjar_1,
            article_kelenjar_2,
            article_kelenjar_3,
            article_kelenjar_4,
        )
    }
}