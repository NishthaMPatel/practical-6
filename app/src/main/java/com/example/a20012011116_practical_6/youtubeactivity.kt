package com.example.a20012011116_practical_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class YouTube_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtubeactivity)


        val youtubeid=""
        val mywebview = findViewById<WebView>(R.id.webview)
        val setting = mywebview.settings
        setting.javaScriptEnabled=true
        setting.loadWithOverviewMode=true
        setting.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")

    }
}