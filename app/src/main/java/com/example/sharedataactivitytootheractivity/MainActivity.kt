package com.example.sharedataactivitytootheractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sharedataactivitytootheractivity.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        btnId.setOnClickListener {
            var message : String = editTxtId.text.toString() // get value of edit text area
            val intent = Intent(this,SecondActivity::class.java) // target our destination
            intent.putExtra("user_message",message) // send message of key value pair
            startActivity(intent) // start our work
        }
    }
}
