package com.june.myapplication

import android.app.Dialog
import android.content.Context
import android.view.WindowManager
import android.widget.Button

class CustomDialog(context: Context) {
    private val dialog = Dialog(context)
    private lateinit var onClickListener: OnDialogClickListener

    fun setOnClickListener(listener: OnDialogClickListener) {
        onClickListener = listener
    }

    fun showDialog() {
        dialog.setContentView(R.layout.custom_dialog)
        dialog.window?.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(true)
        dialog.setCancelable(true)
        dialog.show()

        val cancelButton = dialog.findViewById<Button>(R.id.cancelButton)
        val completeButton = dialog.findViewById<Button>(R.id.completeButton)
        cancelButton.setOnClickListener {
            dialog.dismiss()
        }
        completeButton.setOnClickListener {
            // TODO: 성공시 이뤄질 수행문장
             onClickListener.onClicked("성공")
            dialog.dismiss()
        }

    }

    interface OnDialogClickListener {
        fun onClicked(name: String)
    }
}