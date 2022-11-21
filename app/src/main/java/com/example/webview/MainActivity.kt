package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var uri:EditText
    lateinit var click:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mywebView: WebView = findViewById(R.id.webView)
        mywebView.settings.javaScriptEnabled = true
        mywebView.webViewClient = WebViewClient()
        mywebView.loadUrl("https://www.google.com")
        uri = findViewById(R.id.uri)
        click = findViewById(R.id.click)
        click.setOnClickListener(){
            mywebView.loadUrl("https://"+uri.editableText)
        }
    }
}