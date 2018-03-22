package com.example.lenovo.simpleapps

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cntx: Context = this@MainActivity

        // btnOK.setOnClickListener(this::clicked)

        /*

        val clk:View.OnClickListener=object :View.OnClickListener{
            override fun onClick(p0: View?) {
                val no = etNum.text.toString()
                val pass = etPass.text.toString()
                if (no == pass) {
                    txtResult.text = "Successful"
                   // Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
                } else {
                    txtResult.text = "Fail"
                    //Toast.makeText(this, "Login Unsuccessful", Toast.LENGTH_LONG).show()
                }
            }

        }

        btnOK.setOnClickListener(clk)
        */



        val clk2:View.OnClickListener= View.OnClickListener {
            val no = etNum.text.toString()
            val pass = etPass.text.toString()
            if (no == pass) {
                txtResult.text = "Successful"
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
            } else {
                txtResult.text = "Fail"
                Toast.makeText(this, "Login Unsuccessful", Toast.LENGTH_LONG).show()
            }
        }
        btnOK.setOnClickListener(clk2)



       /* btnOK.setOnClickListener {

            val no = etNum.text.toString()
            val pass = etPass.text.toString()
            if (no == pass) {
                txtResult.text = "Successful"
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
            } else {
                txtResult.text = "Fail"
                Toast.makeText(this, "Login Unsuccessful", Toast.LENGTH_LONG).show()
            }
        }
        val vw: View = btnOK*/

        val lyt:LinearLayout=LinearLayout(this@MainActivity)
    }


    /*private fun clicked(vw:View)
    {
        val no = etNum.text.toString()
        val pass = etPass.text.toString()
        if (no == pass) {
            txtResult.text = "Successful"
            Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
        } else {
            txtResult.text = "Fail"
            Toast.makeText(this, "Login Unsuccessful", Toast.LENGTH_LONG).show()
        }
    }*/
}
