package com.mike.android.sending_data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Get_information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_information);
        TextView text= findViewById(R.id.textview);
        if(savedInstanceState==null){
            Bundle extras= getIntent().getExtras();
            if(extras==null){
                String newString= null;

            }else {
                text.setText(extras.getString("mydata"));
            }
        }else
        {
            String str = (String) savedInstanceState.getSerializable("mydata");
            text.setText(str);
        }
    }
}
