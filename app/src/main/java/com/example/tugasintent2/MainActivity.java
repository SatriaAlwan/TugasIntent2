package com.example.tugasintent2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button yutub, face, link, mail, x, insta, kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yutub = (Button) findViewById(R.id.youtube);
        yutub.setOnClickListener(this); // Pass 'this' as the listener

        face = (Button) findViewById(R.id.facebook);
        face.setOnClickListener(this); // Pass 'this' as the listener

        mail = (Button) findViewById(R.id.gmail);
        mail.setOnClickListener(this); // Pass 'this' as the listener

        insta = (Button) findViewById(R.id.instagram);
        insta.setOnClickListener(this); // Pass 'this' as the listener

        x = (Button) findViewById(R.id.twitter);
        x.setOnClickListener(this); // Pass 'this' as the listener

        link = (Button) findViewById(R.id.linked);
        link.setOnClickListener(this); // Pass 'this' as the listener

        kembali = (Button) findViewById(R.id.tombolkembali);
        kembali.setOnClickListener(this); // Pass 'this' as the listener

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tombolkembali) {
            Intent explicit = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(explicit);
        } else if (v.getId() == R.id.youtube) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mhsG7K8Ko"));
            startActivity(implicit);
        } else if (v.getId() == R.id.facebook) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/bintang.hikki?mibextid=ZbWKwL"));
            startActivity(implicit);
        } else if (v.getId() == R.id.linked) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/SatriaAlwan?tab=repositories"));
            startActivity(implicit);
        }else if (v.getId() == R.id.gmail) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox/FMfcgzGxTFXLSJCRHRggVRJfqWwJWnGf"));
            startActivity(implicit);
        }else if (v.getId() == R.id.twitter) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=l2bBUw6pFxQ"));
            startActivity(implicit);
        }else if (v.getId() == R.id.instagram) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ilcyber4?igsh=dnB6am9ibmpkMjlj"));
            startActivity(implicit);
        }
    }

}