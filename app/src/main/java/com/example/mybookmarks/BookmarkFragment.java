package com.example.mybookmarks;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.EventLogTags;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookmarkFragment extends Fragment implements View.OnClickListener{
    private ImageButton Zingmp3;
    private ImageButton Bluezone;
    private ImageButton Baomoi;
    private ImageButton Medium;
    WebView web;
    private View mView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_bookmark, container, false);
        Zingmp3 = mView.findViewById(R.id.zingmp3);
        Bluezone = mView.findViewById(R.id.bluezone);
        Baomoi = mView.findViewById(R.id.baomoi);
        Medium = mView.findViewById(R.id.medium);
        // handle event listener for buttons
        Zingmp3.setOnClickListener(this);
        Bluezone.setOnClickListener(this);
        Baomoi.setOnClickListener(this);
        Medium.setOnClickListener(this);



        return mView;

    }


    @Override
    public void onClick(View v) {
        FragmentManager manager = getFragmentManager();
        Fragment fragment = new WebViewFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        switch (v.getId()){
            case R.id.baomoi:
                args.putString("LINK","https://baomoi.com/");
                break;
            case R.id.bluezone:
                args.putString("LINK","https://bluezone.gov.vn/");

                break;
            case R.id.zingmp3:
                Log.i("LLLO","SUCCESS");
                args.putString("LINK","https://zingmp3.vn/");

                break;
            case R.id.medium:
                args.putString("LINK", "https://vnexpress.net/");

        }
        manager.beginTransaction()
                .replace(R.id.bookmark, fragment)
                .addToBackStack(null)
                .commit();
    }
    }
