package com.example.currencyapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnConvert.setOnClickListener{
                val num=etNum.text.toString()
                val rs=convert(num.toInt())
                txtRs.text=rs
                etRes.setText(rs)
        }
    }

    private var units= arrayOf("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen")
    private var tens= arrayOf("", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")


    fun convert(i:Int): String {

        if (i < 20) {
            return units[i]
        } else{

        }

        if (i < 100) {
            return tens[i / 10] + if (i % 10 > 0) {
                " "
            } else {
            } + convert(i % 10)
        } else {
            ""
        }
        if (i < 1000) {
            return units[i / 100] + " Hundred" + if (i % 100 > 0) {
                " "
            } else {
            } + convert(i % 100)
        } else {
            ""
        }
        if(i<100000){
            return convert(i / 1000) + " thousand " + if (i % 1000 > 0){
                " " + convert(i % 1000)
            } else {
                ""
            }
        }
        return if (i < 10000000) convert(i / 100000) + " lakh " + if (i % 100000 > 0) " " + convert(i % 100000) else ""
        else convert(i / 10000000) + " crore " + if (i % 10000000 > 0) " " + convert(i % 10000000) else ""

    }
}
