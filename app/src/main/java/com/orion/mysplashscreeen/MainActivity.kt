package com.orion.mysplashscreeen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //Thread.sleep(2000)
       // setTheme(R.style.AppTheme)
        //setTheme(R.style.Theme_MySplashScreeen)

        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        splashScreen.setKeepOnScreenCondition{true}
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
        finish()
    }
}