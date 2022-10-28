package kr.ac.mjc.midterm_2020261040;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    ArrayList<Student> studentList = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_activity);

        RecyclerView studentRv = findViewById(R.id.student_rv);

        for (int i = 1; i<=100; i++) {
            Student student = new Student();
            student.setName("김보미"+i);
            studentList.add(student);
        }
        StudentAdatper adatper = new StudentAdatper(studentList);
        studentRv.setAdapter(adatper);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        studentRv.setLayoutManager(layoutManager);
    }
}
