package com.example.diagnosetuberculosis.ViewModel

import androidx.lifecycle.ViewModel

class CertaintyFactorViewModel : ViewModel() {

    private fun getUserValues(gejala: String?): Double? {
        return when (gejala != null) {
            (gejala == "SangatTidakSetuju") -> 0.0
            (gejala == "TidakSetuju") -> 0.2
            (gejala == "CukupTidakSetuju") -> 0.4
            (gejala == "CukupSetuju") -> 0.6
            (gejala == "Setuju") -> 0.8
            (gejala == "SangatSetuju") -> 1.0
            else -> null
        }
    }

    private fun calculate(l: Int, vArr: DoubleArray): Double {
        var percentages = vArr[0] + vArr[1] * (1 - vArr[0])
        for (i in 1..l) {
            if (i == l - 1) {
                break
            } else {
                percentages += vArr[i + 1] * (1 - percentages)
            }
        }
        return (String.format("%.2f", percentages * 100).toDouble())
    }

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
            (if (g1 != "Tidak") getUserValues(g1)!! * 0.8 else 0.0),
            (if (g2 != "Tidak") getUserValues(g2)!! * 0.6 else 0.0),
            (if (g3 != "Tidak") getUserValues(g3)!! * 0.6 else 0.0),
            (if (g4 != "Tidak") getUserValues(g4)!! * 0.6 else 0.0),
            (if (g5 != "Tidak") getUserValues(g5)!! * 0.8 else 0.0),
            (if (g6 != "Tidak") getUserValues(g6)!! * 0.8 else 0.0),
            (if (g7 != "Tidak") getUserValues(g7)!! * 0.8 else 0.0),
            (if (g8 != "Tidak") getUserValues(g8)!! * 0.6 else 0.0),
        )
        return calculate(Values.size, Values)
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
            (if (g1 != "Tidak") getUserValues(g1)!! * 0.4 else 0.0),
            (if (g3 != "Tidak") getUserValues(g3)!! * 0.4 else 0.0),
            (if (g5 != "Tidak") getUserValues(g5)!! * 0.6 else 0.0),
            (if (g6 != "Tidak") getUserValues(g6)!! * 0.6 else 0.0),
            (if (g7 != "Tidak") getUserValues(g7)!! * 1.0 else 0.0),
            (if (g8 != "Tidak") getUserValues(g8)!! * -0.4 else 0.0),
            (if (g9 != "Tidak") getUserValues(g9)!! * 1.0 else 0.0),
            (if (g10 != "Tidak") getUserValues(g10)!! * 0.8 else 0.0),
            (if (g11 != "Tidak") getUserValues(g11)!! * 0.8 else 0.0),
            (if (g12 != "Tidak") getUserValues(g12)!! * 0.8 else 0.0),
            (if (g13 != "Tidak") getUserValues(g13)!! * 1.0 else 0.0),
            (if (g14 != "Tidak") getUserValues(g14)!! * 0.8 else 0.0),
            (if (g15 != "Tidak") getUserValues(g15)!! * 1.0 else 0.0),
        )
        return calculate(Values.size, Values)
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
            (if (g1 != "Tidak") getUserValues(g1)!! * 0.4 else 0.0),
            (if (g3 != "Tidak") getUserValues(g3)!! * 0.6 else 0.0),
            (if (g5 != "Tidak") getUserValues(g5)!! * 0.4 else 0.0),
            (if (g6 != "Tidak") getUserValues(g6)!! * 0.4 else 0.0),
            (if (g7 != "Tidak") getUserValues(g7)!! * 1.0 else 0.0),
            (if (g8 != "Tidak") getUserValues(g8)!! * -0.4 else 0.0),
            (if (g16 != "Tidak") getUserValues(g16)!! * 1.0 else 0.0),
            (if (g17 != "Tidak") getUserValues(g17)!! * 0.8 else 0.0),
            (if (g18 != "Tidak") getUserValues(g18)!! * 0.8 else 0.0)
        )
        return calculate(Values.size, Values)

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
            (if (g1 != "Tidak") getUserValues(g1)!! * -0.6 else 0.0),
            (if (g3 != "Tidak") getUserValues(g3)!! * -0.4 else 0.0),
            (if (g5 != "Tidak") getUserValues(g5)!! * 0.6 else 0.0),
            (if (g6 != "Tidak") getUserValues(g6)!! * 0.8 else 0.0),
            (if (g7 != "Tidak") getUserValues(g7)!! * 1.0 else 0.0),
            (if (g8 != "Tidak") getUserValues(g8)!! * 0.4 else 0.0),
            (if (g19 != "Tidak") getUserValues(g19)!! * 1.0 else 0.0),
            (if (g20 != "Tidak") getUserValues(g20)!! * 1.0 else 0.0),
            (if (g21 != "Tidak") getUserValues(g21)!! * 1.0 else 0.0),
            (if (g22 != "Tidak") getUserValues(g22)!! * 1.0 else 0.0),
            (if (g23 != "Tidak") getUserValues(g23)!! * 0.6 else 0.0),
        )
        return calculate(Values.size, Values)

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
            (if (g1 != "Tidak") getUserValues(g1)!! * -0.4 else 0.0),
            (if (g3 != "Tidak") getUserValues(g3)!! * 0.4 else 0.0),
            (if (g5 != "Tidak") getUserValues(g5)!! * 0.4 else 0.0),
            (if (g6 != "Tidak") getUserValues(g6)!! * 0.8 else 0.0),
            (if (g7 != "Tidak") getUserValues(g7)!! * 0.4 else 0.0),
            (if (g8 != "Tidak") getUserValues(g8)!! * 0.2 else 0.0),
            (if (g24 != "Tidak") getUserValues(g24)!! * 1.0 else 0.0),
            (if (g25 != "Tidak") getUserValues(g25)!! * 0.8 else 0.0),
            (if (g26 != "Tidak") getUserValues(g26)!! * 0.8 else 0.0),
            (if (g27 != "Tidak") getUserValues(g27)!! * 0.6 else 0.0),
            (if (g28 != "Tidak") getUserValues(g28)!! * 0.6 else 0.0),
            (if (g29 != "Tidak") getUserValues(g29)!! * 1.0 else 0.0),
            (if (g30 != "Tidak") getUserValues(g30)!! * 0.8 else 0.0),
            (if (g31 != "Tidak") getUserValues(g31)!! * 0.6 else 0.0),
            (if (g32 != "Tidak") getUserValues(g32)!! * 0.8 else 0.0)
        )
        return calculate(Values.size, Values)

    }
}