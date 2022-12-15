package com.example.diagnosetuberculosis.View.Articles.Objects

import com.example.diagnosetuberculosis.View.Articles.Articles

object ArticleParu {
    fun getData(): List<Articles> {
        // 1. pulmonary tuberculosis / paru
        val article_paru_1 = Articles(
            "Tuberculosis Symptoms and Treatment Options",
            "Pulmonary tuberculosis (TB) is a serious infection caused by the bacterium Mycobacterium ...",
            "https://www.houstonmethodist.org/pulmonology/tuberculosis/#:~:text=Pulmonary%20tuberculosis%20(TB)%20is%20a,infect%20anyone%20exposed%20to%20MTB.",
            "Source: www.houstonmethodist.org"
        )
        val article_paru_2 = Articles(
            "Pulmonary tuberculosis",
            "Pulmonary tuberculosis (TB) is a contagious bacterial infection that involves the lungs ...",
            "https://medlineplus.gov/ency/article/000077.htm",
            "Source: medlineplus.gov"
        )
        val article_paru_3 = Articles(
            "Pulmonary tuberculosis: diagnosis and treatment",
            "Tuberculosis remains a worldwide problem despite well documented, well publicised methods ...",
            "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC1463969/",
            "Source: ncbi.nlm.nih.gov"
        )
        val article_paru_4 = Articles(
            "What is pulmonary tuberculosis?",
            "The bacterium Mycobacterium tuberculosis causes tuberculosis (TB), a contagious, airborne ...",
            "https://www.healthline.com/health/pulmonary-tuberculosis",
            "Source: www.healthline.com"
        )

        return arrayListOf(
            article_paru_1,
            article_paru_2,
            article_paru_3,
            article_paru_4,
        )
    }
}