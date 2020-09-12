package com.example.monitorkeypress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println ("test")
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        if (keyCode == KeyEvent.KEYCODE_BACK) { println ("你按了backkey")
          //  有監測到Back 就是手機的下面那個按鍵back
        return false            //BACK KEY 不會把app 結束掉
        }
        return super.onKeyDown(keyCode, event)
    }
}