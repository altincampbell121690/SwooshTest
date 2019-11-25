package com.example.swooshtest.Controller

import android.content.Intent
import android.os.Bundle
import com.example.swooshtest.R
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : LifeCycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
