// Kanaya Marshya 'B'    
fun luasbalok(p: Int, l: Int, t:Int ):Int{
    return 2 * ((p*l) + (l*t) + (p*t))
    
}
fun luaslingkaran(r: Int): Double{
    return 3.14 * r * r
    
}
fun kelilingpersegi(s: Int): Int{
    return 4 * s 
    
}
fun kelilingsegitiga( a: Int): Int{
    return  a + a + a
    
}
fun main() {
    val nama ="kanaya"
    val balok = luasbalok(2,3,4)
    val lingkaran = luaslingkaran(10)
    val persegi = kelilingpersegi(5)
    val segitiga = kelilingsegitiga(5)
    println("Selamat Ujian $nama, semoga sukses!!!")
    println("luas balok : $balok cm")
    println("luas Lingkaran : $lingkaran cm")
    println("keliling persegi : $persegi cm")
    println("keliling segitiga : $segitiga cm")
}
