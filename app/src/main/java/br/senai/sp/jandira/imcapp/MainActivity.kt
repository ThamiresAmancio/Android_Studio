package br.senai.sp.jandira.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_calcular.setOnClickListener {

            calcularImc()

        }
    }

    fun calcularImc(){

        var peso = edit_peso.text.toString().toDouble()
        var altura = edit_altura.text.toString().toDouble()

        var imc =peso/ (altura * altura)

        text_resultado.text = imc.toString()
    }
}