package kr.ac.mjc.ict2020261040;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { // 상속 받아

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //이거 항상 먼저 해줘야 됨

        EditText emailEt = findViewById(R.id.email_et);
        EditText passwordEt = findViewById(R.id.password_et);

        Button loginBtn=findViewById(R.id.login_btn);
        Button joinBtn=findViewById(R.id.join_btn);

        // 회원가입 누르면 회원가입 화면 나타낼 수 있도록
        joinBtn.setOnClickListener(new View.OnClickListener() { // 입력 클래스, 변수에 넣지 않고 바로 파라미터에 넣어줘서 익명 클래스로 들어감
            @Override
            public void onClick(View view) { // 온클릭 인터페이스 새로 생성하면서 들어감
                // 액티비티가 실행될 수 있도록 함 Intent로 호출
                String email=emailEt.getText().toString();
                String password = passwordEt.getText().toString();

                Intent intent = new Intent(MainActivity.this, JoinActivity.class); //this를 타고타고 올라가면 Context를 만날 수 있음 그래서 화면이 띄워지게 됨
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent); // 시작하는 거
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart");
    }
}