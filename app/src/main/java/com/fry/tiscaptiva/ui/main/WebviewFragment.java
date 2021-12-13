package com.fry.tiscaptiva.ui.main;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.fry.tiscaptiva.databinding.FragmentWebviewBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WebviewFragment#-newInstance} factory method to
 * create an instance of this fragment.
 */
public class WebviewFragment extends Fragment {

    private FragmentWebviewBinding binding;

    @SuppressLint("SetJavaScriptEnabled")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentWebviewBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        String etId;

        Bundle bundle = this.getArguments();
        assert bundle != null;
        etId= bundle.getString("host");

        final WebView tView = binding.webPage;
        tView.getSettings().setUseWideViewPort(true);
        tView.getSettings().setLoadWithOverviewMode(true);
        tView.getSettings().setDomStorageEnabled(true);
        tView.getSettings().setAppCacheEnabled(true);
        tView.getSettings().setLoadsImagesAutomatically(true);
        tView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        tView.getSettings().setBlockNetworkImage(false);
        tView.getSettings().setBuiltInZoomControls(true);
        tView.getSettings().setJavaScriptEnabled(true);
        //tView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);


        tView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });
        tView.setOnKeyListener((v, keyCode, event) -> {
            if(event.getAction() == KeyEvent.ACTION_DOWN)
            {
                WebView webView = (WebView) v;

                switch(keyCode)
                {
                    case KeyEvent.KEYCODE_BACK:
                        if(webView.canGoBack())
                        {
                            webView.goBack();
                            return true;
                        }
                        break;
                }
            }

            return false;
        });
        tView.loadUrl(etId);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}