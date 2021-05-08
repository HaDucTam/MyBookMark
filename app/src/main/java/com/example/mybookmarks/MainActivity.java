package com.example.mybookmarks;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    WebView web;
    private View container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        web = findViewById(R.id.webview);
//        WebSettings webSettings = web.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        web.setWebViewClient(new Callback());
//        web.loadUrl("https://mp3.zing.vn/");



        FragmentManager manager = getSupportFragmentManager();
        Fragment bookmarks = new BookmarkFragment();
        manager.beginTransaction().replace(R.id.frame,bookmarks).commit();

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.webview, new BookmarkFragment());
//        fragmentTransaction.commit();
    }
//    private class Callback extends WebViewClient {
//        @Override
//        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
//            return false;
//        }
//    }




}