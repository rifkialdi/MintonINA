package com.kilee.mintonina

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAtletAdapter(private val listAtlet: ArrayList<Atlet>): RecyclerView.Adapter<ListAtletAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)
        var enpad = itemView.context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_badminton, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val atlet = listAtlet[position]

        Glide.with(holder.itemView.context)
            .load(atlet.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = atlet.name
        holder.tvDetail.text = atlet.detail

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(holder.enpad, DescActivity::class.java)
            moveDetail.putExtra(DescActivity.EXTRA_NAME, atlet.name)
            moveDetail.putExtra(DescActivity.EXTRA_DETAIL, atlet.detail)
            moveDetail.putExtra(DescActivity.EXTRA_IMG, atlet.photo)
            moveDetail.putExtra(DescActivity.EXTRA_KELAHIRAN, atlet.kelahiran)
            moveDetail.putExtra(DescActivity.EXTRA_BERAT, atlet.berat)
            moveDetail.putExtra(DescActivity.EXTRA_TINGGI, atlet.tinggi)
            holder.enpad.startActivity(moveDetail)

            Toast.makeText(holder.itemView.context, "You choose " + listAtlet[position].name , Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return listAtlet.size
    }
}