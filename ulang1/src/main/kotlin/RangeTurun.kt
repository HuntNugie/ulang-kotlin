fun main() {
//    ## ✅ Soal 2 - Range Menurun
//
//Buatlah program yang mencetak angka dari 10 ke 1 menggunakan `downTo` dengan step 3.
//**Tampilkan juga:**
//- Jumlah item dalam range (`count`)
//- Angka pertama (`first`)
//- Angka terakhir (`last`)
//- Step yang digunakan
    var angka = 10 downTo 1 step 3
    for (i in angka){
        println(i)
    }
    println(angka.count())
    println(angka.first)
    println(angka.last)
    println(angka.step)
}