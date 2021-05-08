package com.example.mybookmarks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class WebViewFragment extends Fragment implements View.OnClickListener{
    WebView web;
    private View mView;
    private Button back;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.fragment_web_view, container, false);

        back = mView.findViewById(R.id.button);

        String data = getArguments().getString("LINK");

        WebView webView = mView.findViewById(R.id.webview1);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        webView.setWebViewClient(new Callback());
        webView.loadUrl(data);
        back.setOnClickListener(this);
        return mView;
    }

    @Override
    public void onClick(View v) {
        FragmentManager manager = getFragmentManager();
        manager.popBackStack();
    }
//    private class Callback extends WebViewClient {
//        @Override
//        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
//            return false;
//        }
//    }



}