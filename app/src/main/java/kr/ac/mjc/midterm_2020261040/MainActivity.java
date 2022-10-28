package kr.ac.mjc.midterm_2020261040;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText idEt = findViewById(R.id.id_et);
        EditText passwordEt = findViewById(R.id.password_et);
        Button loginBtn=findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=idEt.getText().toString();
                String password = passwordEt.getText().toString();

                if(id.equals("2020261040") && password.equals("1234")) {
                    Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    intent.putExtra("id", id);
                    intent.putExtra("password", password);
                    startActivity(intent);
               }else {
                    Toast.makeText(getApplicationContext(), "아이디 또는 패스워드가 틀렸습니다.", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }




}