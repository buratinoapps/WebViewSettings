package com.buratinoapps.webviewsettings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;

import com.buratinoapps.websetting.WebSetting;
import com.buratinoapps.webviewsettings.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    String url = "https://faucetpay.io";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.webView.loadUrl(url);

        WebSettings webSettings = binding.webView.getSettings();
        WebSetting.getWebSettings(webSettings);
        WebSetting.setWebSettingsTrue(webSettings);
        WebSetting.setWebSettingsFalse(webSettings);
        WebSetting.supportWebSettings(webSettings);
    }

    @Override
    public void onBackPressed() {
        binding.webView.goBack();
        super.onBackPressed();
    }
}