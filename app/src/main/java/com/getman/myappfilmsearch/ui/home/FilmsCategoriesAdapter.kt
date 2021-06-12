package com.getman.myappfilmsearch.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.getman.myappfilmsearch.R
import com.getman.myappfilmsearch.domain.Category
import com.getman.myappfilmsearch.domain.Film

class FilmsCategoriesAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val data = listOf(
        Category(
            "Best of the best", listOf(
                Film("Best Movie", R.drawable.ic_baseline_person_24),
                Film("Best Movie 2", R.drawable.ic_baseline_person_24),
                Film("Best Movie 3", R.drawable.ic_baseline_person_24),
                Film("Best Movie 4", R.drawable.ic_baseline_person_24),
                Film("Best Movie 5", R.drawable.ic_baseline_person_24),
                Film("Best Movie 6", R.drawable.ic_baseline_person_24),
                Film("Best Movie 7", R.drawable.ic_baseline_person_24),
                Film("Best Movie 8", R.drawable.ic_baseline_person_24),
                Film("Best Movie 9", R.drawable.ic_baseline_person_24),
                Film("Best Movie 10", R.drawable.ic_baseline_person_24),
                Film("Best Movie 11", R.drawable.ic_baseline_person_24),
                Film("Best Movie 12", R.drawable.ic_baseline_person_24),
                Film("Best Movie 13", R.drawable.ic_baseline_person_24),
                Film("Best Movie 14", R.drawable.ic_baseline_person_24),
                Film("Best Movie 15", R.drawable.ic_baseline_person_24),
            )
        ),
        Category(
            "Worst of the best", listOf(
                Film("Best Movie", R.drawable.ic_launcher_background),
                Film("Best Movie 2", R.drawable.ic_launcher_background),
                Film("Best Movie 3", R.drawable.ic_launcher_background),
                Film("Best Movie 4", R.drawable.ic_launcher_background),
                Film("Best Movie 5", R.drawable.ic_launcher_background),
                Film("Best Movie 6", R.drawable.ic_launcher_background),
                Film("Best Movie 7", R.drawable.ic_launcher_background),
                Film("Best Movie 8", R.drawable.ic_launcher_background),
                Film("Best Movie 9", R.drawable.ic_launcher_background),
                Film("Best Movie 10", R.drawable.ic_launcher_background),
                Film("Best Movie 11", R.drawable.ic_launcher_background),
                Film("Best Movie 12", R.drawable.ic_launcher_background),
                Film("Best Movie 13", R.drawable.ic_launcher_background),
                Film("Best Movie 14", R.drawable.ic_launcher_background),
                Film("Best Movie 15", R.drawable.ic_launcher_background),
            )
        ),
        Category(
            "Just Movies", listOf(
                Film("Best Movie", R.drawable.ic_baseline_person_24),
                Film("Best Movie 2", R.drawable.ic_baseline_person_24),
                Film("Best Movie 3", R.drawable.ic_baseline_person_24),
                Film("Best Movie 4", R.drawable.ic_baseline_person_24),
                Film("Best Movie 5", R.drawable.ic_baseline_person_24),
                Film("Best Movie 6", R.drawable.ic_baseline_person_24),
                Film("Best Movie 7", R.drawable.ic_baseline_person_24),
                Film("Best Movie 8", R.drawable.ic_baseline_person_24),
                Film("Best Movie 9", R.drawable.ic_baseline_person_24),
                Film("Best Movie 10", R.drawable.ic_baseline_person_24),
                Film("Best Movie 11", R.drawable.ic_baseline_person_24),
                Film("Best Movie 12", R.drawable.ic_baseline_person_24),
                Film("Best Movie 13", R.drawable.ic_baseline_person_24),
                Film("Best Movie 14", R.drawable.ic_baseline_person_24),
                Film("Best Movie 15", R.drawable.ic_baseline_person_24),
            )
        ),
        Category(
            "Horrors", listOf(
                Film("Best Movie", R.drawable.ic_launcher_background),
                Film("Best Movie 2", R.drawable.ic_launcher_background),
                Film("Best Movie 3", R.drawable.ic_launcher_background),
                Film("Best Movie 4", R.drawable.ic_launcher_background),
                Film("Best Movie 5", R.drawable.ic_launcher_background),
                Film("Best Movie 6", R.drawable.ic_launcher_background),
                Film("Best Movie 7", R.drawable.ic_launcher_background),
                Film("Best Movie 8", R.drawable.ic_launcher_background),
                Film("Best Movie 9", R.drawable.ic_launcher_background),
                Film("Best Movie 10", R.drawable.ic_launcher_background),
                Film("Best Movie 11", R.drawable.ic_launcher_background),
                Film("Best Movie 12", R.drawable.ic_launcher_background),
                Film("Best Movie 13", R.drawable.ic_launcher_background),
                Film("Best Movie 14", R.drawable.ic_launcher_background),
                Film("Best Movie 15", R.drawable.ic_launcher_background),
            )
        ),
        Category(
            "Best of the worst", listOf(
                Film("Best Movie", R.drawable.ic_baseline_person_24),
                Film("Best Movie 2", R.drawable.ic_baseline_person_24),
                Film("Best Movie 3", R.drawable.ic_baseline_person_24),
                Film("Best Movie 4", R.drawable.ic_baseline_person_24),
                Film("Best Movie 5", R.drawable.ic_baseline_person_24),
                Film("Best Movie 6", R.drawable.ic_baseline_person_24),
                Film("Best Movie 7", R.drawable.ic_baseline_person_24),
                Film("Best Movie 8", R.drawable.ic_baseline_person_24),
                Film("Best Movie 9", R.drawable.ic_baseline_person_24),
                Film("Best Movie 10", R.drawable.ic_baseline_person_24),
                Film("Best Movie 11", R.drawable.ic_baseline_person_24),
                Film("Best Movie 12", R.drawable.ic_baseline_person_24),
                Film("Best Movie 13", R.drawable.ic_baseline_person_24),
                Film("Best Movie 14", R.drawable.ic_baseline_person_24),
                Film("Best Movie 15", R.drawable.ic_baseline_person_24),
            )
        ),
        Category(
            "Worst of the worst", listOf(
                Film("Best Movie", R.drawable.ic_launcher_background),
                Film("Best Movie 2", R.drawable.ic_launcher_background),
                Film("Best Movie 3", R.drawable.ic_launcher_background),
                Film("Best Movie 4", R.drawable.ic_launcher_background),
                Film("Best Movie 5", R.drawable.ic_launcher_background),
                Film("Best Movie 6", R.drawable.ic_launcher_background),
                Film("Best Movie 7", R.drawable.ic_launcher_background),
                Film("Best Movie 8", R.drawable.ic_launcher_background),
                Film("Best Movie 9", R.drawable.ic_launcher_background),
                Film("Best Movie 10", R.drawable.ic_launcher_background),
                Film("Best Movie 11", R.drawable.ic_launcher_background),
                Film("Best Movie 12", R.drawable.ic_launcher_background),
                Film("Best Movie 13", R.drawable.ic_launcher_background),
                Film("Best Movie 14", R.drawable.ic_launcher_background),
                Film("Best Movie 15", R.drawable.ic_launcher_background),
            )
        ),
        Category(
            "Amazing", listOf(
                Film("Best Movie", R.drawable.ic_baseline_person_24),
                Film("Best Movie 2", R.drawable.ic_baseline_person_24),
                Film("Best Movie 3", R.drawable.ic_baseline_person_24),
                Film("Best Movie 4", R.drawable.ic_baseline_person_24),
                Film("Best Movie 5", R.drawable.ic_baseline_person_24),
                Film("Best Movie 6", R.drawable.ic_baseline_person_24),
                Film("Best Movie 7", R.drawable.ic_baseline_person_24),
                Film("Best Movie 8", R.drawable.ic_baseline_person_24),
                Film("Best Movie 9", R.drawable.ic_baseline_person_24),
                Film("Best Movie 10", R.drawable.ic_baseline_person_24),
                Film("Best Movie 11", R.drawable.ic_baseline_person_24),
                Film("Best Movie 12", R.drawable.ic_baseline_person_24),
                Film("Best Movie 13", R.drawable.ic_baseline_person_24),
                Film("Best Movie 14", R.drawable.ic_baseline_person_24),
                Film("Best Movie 15", R.drawable.ic_baseline_person_24),
            )
        ),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val rootView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = data[position]
        (holder as? CategoryViewHolder)?.apply {
            titleCategory.text = item.title

            with(categoryFilmsList){
                layoutManager = LinearLayoutManager(
                    categoryFilmsList.context,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )

                adapter = FilmsAdapter(item.movies)
            }


        }
    }

    override fun getItemCount(): Int = data.size

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleCategory: TextView = itemView.findViewById(R.id.title_category)
        val categoryFilmsList: RecyclerView = itemView.findViewById(R.id.category_films_list)
    }
}