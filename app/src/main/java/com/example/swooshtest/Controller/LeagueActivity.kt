package com.example.swooshtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league_activity.*
import kotlinx.android.synthetic.main.activity_welcome.*

class LeagueActivity : LifeCycleActivity() {

    var selectedLeague : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
    }

    fun leagueNextClicked(view: View){
        //val skillIntent = Intent(this,)
        //create a new intent
        if(selectedLeague != null){
            val skillIntent = Intent(this, SkillsActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            //start the intent
            startActivity(skillIntent)
        }else{
            Toast.makeText(this,"please select a League",Toast.LENGTH_SHORT).show()
        }



    }

    //change to when
    fun onMensClicked(view:View){
        womensToggleBtn.isChecked = false
        coEdToggleBtn.isChecked= false
        selectedLeague = "mens"

    }

    fun onWomensClicked(view:View){
        mensToggleBtn.isChecked = false
        coEdToggleBtn.isChecked= false
        selectedLeague = "womens"

    }

    fun onCoEdClicked(view:View){
        mensToggleBtn.isChecked = false
        womensToggleBtn.isChecked = false
        selectedLeague = "coed"
    }
}
