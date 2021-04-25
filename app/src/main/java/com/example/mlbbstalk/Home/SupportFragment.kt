package com.example.mlbbstalk.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mlbbstalk.DataHero
import com.example.mlbbstalk.HeroAdapter
import com.example.mlbbstalk.R
import com.example.mlbbstalk.databinding.FragmentSupportBinding

class SupportFragment : Fragment() {

    private lateinit var binding : FragmentSupportBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = FragmentSupportBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null){
            val support = DataHero.generateSupport()
            val heroAdapter = HeroAdapter()
            heroAdapter.setHero(support)

            binding.rvSupport.layoutManager = GridLayoutManager(view.context, 3)
            binding.rvSupport.setHasFixedSize(true)
            binding.rvSupport.adapter = heroAdapter
        }



    }

}