package com.example.musicapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.example.musicapp.model.loginPost

class CustomAdapter(private val dataSet : ArrayList<loginPost>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val id : TextView
        val username: TextView
        val password:TextView
        val email :TextView
        val role :TextView
        val updateAt :TextView
        val createAt :TextView

        init {
            id = view.findViewById(R.id.textid)
            username = view.findViewById(R.id.textusername)
            password = view.findViewById(R.id.textpassword)
            email = view.findViewById(R.id.textemail)
            role = view.findViewById(R.id.textrole)
            updateAt = view.findViewById(R.id.textupdateAt)
            createAt = view.findViewById(R.id.textupdateAt)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row_item, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {

        holder.id.text = dataSet[position].id
        holder.username.text = dataSet[position].username
        holder.password.text = dataSet[position].password
        holder.email.text = dataSet[position].email
        holder.role.text = dataSet[position].role
        holder.updateAt.text = dataSet[position].updateAt
        holder.createAt.text = dataSet[position].createAt

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}