package com.leo.ffpanel;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        webView.setBackgroundColor(0xFF101018);
        webView.loadUrl("file:///android_asset/index.html");

        setContentView(webView);
    }
}
