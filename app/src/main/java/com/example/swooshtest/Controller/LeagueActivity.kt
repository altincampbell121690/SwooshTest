package com.example.swooshtest.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swooshtest.EXTRA_PLAYER
import com.example.swooshtest.Model.Player
import com.example.swooshtest.R
import kotlinx.android.synthetic.main.activity_league_activity.*

class LeagueActivity : LifeCycleActivity() {

//    var selectedLeague : String? = null


    var player = Player(null, null)

//    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
//        super.onSaveInstanceState(outState, outPersistentState)
//    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
    }

/*    to save the state between rotations I use onsave instance state
    then i create onRestore Instance state and set the variable to the saved instance
    like putExtras*/


    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun onLeagueNextClicked(view: View){
        //val skillIntent = Intent(this,)
        //create a new intent
        if( player.league  != null){
            val skillIntent = Intent(this, SkillsActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
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
        player.league = "men's"

    }

    fun onWomensClicked(view:View){
        mensToggleBtn.isChecked = false
        coEdToggleBtn.isChecked= false
        player.league  = "women's"

    }

    fun onCoEdClicked(view:View){
        mensToggleBtn.isChecked = false
        womensToggleBtn.isChecked = false
        player.league  = "coed"
    }
}
