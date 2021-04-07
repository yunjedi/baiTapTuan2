package com.example.baitaptuan1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Profile : Login() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvName = findViewById<TextView>(R.id.txtName);
        val etName = findViewById<EditText>(R.id.edName);
        var etEmail = findViewById<EditText>(R.id.etEmailLogin);
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val btnBack = findViewById<ImageButton>(R.id.btnBack);

        var intent = intent
        etEmail.setText(intent.getStringExtra("Email"))
        etName.setText("Eljad Eandax")
        etPhone.setText("+1 (783) 0986 8786")

        etName.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // Fires right as the text is being changed (even supplies the range of text)
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Fires right before text is changing
            }

            override fun afterTextChanged(s: Editable) {
                // Fires right after the text has changed
                tvName.setText(s.toString())
            }

        })
        btnBack.setOnClickListener{
           val intentBack = Intent(this,Login::class.java)
            startActivity(intentBack)
        }


    }
}