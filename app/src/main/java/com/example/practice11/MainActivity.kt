package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var imageButton = false
    fun imageview (view: View) {
        val loadimag: ImageView = findViewById(R.id.imageView2)
        val image: Int = R.drawable.grusha
        loadimag.setImageResource(image)
    }

    fun onClickImage(view: View){
        val btnImage: ImageButton = findViewById(R.id.imageButton)
        if (!imageButton){
            btnImage.setImageResource(R.drawable.btn_check_buttonless_on)
        }
        else
        {
            btnImage.setImageResource(R.drawable.btn_check_buttonless_off)

        }
        imageButton = !imageButton
    }

}