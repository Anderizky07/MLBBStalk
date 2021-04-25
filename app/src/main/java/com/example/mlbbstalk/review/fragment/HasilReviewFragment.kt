package com.example.mlbbstalk.review.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.mlbbstalk.Home.RoleActivity
import com.example.mlbbstalk.R

class HasilReviewFragment : Fragment() {
    lateinit var tv_nama: TextView
    lateinit var tv_review: TextView
    lateinit var btn_back: Button

    var review: String? = null

    companion object {
        val EXTRA_NAME = "extra_name"
        val EXTRA_REVIEW = "extra_review"
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            tv_nama = view.findViewById(R.id.tv_nama) as TextView
            tv_review = view.findViewById(R.id.tv_review_user) as TextView
            btn_back = view.findViewById(R.id.btn_kembali) as Button

            val beriReviewFragment = BeriReviewFragment()

            btn_back.setOnClickListener {
//            fragmentManager?.beginTransaction()?.apply {
//                replace(R.id.review, kasiReviewFragment, KasiReviewFragment::class.java.simpleName)
//                    .addToBackStack(null)
//                    .commit()
//            }
                val intent = Intent(view.context, RoleActivity::class.java)
                startActivity(intent)
                activity?.finishAffinity()
            }

        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (savedInstanceState != null) {
            val description = savedInstanceState.getString(EXTRA_REVIEW)
            review = description
        }

        if (arguments != null) {
            val name = arguments?.getString(EXTRA_NAME)
            tv_nama.text = name
            tv_review.text = review
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil_review, container, false)
    }
}