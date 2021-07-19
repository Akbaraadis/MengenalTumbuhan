package com.project.mengenalbagiantumbuhan.ui.main

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.mengenalbagiantumbuhan.R
import com.project.mengenalbagiantumbuhan.data.Materi
import com.project.mengenalbagiantumbuhan.data.Materi_Data.listdata
import com.project.mengenalbagiantumbuhan.ui.detail.DetailActivity
import de.hdodenhof.circleimageview.CircleImageView

class MainAdapter(val listdata: ArrayList<Materi>, private val context: Context) : RecyclerView.Adapter<MainAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivIcon: CircleImageView = itemView.findViewById(R.id.item_civ_icon)
        var tvName: TextView = itemView.findViewById(R.id.item_tv_text)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_icon_main, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val materi = listdata[position]
        Glide.with(holder.itemView.context)
                .load(materi.icon)
                .apply(RequestOptions().override(120, 120))
                .into(holder.ivIcon)
        holder.tvName.text = materi.name

        holder.itemView.setOnClickListener {
            val intentShoes = Intent(context, DetailActivity::class.java)

            intentShoes.apply {
                putExtra(DetailActivity.MATERI_JUDUL, materi.name)
                putExtra(DetailActivity.MATERI_PARAGRAF, materi.paragrafPertama)
                putExtra(DetailActivity.MATERI_SUBMENU1, materi.submenuPertama)
                putExtra(DetailActivity.MATERI_ISIMENU1, materi.isimenuPertama)
                putExtra(DetailActivity.MATERI_GAMBARMENU1, materi.gambarmenuPertama)
                putExtra(DetailActivity.MATERI_SUBMENU2, materi.submenuKedua)
                putExtra(DetailActivity.MATERI_ISIMENU2, materi.isimenuKedua)
                putExtra(DetailActivity.MATERI_GAMBARMENU2, materi.gambarmenuKedua)
                putExtra(DetailActivity.MATERI_SUBMENU3, materi.submenuKetiga)
                putExtra(DetailActivity.MATERI_ISIMENU3, materi.isimenuKetiga)
                putExtra(DetailActivity.MATERI_GAMBARMENU3, materi.gambarmenuKetiga)
            }

            holder.itemView.context.startActivity(intentShoes)
        }
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Materi)
    }

}