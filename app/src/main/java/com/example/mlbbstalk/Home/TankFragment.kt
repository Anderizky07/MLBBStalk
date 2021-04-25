package com.example.mlbbstalk.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mlbbstalk.DataHero
import com.example.mlbbstalk.HeroAdapter
import com.example.mlbbstalk.R
import com.example.mlbbstalk.databinding.FragmentSupportBinding
import com.example.mlbbstalk.databinding.FragmentTankBinding

class TankFragment : Fragment() {

    private lateinit var binding: FragmentTankBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = FragmentTankBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val tank = DataHero.genereateTank()
            val heroAdapter = HeroAdapter()
            heroAdapter.setHero(tank)

            binding.rvTank.layoutManager = GridLayoutManager(view.context, 3)
            binding.rvTank.setHasFixedSize(true)
            binding.rvTank.adapter = heroAdapter
        }
    }
}