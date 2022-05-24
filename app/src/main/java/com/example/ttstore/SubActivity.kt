package com.example.ttstore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ttstore.databinding.ActivityMainBinding
import com.example.ttstore.databinding.AddActivityBinding


class SubActivity : AppCompatActivity() {
    lateinit var SubBind: AddActivityBinding
    lateinit var MainBind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_activity)

        SubBind = AddActivityBinding.inflate(layoutInflater)
        MainBind = ActivityMainBinding.inflate(layoutInflater)

        setContentView(SubBind.root)
        //var title1: String = binding.title.toString()
        //var detail: String = binding.title.toString()
        SubBind.add.setOnClickListener{
            var title = SubBind.Title.toString()
            MainBind.ID.setText(title)
            MainBind.Title.setText(SubBind.Title.toString())
            finish()
        }
        SubBind.button2.setOnClickListener {
            finish()
        }

    }
}

