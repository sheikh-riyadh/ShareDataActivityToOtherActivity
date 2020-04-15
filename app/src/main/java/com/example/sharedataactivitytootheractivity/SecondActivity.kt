package com.example.sharedataactivitytootheractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sharedataactivitytootheractivity.databinding.ActivitySecondBinding
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_second)

        var bundle : Bundle? = intent.extras // Get data
        var data = bundle!!.getString("user_message") // put same key from  our mainActivity
        secondActivitytxtId.text = data // set data textView
    }
}
