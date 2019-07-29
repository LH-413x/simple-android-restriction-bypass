package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    final String TAG="413x";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart(){
        super.onStart();
        re.android.hiddenapi.MainActivity ma=new re.android.hiddenapi.MainActivity();
        ma.disable();
        if(!ma.isHiddenApiEnabled()){
            Log.d(TAG,"hiddlen api enabled");
        }
        if(!ma.isProtectedNamespaceEnabled()){
            Log.d(TAG,"protected namespace enabled");
        }
    }


}
