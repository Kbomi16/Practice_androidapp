package kr.ac.mjc.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView studentRv = findViewById(R.id.student_rv);

        for (int i = 1; i<=1000; i++) {
            Student student = new Student();
            student.setName("김보미"+i);
            student.setName("20202610"+i);
            studentList.add(student);
        }
        StudentAdatper adatper = new StudentAdatper(studentList);
        studentRv.setAdapter(adatper);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        studentRv.setLayoutManager(layoutManager);
    }
}