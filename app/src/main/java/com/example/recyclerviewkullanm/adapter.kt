package com.example.recyclerviewkullanm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_layout.view.*



    /*
    *Adapter isimli bir class oluşturuldu.
    * Girdi olarak array isimli String bir dizi gönderildi
    * interface Değeri olarak RecylerView.Adapter<adapter.RowHolder> Tanımlandı
    * interface Değerinin açılımı: RecylerView.Adaper<"classımızın ismi"."Adapter e yazıcak classın ismi"
     */
class adapter (val array:Array<String>):RecyclerView.Adapter<adapter.RowHolder>(){

    class RowHolder(view:View):RecyclerView.ViewHolder(view){
        fun settingsLayout(arraylist: Array<String>, position: Int){
            itemView.textView.text = arraylist[position]
            println(itemView.id)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter.RowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: adapter.RowHolder, position: Int) {
        holder.settingsLayout(array,position)
    }

    override fun getItemCount(): Int {
        return array.size
    }
}