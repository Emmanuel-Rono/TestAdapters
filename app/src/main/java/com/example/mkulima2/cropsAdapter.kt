package com.example.mkulima2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class cropsAdapter(val cropsData:ArrayList<CropImageModel>):RecyclerView.Adapter<cropsAdapter.Viewholder>()
{
  class Viewholder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        val imageIsaka:ImageView=itemView.findViewById(R.id.crop_isaka_image)
        val imageKunde:ImageView=itemView.findViewById(R.id.crop_kunde_image)
        val imageManagu:ImageView=itemView.findViewById(R.id.crop_managu_image)
        val imagemrenda:ImageView=itemView.findViewById(R.id.crop_mrenda_image)
        val textManagu:TextView=itemView.findViewById(R.id.crop_managu_name)
        val textKunde:TextView=itemView.findViewById(R.id.crop_managu_name)
        val textIsaka:TextView=itemView.findViewById(R.id.crop_managu_name)
        val textMrenda:TextView=itemView.findViewById(R.id.crop_managu_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.cropslayout,parent,false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int)
    {
        val dataPosition=cropsData[position]
        holder.imageManagu.setImageResource(dataPosition.image)
        holder.imageKunde.setImageResource(dataPosition.image)
        holder.imageIsaka.setImageResource(dataPosition.image)
        holder.imagemrenda.setImageResource(dataPosition.image)
holder.textManagu.text=dataPosition.cropName
holder.textKunde.text=dataPosition.cropName
holder.textIsaka.text=dataPosition.cropName
holder.textMrenda.text=dataPosition.cropName
    }
    override fun getItemCount(): Int {
        return cropsData.size
    }
}