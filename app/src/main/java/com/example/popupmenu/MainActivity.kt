package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            //PopupMenu 객체를 생성
            val pop = PopupMenu(this, textView)

            //메뉴를 구성한다
            menuInflater.inflate(R.menu.menu1, pop.menu)

            //Popup메뉴 Item Clicked
            pop.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.item1 -> {
                        textView.text = "Menu1 Clicked"
                    }
                    R.id.item2 -> {
                        textView.text = "Menu2 Clicked"
                    }
                    R.id.item3 -> {
                        textView.text = "Menu3 Clicked"
                    }
                }
                true
            }

            pop.show()
        }
    }
}