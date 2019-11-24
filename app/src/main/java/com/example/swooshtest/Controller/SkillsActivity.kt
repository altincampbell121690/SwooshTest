package com.example.swooshtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SkillsActivity : AppCompatActivity() {

    var league:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        //good practice to use constant
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
