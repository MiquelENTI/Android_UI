package com.example.apuntesclassecdi

import android.content.Context
import android.content.SharedPreferences

typealias  Shared = SharedPreferencesManager
object SharedPreferenceManager {

private const val  MyAppPreferencesName = "MySharedPreferences"


    private val shared : SharedPreferences by lazy { MyClass.Context.getSharedPreferences(MyAppPreferencesName, Context.MODE_PRIVATE }
    private  val editor: SharedPreferences.Editor by lazy { shared.edit()}
    private const val AppOpenTimesKey = "AppOpenTimes"


    private var TimesOpenApp:Int
        get() = shared.getInt((AppOpenTimesKey,0)
        set(newValue){
editor.putInt(AppOpenTimesKey,newValue)
            editor.apply()
        }

}