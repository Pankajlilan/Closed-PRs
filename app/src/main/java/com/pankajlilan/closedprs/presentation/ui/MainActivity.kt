package com.pankajlilan.closedprs.presentation.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.pankajlilan.closedprs.R
import kotlinx.android.synthetic.main.activity_splash.splash_view

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initSplash()
        goToMainActivity()
    }

    private fun initSplash() {
        Glide.with(this)
            .load(R.raw.git)
            .apply(RequestOptions().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
            .into(splash_view)
    }

    private fun goToMainActivity() {
        Handler(Looper.getMainLooper()).postDelayed(
            {
                HomeActivity.start(this)
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
                finish()
            },
            SPLASH_WAITING_TIME
        )
    }

    companion object {
        private const val SPLASH_WAITING_TIME = 3000L
    }
}