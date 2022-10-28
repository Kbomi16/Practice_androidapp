package kr.ac.mjc.ict2020261040;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState); // 두가지의 오버로드 된 메소드가 있음
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 1개 있는 곳에만 설정해 줘야됨!! 중요!!

        //레이아웃 설정
        setContentView(R.layout.activity_join);

        Intent intent=getIntent();
        String email=intent.getStringExtra("email");
        String password=intent.getStringExtra("password");

        EditText emailEt = findViewById(R.id.email_et);
        EditText passwordEt = findViewById(R.id.password_et);
        emailEt.setText(email);
        passwordEt.setText(password);
    }
}
