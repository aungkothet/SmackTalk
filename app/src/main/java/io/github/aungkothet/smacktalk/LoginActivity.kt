package io.github.aungkothet.smacktalk

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginRegisterButtonClicked(view: View){
        val registerIntent = Intent(this,RegisterActivity::class.java)
        startActivity(registerIntent)
    }

    fun loginLoginButtonClicked(view: View){

    }
}
