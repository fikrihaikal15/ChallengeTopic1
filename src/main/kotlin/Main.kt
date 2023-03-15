import kumpulanPola.*

fun main(args: Array<String>) {


    var piramid:Piramid = Piramid(8)
    piramid.setPola()
    println("Piramid")
    println(piramid.getPola())

    val piramidTerbalik : PiramidTerbalik = PiramidTerbalik(8)
    piramidTerbalik.setPola()
    println("PiramidTerbalik")
    println(piramidTerbalik.getPola())

    val belahKetupat : BelahKetupat = BelahKetupat(8)
    belahKetupat.setPola()
    println("BelahKetupat")
    println(belahKetupat.getPola())

    val silang = Silang(17)
    silang.setPola()
    println("Silang")
    println(silang.getPola())

    val sikuSiku:SikuSiku = SikuSiku(8)
    sikuSiku.setPola()
    println("SikuSiku")
    println(sikuSiku.getPola())

    val plus:Plus = Plus(7)
    plus.setPola()
    println("Plus")
    println(plus.getPola())



//    println("\nMembuat pola piramida")
//    val rows = 8 // jumlah baris piramida
//    var k = 0 // variabel untuk menghitung jumlah bintang pada setiap baris
//
//    //i adalah nomor baris saat ini
//    for (i in 1..rows) {
//        // mencetak spasi sebelum bintang
//        for (j in 1..rows-i) {
//            print("  ")
//        }
//
//        // mencetak bintang
//        while (k != 2*i-1) {
//            print("* ")
//            k++
//        }
//
//        k = 0 // reset jumlah bintang
//        println() // pindah ke baris berikutnya
//    }
//
//    println("\nmembuat pola piramida terbalik")
//    //downTo berfungsi untuk menurun dari jumlah baris terbesar
//    for (i in rows downTo 1) {
//        // mencetak spasi sebelum bintang
//        for (j in 1..rows-i) {
//            print("  ")
//        }
//
//        // mencetak bintang
//        while (k != 2*i-1) {
//            print("* ")
//            k++
//        }
//
//        k = 0 // reset jumlah bintang
//        println() // pindah ke baris berikutnya
//    }
//
//    println("\nmembuat pola belahketupat")
//    for (i in 1..rows) {
//        // mencetak spasi sebelum bintang
//        for (j in 1..rows-i) {
//            print("  ")
//        }
//
//        // mencetak bintang
//        while (k != 2*i-1) {
//            print("* ")
//            k++
//        }
//
//        k = 0 // reset jumlah bintang
//        println() // pindah ke baris berikutnya
//    }
//
//
//
//    for (i in rows downTo 1) {
//        // mencetak spasi sebelum bintang
//        for (j in 1..rows-i) {
//            print("  ")
//        }
//
//        // mencetak bintang
//        while (k != 2*i-1) {
//            print("* ")
//            k++
//        }
//
//        k = 0 // reset jumlah bintang
//        println() // pindah ke baris berikutnya
//    }
//
//    println("\nmembuat pola x")
//    val size = 17 // ukuran pola X (harus ganjil)
//
//    for (i in 0 until size) {
//        for (j in 0 until size) {
//            if (i == j || i + j == size - 1) {
//                print("*")
//            } else {
//                print(" ")
//            }
//        }
//        println()
//    }
//
//    println("\nmembuat pola segitiga siku-siku")
//
//    for (i in 1..rows) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }
}