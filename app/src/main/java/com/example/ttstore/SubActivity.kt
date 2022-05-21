package com.example.ttstore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ttstore.databinding.ActivityMainBinding
import com.example.ttstore.databinding.AddActivityBinding


class SubActivity : AppCompatActivity() {
    lateinit var bind: AddActivityBinding
    lateinit var bindingg: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_activity)

        bind = AddActivityBinding.inflate(layoutInflater)
        bindingg = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bind.root)
        //var title1: String = binding.title.toString()
        //var detail: String = binding.title.toString()
        bind.add.setOnClickListener{
            bindingg.Title.text = bind.Title.toString()
            finish()
        }
        bind.button2.setOnClickListener {
            finish()
        }

    }
}

