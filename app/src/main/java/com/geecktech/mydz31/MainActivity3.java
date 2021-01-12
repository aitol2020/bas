package com.geecktech.mydz31;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private static final int REQUST_CODE = 500;
    Button btn;
    ImageView btnkon;
    ImageView btnGoogle;
    ImageView btnkam;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn = findViewById(R.id.btn);
        btnkon = findViewById(R.id.kon);
        btnGoogle = findViewById(R.id.goo);
        btnkam = findViewById(R.id.kam);
        textView = findViewById(R.id.tv);



        btnkam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCamera = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(intentCamera);
            }
        });
        btnkon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+996) 706 160 446"));
                startActivity(intent1);
            }

        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "The Colesseum";
                Intent intentGoogle = new Intent(Intent.ACTION_WEB_SEARCH);
                intentGoogle.putExtra(SearchManager.QUERY,text);
                startActivity(intentGoogle);
            }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivityForResult(intent,REQUST_CODE);
            }
        });


        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUST_CODE && resultCode == RESULT_OK){
            String value = data.getStringExtra("ololo");
            textView.setText(value);

        }

    }
}
