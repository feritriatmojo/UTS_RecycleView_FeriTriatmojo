package com.feritriatmojo.uts.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.feritriatmojo.uts.R
import com.feritriatmojo.uts.model.Affirmation

//TODO 1 : class bernama ItemAdapter
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    //TODO 2 : class ItemViewHolder dengan textView dan imageView
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }
    //TODO 3 : onCreateViewHolder() berfungsi untuk membuat objek ViewHolder.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }
    //TODO 4 : onBindViewHolder() berfungsi untuk menghubungkan data yang ada dengan objek ViewHolder.
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
    //TODO 5 : getItemCount() berfungsi untuk menentukan jumlah item yang akan ditampilkan.
    override fun getItemCount(): Int {
        return dataset.size
    }
}