package com.ckc.kotlintemeller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sample = Sample(54,"can","can")
        sample.age = 5
        sample.name = "can"
        sample.surName = "can"
        sample.sampleFun()



        //Nullability
        // Nullable (?) && Non-null
        // !! vs ?

        var myString : String? = null
        var myAge : Int? = null


        //1)Null safety

        if (myAge != null) {
            println(myAge * 10)
        } else {
            println("myAge null")
        }

        //2)safe call

        println(myAge?.compareTo(2))

        //3)elvis

        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)



    }
    fun sum(a:Int,b:Int):Int{

        return a+b
    }
    fun test(){
        println("bu bir testtir")
    }
    fun sample2(a:String){

    }
}