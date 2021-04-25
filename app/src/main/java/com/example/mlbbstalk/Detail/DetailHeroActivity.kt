package com.example.mlbbstalk.Detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ShareCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mlbbstalk.Home.RoleHero
import com.example.mlbbstalk.databinding.ActivityDetailHeroBinding
import com.example.mlbbstalk.review.ReviewActivity

class DetailHeroActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailHeroBinding

    companion object{
        const val EXTRA_HERO = "extra_hero"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataHero = intent.getParcelableExtra<RoleHero>(EXTRA_HERO)

        setDetail(dataHero)

        binding.imgBack.setOnClickListener {
            onBackPressed()
        }

        binding.imgShare.setOnClickListener {
            ShareCompat.IntentBuilder
                .from(this)
                .setType("plain/text")
                .setChooserTitle("Share data Hero")
                .setText("Share ${dataHero?.nama}")
                .startChooser()
        }

        binding.btnReviewDetail.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
        }

    }

    private fun setDetail(dataHero: RoleHero?) {
        binding.tvTitle.text = dataHero?.nama
        binding.tvRole.text = dataHero?.role
        binding.tvSpesialis.text = dataHero?.spesialis
        binding.tvDeskripsi.text = dataHero?.deskripsi
        Glide.with(this).load(dataHero?.foto).apply(RequestOptions().override(250,250)).into(binding.imgPoster)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}