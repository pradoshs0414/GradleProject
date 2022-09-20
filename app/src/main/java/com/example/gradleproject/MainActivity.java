package com.example.gradleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view ){
        switch(view.getId()){
            case R.id.btnError:
                Toasty.error(this,"Something went wrong!",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.btnSuccess:
                Toasty.success(this,"Process completed Successfully",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.btnWarning:
                Toasty.warning(this,"Value should be numeric",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.btnInfo:
                Toasty.info(this,"Please enter the details.",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.btnImage:
                Toasty.normal(this,"Upload done!",Toasty.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_upload)).show();
                break;
        }
    }
}