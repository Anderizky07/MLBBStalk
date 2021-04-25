package com.example.mlbbstalk.review.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.mlbbstalk.R

class BeriReviewFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beri_review, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn_review = view.findViewById(R.id.btn_review) as Button
        val et_nama = view.findViewById(R.id.et_nama) as EditText
        val et_review = view.findViewById(R.id.et_review) as EditText

        val hasilReviewFragment = HasilReviewFragment()

        btn_review.setOnClickListener {

            val bundle = Bundle()
            bundle.putString(
                HasilReviewFragment.EXTRA_NAME,
                "Terimakasih Atas Reviewnya Kak \n" + et_nama.text.toString()
            )

            val review = "Review anda yang anda berikan : \n" + et_review.text.toString()

            hasilReviewFragment.arguments = bundle
            hasilReviewFragment.review = review

            fragmentManager?.beginTransaction()?.apply {
                replace(
                    R.id.review,
                    hasilReviewFragment,
                    HasilReviewFragment::class.java.simpleName
                )
                    .addToBackStack(null)
                    .commit()
            }
        }
    }
}