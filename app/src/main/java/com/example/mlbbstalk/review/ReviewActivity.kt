package com.example.mlbbstalk.review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mlbbstalk.R
import com.example.mlbbstalk.review.fragment.BeriReviewFragment

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val reviewFragment = BeriReviewFragment()
        val fragment = supportFragmentManager.findFragmentByTag(BeriReviewFragment::class.java.simpleName)

        if(fragment !is BeriReviewFragment){
            supportFragmentManager.beginTransaction()
                .add(R.id.review, reviewFragment, BeriReviewFragment::class.java.simpleName)
                .commit()
        }
    }
}
