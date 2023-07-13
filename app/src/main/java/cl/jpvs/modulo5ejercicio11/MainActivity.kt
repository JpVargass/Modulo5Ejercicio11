package cl.jpvs.modulo5ejercicio11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
fun main(){
    var numero1 = 10
    var numero2 = 33
    var numero3 = 66

    var resultado = numero1 + numero2 + numero3

    println("El resultado es $resultado")

    numero1 = 55

    resultado = numero1 + numero2 + numero3

    println("El resultado es $resultado")

    val promedio = resultado/3

    println("El promedio es $resultado")

}*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
         println("name : $name")
        println("age : $age")
        println("Likes to : $hobby")
        if (referrer==null){
             println("Doesn't have a referrer")
        }else {
            println("has a referrer named${referrer.name} who likes top play ${referrer.hobby}")
        }
    }
}