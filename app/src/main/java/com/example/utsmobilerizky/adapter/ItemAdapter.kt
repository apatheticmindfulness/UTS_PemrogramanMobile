package com.example.utsmobilerizky.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobilerizky.R
import com.example.utsmobilerizky.model.Otomotif
import java.text.Format

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Otomotif>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
        val itemMachineView : TextView = view.findViewById(R.id.item_machine)
        val itemFuelView : TextView = view.findViewById(R.id.item_fuel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.GetImage())
        holder.textView.text = item.GetPembuat()
        holder.itemMachineView.text = String.format("Jenis mesin: %s", item.GetJenisMesin())
        holder.itemFuelView.text = String.format("Bahan bakar: %s", item.GetBahanBakar())
    }

    override fun getItemCount() : Int
    {
        return dataset.size
    }
}