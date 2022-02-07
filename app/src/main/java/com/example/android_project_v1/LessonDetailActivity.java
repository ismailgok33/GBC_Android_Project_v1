package com.example.android_project_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LessonDetailActivity extends AppCompatActivity {

    TextView lessonDetailTextView;
    TextView lessonLengthTextView;
    Button completeLessonButton;
    Lesson lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_detail);

        configure();


    }

    private void completeLesson() {
        lesson.isCompleted = true;
    }

    private void configure() {
        lessonDetailTextView = findViewById(R.id.textview_lesson_detail);
        lessonLengthTextView = findViewById(R.id.textview_lesson_length);
        completeLessonButton = findViewById(R.id.button_mark_complete);

        lesson = getLessonInfo();

        lessonDetailTextView.setText(lesson.name);
        lessonLengthTextView.setText(lesson.lengthConverter(lesson.length));

        completeLessonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                completeLesson();
                finish();
            }
        });
    }

    private Lesson getLessonInfo() {
        int lessonNumber = getIntent().getIntExtra("LessonNumber", 0);
        int index = lessonNumber--;
        return Lesson.getInstance(index);
    }
}