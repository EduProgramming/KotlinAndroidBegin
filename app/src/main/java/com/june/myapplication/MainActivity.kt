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
            val dialog = CustomDialog(this)
            dialog.showDialog()
            dialog.setOnClickListener(object: CustomDialog.OnDialogClickListener {
                override fun onClicked(name: String) {
                    binding.textView.text = name
                }

            })
        }
    }
}