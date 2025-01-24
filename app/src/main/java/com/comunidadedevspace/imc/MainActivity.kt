package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText OK
        //Criar uma variável e associá-la ao comp. UI EditText OK
        //Recuperar o botão da tela OK
        //Colocar ação no botão OK
        //Recuperar o texto digitado no edtpeso OK
        //Validar espaços vazios

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {


            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == ""){
                //Mostrar mensagem ao usuário

                Snackbar.make(
                    edtPeso,
                    "Preencha todos os campos", Snackbar.LENGTH_LONG
                ).show()

            }else{
             val peso = pesoStr.toFloat()
             val altura = alturaStr.toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2


            println("Ação do botão" + resultado)
            }

        }

    }

}
