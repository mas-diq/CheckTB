package com.example.diagnosetuberculosis.View.Articles.Objects

import com.example.diagnosetuberculosis.View.Articles.Articles

object ArticleGenerator {
    fun getArticles(): List<Articles> {

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

        // 2. Lymph Node Tuberculosis / getah bening
        val article_kelenjar_1 = Articles(
            "DIFFICULTIES IN MANAGING LYMPH NODE TUBERCULOSIS",
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
            article_paru_1,
            article_paru_2,
            article_paru_3,
            article_paru_4,
            article_kelenjar_1,
            article_kelenjar_2,
            article_kelenjar_3,
            article_kelenjar_4,
            article_payudara_1,
            article_payudara_2,
            article_payudara_3,
            article_payudara_4,
            article_tulang_1,
            article_tulang_2,
            article_tulang_3,
            article_tulang_4,
            article_otak_1,
            article_otak_2,
            article_otak_3,
            article_otak_4,
        )
    }
}