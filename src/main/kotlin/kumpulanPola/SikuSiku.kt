package kumpulanPola

import abstraction.IPola

class SikuSiku:Pola ,IPola {

    private var dataPola : String = ""
    constructor(baris:Int): super(baris)

    override fun setPola() {
        for (i in 1..super.getBaris()) {
        for (j in 1..i) {
            this.dataPola +="* "
        }
        this.dataPola +="\n"
    }
    }

    override fun getPola(): String {
        return this.dataPola
    }

}