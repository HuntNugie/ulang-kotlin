<h1>Hari pertama ulangan kotlin</h1>
# 📘 Daftar Soal Latihan Kotlin Dasar

Berikut adalah soal-soal latihan dasar Kotlin yang digunakan untuk memperkuat pemahaman konsep variabel, array, perulangan, konversi tipe data, dan nullability.

---

## ✅ Soal 1 - Informasi Diri

**Deskripsi:**  
Buatlah program Kotlin yang menampilkan biodata seperti:
- Nama
- Umur
- Alamat (gunakan multiline string)
- Status
- Panjang karakter dari nama

Tampilkan semua informasi tersebut dalam format yang rapi di konsol.

---

## ✅ Soal 2 - Konversi Tipe Data

**Deskripsi:**  
Diketahui sebuah variabel bertipe `Double`. Lakukan konversi nilai tersebut ke berbagai tipe data numerik lain:
- Byte
- Short
- Int
- Long
- Float

**Catatan:**  
Perhatikan cara konversi agar tidak terjadi deprecated warning. Gunakan pendekatan `toInt()` terlebih dahulu jika diperlukan.

---

## ✅ Soal 3 - Array dan Rata-rata

**Deskripsi:**  
Buat array berisi nilai ujian. Ubah nilai pada indeks ke-2, lalu tampilkan semua nilai menggunakan perulangan `for` dengan `withIndex()`.

Setelah itu, hitung rata-rata nilai dari array tersebut dan tampilkan hasilnya.

---

## ✅ Soal 4 - Array Nullable

**Deskripsi:**  
Buat array dengan kapasitas 3 yang dapat menyimpan `null`. Isi 2 data di dalamnya.  
Gunakan perulangan untuk menampilkan semua data dalam array tersebut, termasuk yang `null`.

---

## 📌 Catatan Tambahan

- Gunakan `println()` untuk menampilkan informasi.
- Perhatikan struktur kode dan hindari penggunaan deprecated function.
- Pastikan kode berjalan tanpa error dan output sesuai soal.

---

<h1>Hari kedua ulang kotlin</h1>
# 📘 Latihan Kotlin: Range dan Operator Aritmatika

Berikut adalah kumpulan soal latihan Kotlin berdasarkan materi `Range`, `Step`, `downTo`, `Operator Aritmatika`, dan `Augmented Assignment`.

---

## ✅ Soal 1 - Range dan Step

**Instruksi:**
Buatlah program Kotlin yang mencetak angka dari 1 sampai 10 menggunakan tipe data `Range`. Tambahkan step 2 agar output hanya mencetak angka genap saja.

**Contoh Output:**

```
2
4
6
8
10
```

---

## ✅ Soal 2 - Range Menurun

**Instruksi:**
Buatlah program yang mencetak angka dari 10 ke 1 menggunakan `downTo` dengan step 3.

**Tampilkan juga:**

* Jumlah item dalam range (`count`)
* Angka pertama (`first`)
* Angka terakhir (`last`)
* Step yang digunakan

**Contoh Output:**

```
10
7
4
1
Jumlah: 4
First: 10
Last: 1
Step: 3
```

---

## ✅ Soal 3 - Cek Keberadaan Angka

**Instruksi:**
Buat program dengan range dari 5 hingga 50. Cek apakah angka 25, 51, dan 5 berada dalam range tersebut atau tidak menggunakan `.contains()` atau `in`.

**Contoh Output:**

```
true
false
true
```

---

## ✅ Soal 4 - Operator Aritmatika Dasar

**Instruksi:**
Buat dua variabel `a = 15` dan `b = 4`. Tampilkan hasil dari:

* Penjumlahan `a + b`
* Pengurangan `a - b`
* Perkalian `a * b`
* Pembagian `a / b`
* Modulus `a % b`

**Contoh Output:**

```
19
11
60
3
3
```

---

## ✅ Soal 5 - Augmented Assignment

**Instruksi:**
Gunakan variabel `nilai = 10`, lalu lakukan operasi berikut secara berurutan:

* Tambahkan 5 (gunakan `+=`)
* Kurangi 2 (gunakan `-=`)
* Kali dengan 3 (gunakan `*=`)
* Bagi dengan 2 (gunakan `/=`)
* Modulus dengan 4 (gunakan `%=`)

Tampilkan nilai akhir setelah setiap operasi.

---

## 🎯 Bonus Soal - Kombinasi

**Instruksi:**
Buat program dengan `range = 10..100 step 10`, lalu:

* Cetak seluruh isi range
* Hitung jumlah elemen
* Gunakan perulangan untuk menjumlahkan seluruh angka di range
* Gunakan operator augmented assignment dalam proses penjumlahannya

**Contoh Output:**

```
10
20
30
...
100
Jumlah elemen: 10
Jumlah total semua angka di range: 550
```

---

*Selamat belajar dan terus semangat memahami Kotlin!* 💪
