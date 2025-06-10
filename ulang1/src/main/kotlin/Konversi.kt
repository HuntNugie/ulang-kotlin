import kotlin.reflect.typeOf

fun main() {
    var nilaiAwal: Double = 85.75

//    konversikan
    var jadiByte: Byte = nilaiAwal.toInt().toByte()
    var jadiShort: Short = nilaiAwal.toInt().toShort()
    var jadiInt: Int = nilaiAwal.toInt()
    var jadiLong: Long = nilaiAwal.toLong()
    var jadiFloat: Float = nilaiAwal.toFloat()

    println(nilaiAwal)
    println(jadiByte)
    println(jadiShort)
    println(jadiInt)
    println(jadiLong)
    println(jadiFloat)
}