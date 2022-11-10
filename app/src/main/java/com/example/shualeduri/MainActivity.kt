package com.example.shualeduri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nametext: EditText = findViewById(R.id.name)
        var surnametext:EditText = findViewById(R.id.surname)
        var password:EditText = findViewById(R.id.paroli)
        var emailtext :EditText = findViewById(R.id.email)
        var check:CheckBox = findViewById(R.id.checkbox)
        var button:Button = findViewById(R.id.button)
        fun String.isValidEmail() =
            !TextUtils.isEmpty(this) && Patterns.EMAIL_ADDRESS.matcher(this).matches()
        button.setOnClickListener {
            if (nametext.text.toString()!= "" && nametext.text.toString().length > 3 && surnametext.text.toString().length > 5 && surnametext.text.toString()!=""
                && password.text.toString().length > 8 && password.text.toString() !=""
                && password.text.toString().any {it.isDigit()} && check.isChecked ){
                if (emailtext.text.toString().isValidEmail() && emailtext.text.toString() != ""){
                    Toast.makeText(baseContext, "მიმდინარეობს გადახდა", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(baseContext, "თქვენ ვერ გადაიხადეთ", Toast.LENGTH_SHORT).show()


            }
            }

            else {
                Toast.makeText(baseContext, "თქვენ ვერ გადაიხადეთ", Toast.LENGTH_SHORT).show()
            }
    }



}
}