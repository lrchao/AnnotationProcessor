package com.lrchao.annotationprocessor;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.lrchao.CustomAnnotation;
import com.lrchao.annotationprocessor.generated.GeneratedClass;

@CustomAnnotation
public class MainActivity extends AppCompatActivity {

    @CustomAnnotation
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showAnnotationMessage();
    }

    private void showAnnotationMessage() {
        GeneratedClass generatedClass = new GeneratedClass();
        String message = generatedClass.getMessage();
        // android.support.v7.app.AlertDialog
        new AlertDialog.Builder(this)
                .setPositiveButton("Ok", null)
                .setTitle("Annotation Processor Messages")
                .setMessage(message)
                .show();
    }
}
