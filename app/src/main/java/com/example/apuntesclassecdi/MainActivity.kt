package com.example.apuntesclassecdi

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.apuntesclassecdi.ui.theme.ApuntesClasseCDITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApuntesClasseCDITheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    PrintToScreen("aaa", "sd")
                }
            }
        }
    }
}

@Composable
fun PrintToScreen(name: String?, name2: String?, modifier: Modifier = Modifier) {

//    val name = name ?: "Pepe"; // Assignacion por defecto

    val name = name ?: run {
        Log.e("Null Error", "Name is null")
        return
    }

    val name2 = name2 ?: run {
        Log.e("Null Error", "Name2 is null")
        return
    }

    Text(
        text = "Hello ${name}!, ${name2}!",
        modifier = modifier
    )

    /*name?.let { name ->
        name2?.let { name2 ->
            Text(
                text = "Hello ${name}!, ${name2}!",
                modifier = modifier
            )
        } ?: run {
            Log.e("Null Error", "Name2 is null")
        }
    } ?: run {
        Log.e("Null Error", "Name is null")
        /*Text(
            text = "Hello is null",
            modifier = modifier
        )*/
    }*/

}