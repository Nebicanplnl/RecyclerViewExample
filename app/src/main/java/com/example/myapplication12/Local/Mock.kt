package com.example.myapplication12.Local

import com.example.myapplication12.Data.Datalist
import com.example.myapplication12.R

object Mock {

    fun getItemList(): List<Datalist> {
        var item:ArrayList<Datalist> = ArrayList()
        item.add(Datalist("Bentley", R.drawable.bentley))
        item.add(Datalist("Bmw", R.drawable.bmw))
        item.add(Datalist("Bugatti", R.drawable.bugatti))
        item.add(Datalist("Golf", R.drawable.golf))
        item.add(Datalist("Lamborghini", R.drawable.lambo))
        item.add(Datalist("Maserati", R.drawable.maserati))
        item.add(Datalist("Mg", R.drawable.mg))
        item.add(Datalist("Peugeot", R.drawable.peugot))
        item.add(Datalist("Plymouth", R.drawable.plymouth))
        item.add(Datalist("Porsche", R.drawable.porsche))
        return item
    }
}