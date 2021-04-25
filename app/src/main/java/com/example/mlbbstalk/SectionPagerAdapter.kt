package com.example.mlbbstalk

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mlbbstalk.Home.MageFragment
import com.example.mlbbstalk.Home.SupportFragment
import com.example.mlbbstalk.Home.TankFragment

class SectionPagerAdapter(val context : Context, fm : FragmentManager)
    : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object{
        @StringRes
        val TAB_NAMES = arrayOf(
            R.string.support,
            R.string.mage,
            R.string.tank
        )
    }

    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> SupportFragment()
            1 -> MageFragment()
            2 -> TankFragment()
            else -> Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence = context.resources.getString(TAB_NAMES[position])
}