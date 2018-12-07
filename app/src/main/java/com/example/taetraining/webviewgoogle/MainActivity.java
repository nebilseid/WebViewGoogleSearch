package com.example.taetraining.webviewgoogle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private WebView webView;
    private EditText etSearch;
    private Button btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        etSearch = findViewById(R.id.etSearch);
        btnSearch = findViewById(R.id.btnSearch);


    }

    public void doSomething(View view) {
        WebViewClient webViewClient = new WebViewClient();
        WebSettings webSettings = webView.getSettings();
        String url = etSearch.getText().toString();
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl(url);


    }
}
