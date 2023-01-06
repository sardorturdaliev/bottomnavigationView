package com.example.bottomnavbar

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

object FragmentManger {
    var currentFrag: Fragment? = null
//
//    fun setFragment(newFragment: Fragment,activity: AppCompatActivity){
//        val transaction = activity.supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container,newFragment)
//        transaction.commit()
//        currentFrag = newFragment
//    }

}