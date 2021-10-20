package nz.ac.wgtn.ecs.carbonfootprinttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class setupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        WebView webview = findViewById(R.id.webview);
        webview.loadUrl("www.google.com");
    }


}