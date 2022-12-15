package com.example.diagnosetuberculosis.View.Articles

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.diagnosetuberculosis.databinding.CardLayoutBinding

class ArticlesAdapter(private val articles: List<Articles>) :
    RecyclerView.Adapter<ArticlesAdapter.ArticleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(articles[position])
        holder.itemView.setOnClickListener() {
            val activity = holder.itemView.context as Activity
            val move = Intent(activity, WebViewActivity::class.java)
            move.putExtra("link", articles[position].link)
            activity.startActivity(move)
        }
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    inner class ArticleViewHolder(private val binding: CardLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(articles: Articles) {
            binding.title.text = articles.title
            binding.subtitle.text = articles.subTitle
            binding.source.text = articles.shortLink
        }
    }
}