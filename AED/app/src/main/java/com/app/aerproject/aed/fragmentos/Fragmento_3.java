package com.app.aerproject.aed.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.app.aedproject.aed.R;

/**
 * Created by bryan on 9/1/2017.
 */
public class Fragmento_3 extends Fragment {
    final String url ="http://aedpuce.ec/index.php/sample-page/actividades/";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmento3,container,false);
        WebView web = (WebView) rootView.findViewById(R.id.webver_actividades);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.setWebViewClient(new MyWebViewClient2() );
        web.loadUrl(url);
        return rootView;
    }

    private class  MyWebViewClient2 extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return  true;
        }
    }
}
