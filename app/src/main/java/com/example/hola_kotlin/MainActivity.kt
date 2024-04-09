package com.example.hola_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primeros20clics = 0.80 * 20
        val siguientes60clics = 0.30 * 60
        val siguientes100clics = 0.25 * 100

        val calcularTotal = primeros20clics + siguientes60clics + siguientes100clics
        val calcularPromedio = calcularTotal / 180
        println(calcularPromedio)

        val iva = 0.16

        val calculoConIva = calcularTotal * iva

        val mensaje = String.format("total con impuestos es %.2f", calculoConIva)



        Log.d("MiApp", "El valor promedio de cada clic es: $calculoConIva")
    }


}