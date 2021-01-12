package com.geecktech.mydz31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity4 extends AppCompatActivity {
    Button button;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
      init ();
    }

 // Intent intent = getIntent();
  //  String message = intent.getStringExtra("message");
  //  TextView messageText = (TextView)findViewById(R.id.messagetext);
 //   messageText.setText()

    private void init() {
        button = findViewById(R.id.but);
        editText = findViewById(R.id.sum);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("ololo", editText.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
               // startActivity(intent);
                Log.e("TAG", "onClick  "+intent);
            }
        });
    }

}