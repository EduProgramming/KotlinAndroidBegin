package com.june.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.june.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater) // 바인딩 객체 획득
        setContentView(binding.root) // 액티비티 화면 출력

        binding.button.setOnClickListener {
            if (binding.textView.text == "textView") {
                binding.textView.text = "onClick"
            } else {
                binding.textView.text = "textView"
            }
        }
    }
}