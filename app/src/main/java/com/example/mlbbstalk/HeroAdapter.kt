package com.example.mlbbstalk

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mlbbstalk.Detail.DetailHeroActivity
import com.example.mlbbstalk.Home.RoleHero
import com.example.mlbbstalk.databinding.ItemHeroBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class HeroAdapter : RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    private val listHero = ArrayList<RoleHero>()

    fun setHero(hero : List<RoleHero>){
        if (hero.isEmpty()) return
        listHero.clear()
        listHero.addAll(hero)

    }

    class HeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemHeroBinding.bind(itemView)

//        val tvName = itemView.findViewById<TextView>(R.id.tv_name)

        fun bind(hero : RoleHero){
            binding.tvName.text = hero.nama
            Glide.with(itemView.context)
                .load(hero.foto)
                .transform(RoundedCornersTransformation(10, 10))
                .apply(RequestOptions().override(100,100))
                .into(binding.imgHero)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailHeroActivity::class.java)
                intent.putExtra(DetailHeroActivity.EXTRA_HERO, hero)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bind(listHero[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hero, parent, false)
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int = listHero.size
}