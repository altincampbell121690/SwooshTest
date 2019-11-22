package com.example.swooshtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league_activity.*
import kotlinx.android.synthetic.main.activity_welcome.*

class LeagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
//        womensToggleBtn.setOnClickListener{
//
//        }
//        mensToggleBtn.setOnClickListener{
//
//        }
//        coEdToggleBtn

    }

    fun leagueNextClicked(view: View){
        //val skillIntent = Intent(this,)
    }

    //change to when
    fun onMensClicked(view:View){
        mensToggleBtn.isChecked = true
        womensToggleBtn.isChecked = false
        coEdToggleBtn.isChecked= false

    }

    fun onWomensClicked(view:View){
        mensToggleBtn.isChecked = false
        womensToggleBtn.isChecked = true
        coEdToggleBtn.isChecked= false

    }

    fun onCoEdClicked(view:View){
        mensToggleBtn.isChecked = false
        womensToggleBtn.isChecked = false
        coEdToggleBtn.isChecked= true
    }
}
