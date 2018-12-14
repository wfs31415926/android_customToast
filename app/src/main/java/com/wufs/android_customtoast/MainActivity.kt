package com.wufs.android_customtoast

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        button.setText("按钮1")
        button2.setText("按钮2")
        button3.setText("按钮3")
        button4.setText("按钮4")
        button.setOnClickListener(View.OnClickListener {
            tv_first.setText("我点击了第一个按钮")
        })


    }
}
