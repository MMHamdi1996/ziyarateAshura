package com.example.ziyarateashura

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ziyarateashura.databinding.RecyclerLayoutBinding

class MyAdapter(val context: Context , val ziyaratList: MutableList<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: RecyclerLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(RecyclerLayoutBinding.inflate(LayoutInflater.from(context), parent, false))

    override fun getItemCount() = ziyaratList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.textView.text = ziyaratList[position]
    }
}