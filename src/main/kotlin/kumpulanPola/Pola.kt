package kumpulanPola


 open class Pola {

     //encapsulation
    private var jumlah:Int = 0
    private var baris:Int = 0

    constructor(baris:Int) {
        this.baris = baris
    }


       fun getJumlah() :Int {
         return this.jumlah
     }

      fun getBaris():Int{
         return this.baris
     }

     fun setBaris(value:Int) {
         this.baris = value
     }


     public fun setJumlah(jumlah:Int) {
         this.jumlah = jumlah;
     }
}