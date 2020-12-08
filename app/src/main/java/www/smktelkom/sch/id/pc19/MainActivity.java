package www.smktelkom.sch.id.pc19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton peta,panduan,awas,berita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peta = findViewById(R.id.peta);
        peta.setOnClickListener(this);

        panduan = findViewById(R.id.pand);
        panduan.setOnClickListener(this);

        awas = findViewById(R.id.awas);
        awas.setOnClickListener(this);

        berita = findViewById(R.id.berita);
        berita.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.peta:
                 Intent map = new Intent(MainActivity.this, Peta.class);
                 startActivity(map);
                 break;

            case R.id.awas:
                 Intent care = new Intent(MainActivity.this, Awas.class);
                 startActivity(care);
                 break;

            case R.id.pand:
                 Intent step = new Intent(MainActivity.this, Panduan.class);
                 startActivity(step);
                 break;

            case R.id.berita:
                 Intent detail = new Intent(MainActivity.this, Berita.class);
                 startActivity(detail);
                 break;
        }
    }
}