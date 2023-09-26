package com.example.apuntesclassecdi

import android.os.Bundle
import android.util.Log
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apuntesclassecdi.ui.theme.ApuntesClasseCDITheme

class MainActivity : ComponentActivity() {
    open class Fruit(val name: String = "Fruta Generica")
    {
        
    }
    
    class Apple(): Fruit("Manzana")
    {
        fun AppleFunc(){
            
        }
    }
    class Banana(): Fruit("Banana"){
        fun BananaFunc(){
            
        }
        
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApuntesClasseCDITheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    
                    Column() {
                        val Fruits = listOf(Banana(), Apple())
                        
                        Fruits.forEach { fruit ->
                            
                            when(fruit){
                                is Banana -> {
                                    fruit.BananaFunc()
                                }
                                
                                is Apple -> {
                                    fruit.AppleFunc()
                                }
                                else -> PrintToScreen("Fruta no reconocible")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PrintToScreen(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello ${name}!",
        modifier = modifier
    )
}