package com.kotlin.order.coffee.menu
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var opcion1 = findViewById(R.id.opcion1) as CheckBox
        var opcion2 = findViewById(R.id.opcion2) as CheckBox
        var txtresultado = findViewById(R.id.resultado) as TextView

        var valorcapturado1: String = ""
        var valorcapturado2: String = ""

        var boton = findViewById(R.id.ordenar) as Button



        boton.setOnClickListener {
            if (opcion1.isChecked){
                valorcapturado1 = "main"
            }
            else{
                valorcapturado1 = ""
            }


            if (opcion2.isChecked){
                valorcapturado2 = "starter"
            }
            else{
                valorcapturado2 = ""
            }


            txtresultado.setText("El cliente ordeno _:  $valorcapturado1  y  $valorcapturado2")
        }






    }
}
