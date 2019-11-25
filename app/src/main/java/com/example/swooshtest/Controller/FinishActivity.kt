package com.example.swooshtest.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swooshtest.EXTRA_PLAYER
import com.example.swooshtest.Model.Player
import com.example.swooshtest.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : LifeCycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        // needs to know the type
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesTxt.text = "Looking for a ${player.league} ${player.skill} league near you."

    }
}
