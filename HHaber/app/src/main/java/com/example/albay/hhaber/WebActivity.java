package com.example.albay.hhaber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webView=(WebView) findViewById(R.id.webView);
        String url=getIntent().getStringExtra("url");
        webView.setWebViewClient(new WebViewClient()); // olmassa link tarayıcıda açılıyor.
        webView.loadUrl(url);
    }
}
