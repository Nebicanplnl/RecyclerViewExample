package com.example.myapplication12.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication12.Data.Datalist
import com.example.myapplication12.databinding.ItemListBinding

class RecyclerViewAdapter(private val dataArrayList: List<Datalist>): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {


    class MyViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Datalist) {
            binding.itemMageview.setImageResource(data.image)
            binding.itemTextview.text = data.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListBinding.inflate(inflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  dataArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataArrayList[position]
        holder.bind(data)
    }
}
