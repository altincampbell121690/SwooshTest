package com.example.swooshtest.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooshtest.EXTRA_PLAYER
import com.example.swooshtest.Model.Player
import com.example.swooshtest.R
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : LifeCycleActivity() {

   lateinit var player: Player
/*
* when i want to save variable between state changes i call onsave instance state
*  then put the variable in outstate
*/

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        //good practice to use constant
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
        println(player.league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }


    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked= false
        player.skill = "baller"
    }
    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked = false
       player.skill = "beginner"
    }

    fun onSkillFinishClicked(view:View){
        if(player.skill != null){
            val finActivity = Intent(this, FinishActivity::class.java)
            finActivity.putExtra(EXTRA_PLAYER, player)
            Toast.makeText(this,"${player.skill}, and ${player.league} selected", Toast.LENGTH_SHORT).show()
            startActivity(finActivity)
            //start the intent
        }else{
            Toast.makeText(this,"please select a Skill", Toast.LENGTH_SHORT).show()
        }
    }
}
