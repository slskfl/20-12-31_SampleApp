package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editInput;
    Button btnTextShow, btnHomePagOpen;
    RadioButton rdoDog, rdoCat;
    ImageView ivPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInput=findViewById(R.id.edtInput);
        btnTextShow=findViewById(R.id.btnShow);
        btnHomePagOpen=findViewById(R.id.btnHome);
        rdoDog=findViewById(R.id.rdoDog);
        rdoCat=findViewById(R.id.rdoCat);
        ivPet=findViewById(R.id.ivPet);

        //글자 나타내기
        btnTextShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, editInput.getText().toString(), Toast.LENGTH_LONG);
            }
        });
        //홈페이지 열기 버튼
        btnHomePagOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+editInput.getText().toString()));
                startActivity(intent);
            }
        });
        //강아지 라디오 버튼 클릭
        rdoDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPet.setImageResource(R.drawable.dog);
            }
        });
        //고양이 라디오 버튼 클릭
        rdoCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPet.setImageResource(R.drawable.cat);
            }
        });
    }
}