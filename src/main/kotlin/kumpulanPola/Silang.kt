package kumpulanPola

import abstraction.IPola

class Silang : Pola ,IPola {

    private var dataPola : String = ""
    constructor(baris : Int): super(baris)

    override fun setPola() {

        for (i in 0 until super.getBaris()) {
        for (j in 0 until super.getBaris()) {
            if (i == j || i + j == super.getBaris() - 1) {
                this.dataPola+="*"
            } else {
                this.dataPola+=" "
            }
        }
            this.dataPola +="\n"
    }
    }

    override fun getPola(): String {
        return this.dataPola
    }


}