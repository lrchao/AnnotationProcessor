package com.lrchao.annotationprocessor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lrchao.BindView;
import com.lrchao.injectview.InjectView;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView mTextView;

    @BindView(R.id.text2)
    TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InjectView.bind(this);

        mTextView.setText("text changged!");
    }


}
