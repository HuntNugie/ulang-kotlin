fun main() {
//    Buatlah program Kotlin yang mencetak angka dari 1 sampai 10 menggunakan tipe data `Range`.
//Tambahkan step 2 agar output hanya mencetak angka genap saja.

    var angka = 2..10 step 2

    for (i in angka){
        println(i)
    }

}