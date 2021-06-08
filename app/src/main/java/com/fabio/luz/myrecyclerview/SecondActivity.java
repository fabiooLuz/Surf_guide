package com.fabio.luz.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView titulo, descricao;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        titulo = findViewById(R.id.titulo);
        descricao = findViewById(R.id.descricao);

      getData();
      setData();

    }
    private void getData(){
        if(getIntent().hasExtra("myImageView") && getIntent().hasExtra("data1")
        && getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImageView", 1);
        }else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        titulo.setText(data1);
        descricao.setText(data2);
        mainImageView.setImageResource(myImage);
    }
}