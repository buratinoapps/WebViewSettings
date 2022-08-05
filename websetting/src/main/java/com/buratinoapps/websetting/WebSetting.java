package com.buratinoapps.websetting;

import android.webkit.WebSettings;

public class WebSetting {

    public static void setWebSettingsTrue(WebSettings webSettings) {
        webSettings.setAllowContentAccess(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);
        webSettings.setBlockNetworkImage(true);
        webSettings.setBlockNetworkLoads(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDisplayZoomControls(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setMediaPlaybackRequiresUserGesture(true);
        webSettings.setNeedInitialFocus(true);
        webSettings.setSaveFormData(true);
        webSettings.setSupportMultipleWindows(true);
        webSettings.setSupportZoom(true);
        webSettings.setUseWideViewPort(true);

    }

    public static void setWebSettingsFalse(WebSettings webSettings) {
        webSettings.setAllowContentAccess(false);
        webSettings.setAllowFileAccess(false);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setBlockNetworkImage(false);
        webSettings.setBlockNetworkLoads(false);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setDatabaseEnabled(false);
        webSettings.setDisplayZoomControls(false);
        webSettings.setDomStorageEnabled(false);
        webSettings.setGeolocationEnabled(false);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings.setJavaScriptEnabled(false);
        webSettings.setLoadWithOverviewMode(false);
        webSettings.setLoadsImagesAutomatically(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        webSettings.setNeedInitialFocus(false);
        webSettings.setSaveFormData(false);
        webSettings.setSupportMultipleWindows(false);
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(false);

    }

    public static void getWebSettings(WebSettings webSettings) {
        webSettings.getAllowContentAccess();
        webSettings.getAllowFileAccess();
        webSettings.getAllowFileAccessFromFileURLs();
        webSettings.getAllowUniversalAccessFromFileURLs();
        webSettings.getBlockNetworkImage();
        webSettings.getBlockNetworkLoads();
        webSettings.getBuiltInZoomControls();
        webSettings.getCacheMode();
        webSettings.getCursiveFontFamily();
        webSettings.getDatabaseEnabled();
        webSettings.getDefaultFixedFontSize();
        webSettings.getDefaultFontSize();
        webSettings.getDefaultTextEncodingName();
        webSettings.getDisplayZoomControls();
        webSettings.getDomStorageEnabled();
        webSettings.getFantasyFontFamily();
        webSettings.getFixedFontFamily();
        webSettings.getJavaScriptCanOpenWindowsAutomatically();
        webSettings.getJavaScriptEnabled();
        webSettings.getLayoutAlgorithm();
        webSettings.getLoadWithOverviewMode();
        webSettings.getLoadsImagesAutomatically();
        webSettings.getMediaPlaybackRequiresUserGesture();
        webSettings.getMinimumFontSize();
        webSettings.getMinimumLogicalFontSize();
        webSettings.getMixedContentMode();
        webSettings.getSansSerifFontFamily();
        webSettings.getSaveFormData();
        webSettings.getSerifFontFamily();
        webSettings.getStandardFontFamily();
        webSettings.getTextZoom();
        webSettings.getUseWideViewPort();
        webSettings.getUserAgentString();


    }

    public static void supportWebSettings(WebSettings webSettings) {
        webSettings.supportMultipleWindows();
        webSettings.supportZoom();
    }
}
