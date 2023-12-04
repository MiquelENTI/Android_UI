package com.example.apuntesclassecdi
import  android.app.Application

class MyClass :Application(){
    companion object{
        private lateinit var  instance : MyClass

        public val Context:MyClass get () = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}