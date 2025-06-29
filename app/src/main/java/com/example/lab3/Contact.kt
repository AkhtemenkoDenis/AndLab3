package com.example.lab3

import android.net.Uri

data class Contact(
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val photoUri: Uri? = null
)
