package kumpulanPola

import abstraction.IPola

class Piramid : Pola ,IPola{

    private var dataPola:String = ""
    constructor(baris:Int): super(baris)

    override fun setPola() {

        for (i in 1..super.getBaris()) {
            // mencetak spasi sebelum bintang
            for (j in 1..super.getBaris()-i) {

                this.dataPola += "  "
            }

            // mencetak bintang
            while (super.getJumlah() != 2*i-1) {
               this.dataPola += "* "
                super.setJumlah(super.getJumlah() + 1)

            }

          super.setJumlah(0)// reset jumlah bintang
            this.dataPola +="\n" // pindah ke baris berikutnya
        }

    }

    override fun getPola(): String {
        return this.dataPola
    }



}