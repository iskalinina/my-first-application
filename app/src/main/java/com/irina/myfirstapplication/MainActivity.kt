package com.irina.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "Main Activity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val letters = setOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")

        letters.forEach {
            if (letters.indexOf(it) % 2 == 1)
                Log.d("letter", it)
        }
        Log.d(MY_OWN_LOG_TAG, "Ты видел деву на скале, \n В одежде белой над волнами,")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_OWN_LOG_TAG, "Когда, бушуя в бурной мгле, \n Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG, "Когда луч молний озарял \n Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG, "И ветер бился и летал \n С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG, "Прекрасно море в бурной мгле \n И небо в блесках без лазури;")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG, "Но верь мне: дева на скале \n Прекрасней волн, небес и бури.")
    }
}