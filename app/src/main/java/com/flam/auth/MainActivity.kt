package com.flam.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.otpless.dto.OtplessResponse
import com.otpless.views.WhatsappLoginButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.whatsapp_login) as WhatsappLoginButton
        var userData : OtplessResponse? = null
        button.setResultCallback { data: OtplessResponse ->
            val waid = data.waId
            Log.i("user",waid)
            userData = data
            Log.i("userdata", userData!!.waId)
            Log.i("userdata", userData!!.userNumber)
        }



    }

}