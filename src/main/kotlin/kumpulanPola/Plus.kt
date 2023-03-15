package kumpulanPola

import abstraction.IPola

class Plus : Pola ,IPola {

    private var dataPola : String =""
    constructor(baris:Int): super(baris)

    override fun setPola() {


        if (getBaris() % 2 == 0) {
            println("Tinggi harus ganjil.")
            return
        }

        for (i in 1..getBaris()) {
            for (j in 1..getBaris()) {
                if (j == getBaris() / 2 + 1 || i == getBaris() / 2 + 1) {
                    this.dataPola += "* "
                } else {
                    this.dataPola += "  "
                }
            }
            this.dataPola +="\n" // pindah ke baris berikutnya
        }
    }

    override fun getPola(): String {
        return this.dataPola
    }

}