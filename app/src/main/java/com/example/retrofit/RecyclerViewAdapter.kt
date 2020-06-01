package com.example.retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(private val arrayList: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data_rv, null, false)
        val ViewHolder = ViewHolder(view)
        return ViewHolder
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val tvBMI: TextView = holder.itemView.findViewById(R.id.tv_data)
        tvBMI.text = arrayList[position] + "\n"

    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)