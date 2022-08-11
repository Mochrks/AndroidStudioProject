package com.example.fourthapps_1151;

import android.graphics.Bitmap;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {
    WebView webView;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); webView =
                (WebView) findViewById(R.id.webView); bar =
                (ProgressBar) findViewById(R.id.progressBar2);
        webView.setWebViewClient(new MyWebClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://akademik.unjani.ac.id");
    }
    public class MyWebClient extends WebViewClient{
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url); bar.setVisibility(View.GONE);
        }
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
    @Override public boolean onKeyDown(int keyCode, KeyEvent
            event) { if((keyCode== KeyEvent.KEYCODE_BACK) &&
            webView.canGoBack()){ webView.goBack();
        return true;
    } return
            super.onKeyDown(keyCode, event);
    }
}
