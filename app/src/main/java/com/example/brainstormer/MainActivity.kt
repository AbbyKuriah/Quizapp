package com.example.brainstormer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val et_name:EditText = findViewById(R.id.et_name)
    val btn_start: Button = findViewById(R.id.btn_start)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener{

            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"please enter your name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,StormedQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}