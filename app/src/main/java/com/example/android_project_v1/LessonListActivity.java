package com.example.android_project_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.w3c.dom.ls.LSException;

public class LessonListActivity extends AppCompatActivity {

    ListView lessonListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_list);

        configure();
    }

    private void configure() {
        lessonListView = findViewById(R.id.listview_lesson_list);

        Lesson[] lessons = {
                new Lesson("Introduction to the course", 12, false),
                new Lesson("What is Javascript", 30, false),
                new Lesson("Variables and conditionals", 80, false),
                new Lesson("Loops", 38, false)
        };

        ArrayAdapter<Lesson> lessonArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lessons);
        lessonListView.setAdapter(lessonArrayAdapter);
    }
}