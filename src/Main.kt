fun main() {
    var array: List<String> = arrayListOf("Россия","Великобритания","Казахстан","Америка","Австрия")
    println(array.maxBy { it.length })
}