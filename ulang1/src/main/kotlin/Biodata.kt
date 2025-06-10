fun main() {
  val nama: String = "Nugie kurniawan"
    val umur: Int = 21
    val alamat: String = """Perumahan Bumi sangkuriang 4
        |kec tanjungsari
        |kab sumedang
        |jawabarat
    """.trimMargin()
    val status: String = "Mahasiswa"

    println("Nama saya adalah $nama \nSaya Berumur $umur tahun \nAlamat Saya di $alamat \nstatus saya : $status \npanjang character di nama saya ${nama.length}")
}