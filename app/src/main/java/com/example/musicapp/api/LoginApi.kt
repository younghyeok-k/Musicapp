package com.example.musicapp.api

import com.example.musicapp.model.loginPost
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {


    @POST( "login")
    suspend fun getLogin(
       @Body  username : String,
       @Body password:String
        ): List<loginPost>
}
//data class LoginRequest(
//    var username : String,
//    var password : String
//)