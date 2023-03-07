package com.example.musicapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.musicapp.api.LoginApi
import com.example.musicapp.api.RetrofitInstance
import com.example.musicapp.model.loginPost
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {


    private val retrofitInstance = RetrofitInstance.getInstance().create(LoginApi::class.java)

    private var _loginList = MutableLiveData<List<loginPost>>()
    val liveloginList: LiveData<List<loginPost>>
        get() = _loginList

    fun getLogin(userid:String,password:String) = viewModelScope.launch {
        val post1 = retrofitInstance.getLogin(userid,password)
        _loginList.value = post1
    }

}