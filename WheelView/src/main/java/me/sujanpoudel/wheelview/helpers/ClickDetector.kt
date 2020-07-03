package me.sujanpoudel.wheelview.helpers

import android.util.Log
import android.view.GestureDetector.SimpleOnGestureListener
import android.view.MotionEvent


internal class ClickDetector : SimpleOnGestureListener() {
    private val TAG = "ClickDetector"
    override fun onDown(e: MotionEvent?): Boolean {
        Log.d(TAG, "onDown: ")
        return true
    }

    override fun onContextClick(e: MotionEvent?): Boolean {
        Log.d(TAG, "on click ")
        return super.onContextClick(e)
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        Log.d(TAG, "onSingleTapup ")
        return super.onSingleTapUp(e)
    }
    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        Log.d(TAG, "onSingleTapConfirmed: ")
        return true
    }
}