package com.example.musicapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.musicapp.databinding.ActivityIntroBinding
import com.example.musicapp.viewmodel.MainViewModel

class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_intro)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btnlogin.setOnClickListener {
            viewModel.getLogin("asd", "asd")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}