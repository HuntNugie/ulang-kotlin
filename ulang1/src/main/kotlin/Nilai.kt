fun main() {
    val nilaiUjian: Array<Int> = arrayOf(100,50,80,90,70)
    nilaiUjian.set(2,20)
    var rata: Double = 0.0
    for ((i,v) in nilaiUjian.withIndex() ){
        println("nilai ujian ke ${i+1} adalah $v")
        rata = rata+v
    }
    rata /= 5

    println("rata rata nilai nya adalah $rata")
}