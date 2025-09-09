package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add an editText(plain) view and a button below it
        //enter the user name in editText and the button will be clicked which changes the text
        //to smth that includes the user name, then empty editText

        //click the button w/o entering name, then prompt user for entering their name

        //tell editText to tell the user to enter their name

        findViewById<Button>(R.id.clickButton).setOnClickListener {
            var userInput = findViewById<TextView>(R.id.textEditLabel)
            var displayText = findViewById<TextView>(R.id.msgTextView)

            if(userInput.text.isEmpty()){
                displayText.text = "Please input your name for real!"
            }
            else{
                var str_holder = "Nice to meet you, ${userInput.text}"
                displayText.text = str_holder
                userInput.text = ""
            }
        }
    }
}