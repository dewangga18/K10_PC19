package www.smktelkom.sch.id.pc19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Awas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awas);

        WebView webView = findViewById(R.id.weba);

        //load laman
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        //tambahan
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());

        //url web
        webView.loadUrl("https://www.google.com/search?kgmid=/g/11j2cc_qll&hl=id-ID&q=Virus+Corona&kgs=12df67b22db95e19&shndl=0&source=sh/x/kp/osrp&entrypoint=sh/x/kp/osrp#wptab=s:H4sIAAAAAAAAAONgVuLVT9c3NMwySk6OL8zJecTozS3w8sc9YSmnSWtOXmO04eIKzsgvd80rySypFNLjYoOyVLgEpVB1ajBI8XOhCvHsYuLzSE3MKckIrswtKMnPLV7EKpyempWYk6hQlllUWqyQnF-Un5cIAMgpTuKGAAAA");
    }
}