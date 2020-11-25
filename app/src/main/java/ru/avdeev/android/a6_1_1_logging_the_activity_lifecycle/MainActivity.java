package ru.avdeev.android.a6_1_1_logging_the_activity_lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String methodName;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        methodName = getString(R.string.onCreateMethod);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        methodName = getString(R.string.onPostCreateMethod);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        methodName = getString(R.string.onPostResume);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        methodName = getString(R.string.onStartMethod);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        methodName = getString(R.string.onStopMethod);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        methodName = getString(R.string.onDestroyMethod);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        methodName = getString(R.string.onRestartMethod);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onResume() {
        super.onResume();
        methodName = getString(R.string.onResumeMethod);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onPause() {
        super.onPause();
        methodName = getString(R.string.onPauseMethod);
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }
}