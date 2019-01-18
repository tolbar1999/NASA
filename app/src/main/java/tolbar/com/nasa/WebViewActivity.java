package tolbar.com.nasa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class WebViewActivity extends AppCompatActivity {

    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.webView);
        String txtUrl = getIntent().getStringExtra("txtUrl");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://" + txtUrl);
    }

    public void cerrarActivity(View view) {
        finish();
    }
}
