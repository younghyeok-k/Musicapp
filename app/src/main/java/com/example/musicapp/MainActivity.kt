package com.example.musicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.adapter.CustomAdapter
import com.example.musicapp.model.loginPost
import com.example.musicapp.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val rv = findViewById<RecyclerView>(R.id.rv)
        viewModel.liveloginList.observe(this, {
            val customAdapter =
                CustomAdapter(it as ArrayList<loginPost> /* = java.util.ArrayList<com.example.retrofitactivity.model.Post> */)
            rv.adapter = customAdapter
            rv.layoutManager = LinearLayoutManager(this)
        })
    }
}