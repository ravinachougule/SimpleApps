package com.example.lenovo.simpleapps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOK.setOnClickListener{

            val no=etNum.text.toString()
            val pass=etPass.text.toString()
            if(no==pass)
            {
                txtResult.text="Successful"
                Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show()
            }
            else
            {
                txtResult.text="Fail"
                Toast.makeText(this,"Login Unsuccessful",Toast.LENGTH_LONG).show()
            }
        }
    }
}
