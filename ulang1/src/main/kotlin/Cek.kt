fun main() {
//    ## ✅ Soal 3 - Cek Keberadaan Angka
//
//Buat program dengan range dari 5 hingga 50.
//Cek apakah angka 25, 51, dan 5 berada dalam range tersebut atau tidak menggunakan `.contains()` atau `in`.

    var angka = 5..50
    println(angka.contains(25))
    println(angka.contains(51))
    println(angka.contains(5))
    println(25 in angka)
    println(51 in angka)
    println(5 in angka)
}