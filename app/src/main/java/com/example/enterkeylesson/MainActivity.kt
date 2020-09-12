package com.example.enterkeylesson

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 原稿-正統寫法
        editText.setOnEditorActionListener(OnEditorActionListener { textView, i, keyEvent ->
            if (i == EditorInfo.IME_ACTION_DONE) {
                //dosomething
                println("HIHI")
                return@OnEditorActionListener true
            }
              false
    })


/* 另類寫法
editText.setOnEditorActionListener(OnEditorActionListener {
    v, actionId, event ->
         if (actionId == EditorInfo.IME_ACTION_DONE) {
    println("HIHI")
               return@OnEditorActionListener true
          }
    false
})  */

}
}