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
public class Fragmento_2 extends Fragment {
    final String url ="http://aedpuce.ec/index.php/inicio-2/directorio/";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmento2,container,false);
        WebView web = (WebView) rootView.findViewById(R.id.webver_directorio);
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
