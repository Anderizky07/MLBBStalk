package com.example.mlbbstalk.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mlbbstalk.DataHero
import com.example.mlbbstalk.HeroAdapter
import com.example.mlbbstalk.databinding.FragmentMageBinding

class MageFragment : Fragment() {

    private lateinit var binding : FragmentMageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentMageBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null){
            val mage = DataHero.genereateMage()
            val heroAdapter = HeroAdapter()
            heroAdapter.setHero(mage)

            with(binding){
                rvMage.layoutManager = GridLayoutManager(view.context, 3)
                rvMage.setHasFixedSize(true)
                rvMage.adapter = heroAdapter
            }

        }
    }
}