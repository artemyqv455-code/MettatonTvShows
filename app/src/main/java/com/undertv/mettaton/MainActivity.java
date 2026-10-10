package com.undertv.mettaton;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;
public class MainActivity extends Activity {
  WebView web;
  @Override public void onCreate(Bundle state){super.onCreate(state);getWindow().getDecorView().setSystemUiVisibility(5894|1024|512);web=new WebView(this);web.getSettings().setJavaScriptEnabled(true);web.getSettings().setDomStorageEnabled(true);web.setWebViewClient(new WebViewClient());setContentView(web);web.loadUrl("file:///android_asset/index.html");}
  @Override public void onBackPressed(){web.evaluateJavascript("window.goBack && window.goBack()",null);}
}
