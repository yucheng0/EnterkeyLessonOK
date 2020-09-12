package com.example.enterkeylesson

import android.content.SharedPreferences
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// 編輯器最簡單的寫法
        editText.setOnEditorActionListener { textView, i, keyEvent ->
            if (i == EditorInfo.IME_ACTION_DONE) {
                //dosomething  做事情區
                println("最簡單")
                true
            }
            false
           }


 /*       editText.setOnEditorActionListener { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_DONE){
                println ("HiHI 最簡單")
                true
            } else {
                false
            }
        }  */




 /*       // 原稿-正統寫法
        editText.setOnEditorActionListener(OnEditorActionListener { textView, i, keyEvent ->
            if (i == EditorInfo.IME_ACTION_DONE) {
                //dosomething
                println("HIHI")
                return@OnEditorActionListener true
            }
              false
    })  */


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