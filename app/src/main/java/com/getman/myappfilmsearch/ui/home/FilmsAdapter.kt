package com.getman.myappfilmsearch.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.getman.myappfilmsearch.R
import com.getman.myappfilmsearch.domain.Film

class FilmsAdapter(private val movies: List<Film>) :
    RecyclerView.Adapter<FilmsAdapter.FilmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val rootView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return FilmViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item = movies[position]

        with(holder) {
            title.text = item.title
            image.setImageResource(item.imageResource)
        }
    }

    override fun getItemCount(): Int = movies.size

    class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title_item_film)
        val image: ImageView = itemView.findViewById(R.id.image_item_film)
    }
}