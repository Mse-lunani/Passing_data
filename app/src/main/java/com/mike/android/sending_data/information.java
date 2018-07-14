package com.mike.android.sending_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        final EditText message = (EditText)findViewById(R.id.kk);
        Button save= (Button)findViewById(R.id.button);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strname= "mydata";
                String info= String.valueOf(message.getText());
               Intent i = new Intent(information.this,Get_information.class);
               i.putExtra(strname,info);
               startActivity(i);
            }

        });




    }
}
