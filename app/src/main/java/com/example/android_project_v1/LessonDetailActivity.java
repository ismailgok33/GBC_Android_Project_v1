package com.example.android_project_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LessonDetailActivity extends AppCompatActivity {

    TextView lessonDetailTextView;
    TextView lessonLengthTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_detail);

        configure();
    }

    private void configure() {
        lessonDetailTextView = findViewById(R.id.textview_lesson_detail);
        lessonLengthTextView = findViewById(R.id.textview_lesson_length);

        Lesson lesson = getLessonInfo();
        lessonDetailTextView.setText(lesson.name);
        lessonLengthTextView.setText(lesson.lengthConverter(lesson.length));

    }

    private Lesson getLessonInfo() {
        String name = getIntent().getStringExtra("LessonName");
        int length = getIntent().getIntExtra("LessonLength", 0);
        boolean isCompleted = getIntent().getBooleanExtra("lessonCompleted", false);

        return new Lesson(name, length, isCompleted);
    }
}