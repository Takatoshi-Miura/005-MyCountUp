package com.example.miura.a005_mycountup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClear.setOnClickListener(this)
        buttonTasu1.setOnClickListener(this)
        buttonTasu10.setOnClickListener(this)
        buttonTasu20.setOnClickListener(this)
        buttonHiku1.setOnClickListener(this)
        buttonHiku10.setOnClickListener(this)
        buttonHiku20.setOnClickListener(this)
    }

    var calc: Int = 0   //テキストビューに表示される数値

    override fun onClick(v: View?) {

        //計算するため、Int型に変換する
        calc = textView.text.toString().toInt()

        //タップしたボタンに応じて数値を足し引きする
        when(v?.id) {
            R.id.buttonTasu1
            -> calc += 1
            R.id.buttonHiku1
            -> calc -= 1
            R.id.buttonTasu10
            -> calc += 10
            R.id.buttonHiku10
            -> calc -= 10
            R.id.buttonTasu20
            -> calc += 20
            R.id.buttonHiku20
            -> calc -= 20
            R.id.buttonClear
            -> calc = 0
        }

        //数値がゼロ以下にならないようにする
        if (calc < 0) {
            calc = 0
        }

        //数値をテキストビューに表示する
        textView.text = calc.toString()

    }


}
