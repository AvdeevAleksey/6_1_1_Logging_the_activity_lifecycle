package ru.avdeev.android.a6_1_1_logging_the_activity_lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private String methodName;
    private TextView textView;
    public static final String BUNGLE_STRING_KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        methodName = getString(R.string.onCreateMethod);


        Log.d("Lifecycle", "call onCreate()");
        if (savedInstanceState == null){
            Log.d("Lifecycle", "saveInstanceState == null");
        }
        else {
            Log.d("Lifecycle", "saveInstanceState != null");
        }

        setMyMethodNameInTextViewAndLog(methodName);
        Button button = findViewById(R.id.btnNewActivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        methodName = getString(R.string.onPostCreateMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        methodName = getString(R.string.onPostResumeMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        methodName = getString(R.string.onStartMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        methodName = getString(R.string.onStopMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        methodName = getString(R.string.onDestroyMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        methodName = getString(R.string.onRestartMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    protected void onResume() {
        super.onResume();
        methodName = getString(R.string.onResumeMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    protected void onPause() {
        super.onPause();
        methodName = getString(R.string.onPauseMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        methodName = getString(R.string.onKeyDownMethod);
        setMyMethodNameInTextViewAndLog(methodName);

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        methodName = getString(R.string.onKeyLongPressMethod);
        setMyMethodNameInTextViewAndLog(methodName);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        methodName = getString(R.string.onBackPressedMethod);
        setMyMethodNameInTextViewAndLog(methodName);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        methodName = getString(R.string.onSaveInstanceStateMethod);
        setMyMethodNameInTextViewAndLog(methodName);
        outState.putString(BUNGLE_STRING_KEY,textView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        methodName = getString(R.string.onRestoreInstanceStateMethod);
        setMyMethodNameInTextViewAndLog(methodName);
        textView.setText(savedInstanceState.getString(BUNGLE_STRING_KEY));
    }

    private void setMyMethodNameInTextViewAndLog (String methodName) {
        Log.d("Lifecycle", methodName);
        textView.append("\n" + methodName);
    }
}