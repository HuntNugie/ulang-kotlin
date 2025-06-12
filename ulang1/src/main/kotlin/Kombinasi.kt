fun main() {
//    ## 🎯 Bonus Soal - Kombinasi
//
//Buat program dengan `range = 10..100 step 10`, lalu:
//- Cetak seluruh isi range
//- Hitung jumlah elemen
//- Gunakan perulangan untuk menjumlahkan seluruh angka di range
//- Gunakan operator augmented assignment dalam proses penjumlahannya
//
//---
    var range = 10..100 step 10
    var tampung = 0
    for (i in range){
        tampung += i
        println(i)
    }
    println(range.count())
    println("jumlah jika di jumlahkan $tampung")
}