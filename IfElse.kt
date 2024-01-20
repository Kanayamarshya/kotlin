fun ket(nilai: Int){
    if (nilai >= 80 && nilai <=100){
        println("Keterangan LULUS")
    } else if (nilai >=0 && nilai <80) {
        println("Keterangan TIDAK LULUS")
    } else {
        println("Error")
    }
}

fun predikat(nilai: Int){
    if (nilai >= 85 && nilai <=100){
        println("Predikat Sangat Baik (A)")
    } else if (nilai >= 75 && nilai <85) {
        println("Predikat Baik (B)")  
    } else if (nilai >= 60 && nilai <75) {
        println("Predikat CUKUP (C)") 
    } else {
        println("Error")
    }
}
fun main(){
    ket(75)
    predikat(75)
}
