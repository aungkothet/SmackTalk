package io.github.aungkothet.smacktalk

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_register.*
import java.util.*

class RegisterActivity : AppCompatActivity() {

    var userAvater = "profiledefault"
    var avaterColor = "[0.5,0.5,0.5,1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun generateUserAvarter(view: View){
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)
        userAvater = if(color == 0) {
            "light$avatar"
        }else {
            "dark$avatar"
        }
        val resourceId = resources.getIdentifier(userAvater,"drawable",packageName)
        createAvaterImageView.setImageResource(resourceId)
    }

    fun generateBackgorundClicked(view: View){
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        createAvaterImageView.setBackgroundColor(Color.rgb(r,g,b))

        val savedR = r.toDouble() / 255
        val savedG = g.toDouble() / 255
        val savedB = b.toDouble() / 255

        avaterColor = "[$savedR,$savedG,$savedB,1]"
    }

    fun registerButtonClicked(view: View){

    }

}
