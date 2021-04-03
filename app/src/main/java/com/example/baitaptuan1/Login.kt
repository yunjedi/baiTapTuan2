package com.example.baitaptuan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    val edEmailLogin=findViewById<EditText>(R.id.edEmailLogin)
    val etPasswordLogin=findViewById<EditText>(R.id.etPasswordLogin)
    val btLogin=findViewById<ImageButton>(R.id.btLogin)

        btLogin.setOnClickListener{
            var email:String=edEmailLogin.text.toString()
            var password:String=etPasswordLogin.text.toString()
            if(email.equals("ronaldo@gmail.com")&& password.equals("123456")){
                Toast.makeText(this,"dang nhap thanh cong",Toast.LENGTH_LONG).show()
                val intent=Intent(this,Profile::class.java)
                startActivity(intent)
            }else
                Toast.makeText(this,"dang nhap that bai", Toast.LENGTH_LONG).show()
        }
    }
}