package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private fun Any.setOnClickListener(function: () -> Unit) {
    private fun findViewByID(btnAdd: Int): Any {
    private var etNumber1 : EditText? = null    // on the activity etNum1
    private var etNumber2 : EditText? = null    // on the activity etNum2
    private var tvDisplay : TextView? = null    // on the activity tvDisp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber2 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<TextView>(R.id.tvDisp)

        val btnAddition = findViewByID<Button>(R.id.btnAdd)
        val btnSubtraction = findViewByID<Button>(R.id.btnSub)
        val btnMultiplication = findViewByID<Button>(R.id.btnMul)
        val btnDivision = findViewByID<Button>(R.id.btnDiv)

        val btnAdd = findViewByID<Button>(R.id.btnAdd)
        btnAddition.setOnClickListener{
            Add()

            val btnSub = findViewByID<Button>(R.id.btnSub)
            btnAddition.setOnClickListener{
                Sub()

                val btnMul = findViewByID<Button>(R.id.btnMul)
                btnAddition.setOnClickListener{
                    Mul()

                    val btnDiv = findViewByID<Button>(R.id.btnDiv)
                    btnAddition.setOnClickListener{
                        Div()
        }

    }



    }

private fun add(){
    var intNum1: Int = 0
    var intNum2: Int = 0
    var intAns: Int = 0

    val etNumber1
    intNum1 = etNumber1.text.toString().toInt()
    intNum2 = etNumber2.text.toString().toInt()
    intNum2 = etNumber2.text.toString().toInt()


}}
}
