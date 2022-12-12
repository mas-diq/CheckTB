package com.example.diagnosetuberculosis

import androidx.lifecycle.ViewModel

class CertaintyFactorViewModel : ViewModel() {
    fun tbParuParu(
        g1: String?,
        g3: String?,
        g5: String?,
        g6: String?,
        g7: String?,
        g8: String?,
        g2: String?,
        g4: String?
    ): Double {
        val Values = doubleArrayOf(

            (if (g1 == "Ya") 0.8 else 0.0),
            (if (g2 == "Ya") 0.6 else 0.0),
            (if (g3 == "Ya") 0.6 else 0.0),
            (if (g4 == "Ya") 0.6 else 0.0),
            (if (g5 == "Ya") 0.8 else 0.0),
            (if (g6 == "Ya") 0.8 else 0.0),
            (if (g7 == "Ya") 0.8 else 0.0),
            (if (g8 == "Ya") 0.6 else 0.0),
        )
        val persentages = String.format("%.3f", Values.sum()).toDouble()
        return persentages
    }

    fun tbKelenjarGetahBeing(
        g1: String?,
        g3: String?,
        g5: String?,
        g6: String?,
        g7: String?,
        g8: String?,
        g9: String?,
        g10: String?,
        g11: String?,
        g12: String?,
        g13: String?,
        g14: String?,
        g15: String?
    ): Double {
        val Values = doubleArrayOf(
            (if (g1 == "Ya") 0.4 else 0.0),
            (if (g3 == "Ya") 0.4 else 0.0),
            (if (g5 == "Ya") 0.6 else 0.0),
            (if (g6 == "Ya") 0.6 else 0.0),
            (if (g7 == "Ya") 1.0 else 0.0),
            (if (g8 == "Ya") -0.4 else 0.0),
            (if (g9 == "Ya") 1.0 else 0.0),
            (if (g10 == "Ya") 0.8 else 0.0),
            (if (g11 == "Ya") 0.8 else 0.0),
            (if (g12 == "Ya") 0.8 else 0.0),
            (if (g13 == "Ya") 1.0 else 0.0),
            (if (g14 == "Ya") 0.8 else 0.0),
            (if (g15 == "Ya") 1.0 else 0.0),
        )
        val persentages = String.format("%.3f", Values.sum()).toDouble()
        return persentages
    }

    fun tbPayudara(
        g1: String?,
        g3: String?,
        g5: String?,
        g6: String?,
        g7: String?,
        g8: String?,
        g16: String?,
        g17: String?,
        g18: String?
    ): Double {
        val Values = doubleArrayOf(
            (if (g1 == "Ya") 0.4 else 0.0),
            (if (g3 == "Ya") 0.6 else 0.0),
            (if (g5 == "Ya") 0.4 else 0.0),
            (if (g6 == "Ya") 0.4 else 0.0),
            (if (g7 == "Ya") 1.0 else 0.0),
            (if (g8 == "Ya") -0.4 else 0.0),
            (if (g16 == "Ya") 1.0 else 0.0),
            (if (g17 == "Ya") 0.8 else 0.0),
            (if (g18 == "Ya") 0.8 else 0.0),
        )
        val persentages = String.format("%.3f", Values.sum()).toDouble()
        return persentages
    }

    fun tbTulangBelakang(
        g1: String?,
        g3: String?,
        g5: String?,
        g6: String?,
        g7: String?,
        g8: String?,
        g19: String?,
        g20: String?,
        g21: String?,
        g22: String?,
        g23: String?
    ): Double {
        val Values = doubleArrayOf(
            (if (g1 == "Ya") -0.6 else 0.0),
            (if (g3 == "Ya") -0.4 else 0.0),
            (if (g5 == "Ya") 0.6 else 0.0),
            (if (g6 == "Ya") 0.8 else 0.0),
            (if (g7 == "Ya") 1.0 else 0.0),
            (if (g8 == "Ya") 0.4 else 0.0),
            (if (g19 == "Ya") 1.0 else 0.0),
            (if (g20 == "Ya") 1.0 else 0.0),
            (if (g21 == "Ya") 1.0 else 0.0),
            (if (g22 == "Ya") 1.0 else 0.0),
            (if (g23 == "Ya") 0.6 else 0.0),
        )
        val persentages = String.format("%.3f", Values.sum()).toDouble()
        return persentages
    }

    fun tbOtak(
        g1: String?,
        g3: String?,
        g5: String?,
        g6: String?,
        g7: String?,
        g8: String?,
        g24: String?,
        g25: String?,
        g26: String?,
        g27: String?,
        g28: String?,
        g29: String?,
        g30: String?,
        g31: String?,
        g32: String?
    ): Double {
        val Values = doubleArrayOf(
            (if (g1 == "Ya") -0.4 else 0.0),
            (if (g3 == "Ya") 0.4 else 0.0),
            (if (g5 == "Ya") 0.4 else 0.0),
            (if (g6 == "Ya") 0.8 else 0.0),
            (if (g7 == "Ya") 0.4 else 0.0),
            (if (g8 == "Ya") 0.2 else 0.0),
            (if (g24 == "Ya") 1.0 else 0.0),
            (if (g25 == "Ya") 0.8 else 0.0),
            (if (g26 == "Ya") 0.8 else 0.0),
            (if (g27 == "Ya") 0.6 else 0.0),
            (if (g28 == "Ya") 0.6 else 0.0),
            (if (g29 == "Ya") 1.0 else 0.0),
            (if (g30 == "Ya") 0.8 else 0.0),
            (if (g31 == "Ya") 0.6 else 0.0),
            (if (g32 == "Ya") 0.8 else 0.0)
        )
        val persentages = String.format("%.3f", Values.sum()).toDouble()
        return persentages
    }
}