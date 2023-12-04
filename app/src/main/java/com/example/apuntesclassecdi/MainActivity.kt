package com.example.apuntesclase

import android.app.ActionBar.LayoutParams
import android.content.Context
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.apuntesclassecdi.R
import com.example.apuntesclassecdi.SharedPreferenceManager

class MainActivity : ComponentActivity() {

    val openAppText : TextView by lazy {findViewById(R.id.open_app_text)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)
    }
}

