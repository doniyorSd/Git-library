package com.example.gitlibrary

import android.content.Context
import android.widget.Toast

object ToastLib {
    fun toastMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}