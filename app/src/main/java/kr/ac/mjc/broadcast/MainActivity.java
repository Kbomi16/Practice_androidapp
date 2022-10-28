package kr.ac.mjc.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int call_result = checkSelfPermission(Manifest.permission.PROCESS_OUTGOING_CALLS);
            int sms_result = checkSelfPermission(Manifest.permission.RECEIVE_SMS);

            if (call_result != PackageManager.PERMISSION_GRANTED || sms_result != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{
                        Manifest.permission.PROCESS_OUTGOING_CALLS,
                        Manifest.permission.RECEIVE_SMS
                }, 0);
            }
        }
    }
}