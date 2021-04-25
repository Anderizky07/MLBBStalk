package com.example.mlbbstalk.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mlbbstalk.SectionPagerAdapter
import com.example.mlbbstalk.databinding.ActivityRoleBinding

class RoleActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRoleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        binding.viewPager.adapter = sectionPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        supportActionBar?.elevation = 0F
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}