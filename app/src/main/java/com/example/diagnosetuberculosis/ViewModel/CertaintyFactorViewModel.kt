package com.example.diagnosetuberculosis.ViewModel

import androidx.lifecycle.ViewModel

class CertaintyFactorViewModel : ViewModel() {

    private fun getUserValues(gejala: String?): Double? {
        return when (gejala != null) {
            (gejala == "PastiTidak") -> -1.0
            (gejala == "HampirPastiTidak") -> -0.8
            (gejala == "KemungkinanBesarTidak") -> -0.6
            (gejala == "MungkinTidak") -> -0.4
            (gejala == "Mungkin") -> 0.4
            (gejala == "KemungkinanBesar") -> 0.6
            (gejala == "HampirPasti") -> 0.8
            (gejala == "Pasti") -> 1.0
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
            (if (g1 != "TidakTahu") getUserValues(g1)!! * 0.8 else 0.0),
            (if (g2 != "TidakTahu") getUserValues(g2)!! * 0.6 else 0.0),
            (if (g3 != "TidakTahu") getUserValues(g3)!! * 0.6 else 0.0),
            (if (g4 != "TidakTahu") getUserValues(g4)!! * 0.6 else 0.0),
            (if (g5 != "TidakTahu") getUserValues(g5)!! * 0.8 else 0.0),
            (if (g6 != "TidakTahu") getUserValues(g6)!! * 0.8 else 0.0),
            (if (g7 != "TidakTahu") getUserValues(g7)!! * 0.8 else 0.0),
            (if (g8 != "TidakTahu") getUserValues(g8)!! * 0.6 else 0.0),
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
            (if (g1 != "TidakTahu") getUserValues(g1)!! * 0.4 else 0.0),
            (if (g3 != "TidakTahu") getUserValues(g3)!! * 0.4 else 0.0),
            (if (g5 != "TidakTahu") getUserValues(g5)!! * 0.6 else 0.0),
            (if (g6 != "TidakTahu") getUserValues(g6)!! * 0.6 else 0.0),
            (if (g7 != "TidakTahu") getUserValues(g7)!! * 1.0 else 0.0),
            (if (g8 != "TidakTahu") getUserValues(g8)!! * -0.4 else 0.0),
            (if (g9 != "TidakTahu") getUserValues(g9)!! * 1.0 else 0.0),
            (if (g10 != "TidakTahu") getUserValues(g10)!! * 0.8 else 0.0),
            (if (g11 != "TidakTahu") getUserValues(g11)!! * 0.8 else 0.0),
            (if (g12 != "TidakTahu") getUserValues(g12)!! * 0.8 else 0.0),
            (if (g13 != "TidakTahu") getUserValues(g13)!! * 1.0 else 0.0),
            (if (g14 != "TidakTahu") getUserValues(g14)!! * 0.8 else 0.0),
            (if (g15 != "TidakTahu") getUserValues(g15)!! * 1.0 else 0.0),
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
            (if (g1 != "TidakTahu") getUserValues(g1)!! * 0.4 else 0.0),
            (if (g3 != "TidakTahu") getUserValues(g3)!! * 0.6 else 0.0),
            (if (g5 != "TidakTahu") getUserValues(g5)!! * 0.4 else 0.0),
            (if (g6 != "TidakTahu") getUserValues(g6)!! * 0.4 else 0.0),
            (if (g7 != "TidakTahu") getUserValues(g7)!! * 1.0 else 0.0),
            (if (g8 != "TidakTahu") getUserValues(g8)!! * -0.4 else 0.0),
            (if (g16 != "TidakTahu") getUserValues(g16)!! * 1.0 else 0.0),
            (if (g17 != "TidakTahu") getUserValues(g17)!! * 0.8 else 0.0),
            (if (g18 != "TidakTahu") getUserValues(g18)!! * 0.8 else 0.0)
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
            (if (g1 != "TidakTahu") getUserValues(g1)!! * -0.6 else 0.0),
            (if (g3 != "TidakTahu") getUserValues(g3)!! * -0.4 else 0.0),
            (if (g5 != "TidakTahu") getUserValues(g5)!! * 0.6 else 0.0),
            (if (g6 != "TidakTahu") getUserValues(g6)!! * 0.8 else 0.0),
            (if (g7 != "TidakTahu") getUserValues(g7)!! * 1.0 else 0.0),
            (if (g8 != "TidakTahu") getUserValues(g8)!! * 0.4 else 0.0),
            (if (g19 != "TidakTahu") getUserValues(g19)!! * 1.0 else 0.0),
            (if (g20 != "TidakTahu") getUserValues(g20)!! * 1.0 else 0.0),
            (if (g21 != "TidakTahu") getUserValues(g21)!! * 1.0 else 0.0),
            (if (g22 != "TidakTahu") getUserValues(g22)!! * 1.0 else 0.0),
            (if (g23 != "TidakTahu") getUserValues(g23)!! * 0.6 else 0.0),
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
            (if (g1 != "TidakTahu") getUserValues(g1)!! * -0.4 else 0.0),
            (if (g3 != "TidakTahu") getUserValues(g3)!! * 0.4 else 0.0),
            (if (g5 != "TidakTahu") getUserValues(g5)!! * 0.4 else 0.0),
            (if (g6 != "TidakTahu") getUserValues(g6)!! * 0.8 else 0.0),
            (if (g7 != "TidakTahu") getUserValues(g7)!! * 0.4 else 0.0),
            (if (g8 != "TidakTahu") getUserValues(g8)!! * 0.2 else 0.0),
            (if (g24 != "TidakTahu") getUserValues(g24)!! * 1.0 else 0.0),
            (if (g25 != "TidakTahu") getUserValues(g25)!! * 0.8 else 0.0),
            (if (g26 != "TidakTahu") getUserValues(g26)!! * 0.8 else 0.0),
            (if (g27 != "TidakTahu") getUserValues(g27)!! * 0.6 else 0.0),
            (if (g28 != "TidakTahu") getUserValues(g28)!! * 0.6 else 0.0),
            (if (g29 != "TidakTahu") getUserValues(g29)!! * 1.0 else 0.0),
            (if (g30 != "TidakTahu") getUserValues(g30)!! * 0.8 else 0.0),
            (if (g31 != "TidakTahu") getUserValues(g31)!! * 0.6 else 0.0),
            (if (g32 != "TidakTahu") getUserValues(g32)!! * 0.8 else 0.0)
        )
        return calculate(Values.size, Values)

    }
}