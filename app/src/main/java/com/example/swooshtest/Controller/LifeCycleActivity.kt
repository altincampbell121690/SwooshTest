package com.example.swooshtest.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class LifeCycleActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "{javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        Log.d(TAG, "{javaClass.simpleName} OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "{javaClass.simpleName} On Resume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG, "{javaClass.simpleName} On Restart")
        super.onRestart()
    }
    override fun onPause() {
        Log.d(TAG, "{javaClass.simpleName} On Pause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "{javaClass.simpleName} On Stop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "{javaClass.simpleName} On Destroy")
        super.onDestroy()
    }
}
