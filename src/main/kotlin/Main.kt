fun main(){
println("Введите число в двоичной системе: " + hihi3(readln().toInt()))
}
fun hihi3(v: Int): Int {
    var v = v
    var asd = 0
    var ran = 1
    var mod: Int
    while (v > 0) {
        mod = v % 2
        v /= 2
        asd += mod * ran
        ran *= 10
    }
    return asd
}