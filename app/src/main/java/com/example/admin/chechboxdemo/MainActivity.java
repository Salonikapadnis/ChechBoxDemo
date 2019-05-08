package com.example.admin.chechboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox acheckbox,jcheckbox,pcheckbox,phcheckbox,ucheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        acheckbox=findViewById(R.id.androidcheckBox);
        acheckbox.setOnClickListener(this);
        jcheckbox=findViewById(R.id.javacheckBox);
        jcheckbox.setOnClickListener(this);
        pcheckbox=findViewById(R.id.pythoncheckBox);
        pcheckbox.setOnClickListener(this);
        phcheckbox=findViewById(R.id.phpcheckBox);
        phcheckbox.setOnClickListener(this);
        ucheckbox=findViewById(R.id.unitycheckBox);
        ucheckbox.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.androidcheckBox:
                if (acheckbox.isChecked())
                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_SHORT).show();
                break;
            case R.id.javacheckBox:
                if(jcheckbox.isChecked())
                    Toast.makeText(getApplicationContext(),"Java",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pythoncheckBox:
                if (phcheckbox.isChecked())
                    Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_SHORT).show();
                break;
            case R.id.phpcheckBox:
                Toast.makeText(getApplicationContext(),"PHP",Toast.LENGTH_SHORT).show();
                break;
            case R.id.unitycheckBox:
                if(ucheckbox.isChecked())
                    Toast.makeText(getApplicationContext(),"Unity 3D",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
