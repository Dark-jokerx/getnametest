package com.example.sairamkrishna.getnametest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String name,lasttnam;
     EditText mfistname ;
     EditText mlastname ;
     Button mbuton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfistname = (EditText) findViewById(R.id.first_name);
        mlastname = (EditText)findViewById(R.id.last_namr);
        mbuton = (Button) findViewById(R.id.button);

 mbuton.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         name = mfistname.getText().toString();
         lasttnam = mlastname.getText().toString();
         String finall = name + "  "+lasttnam;
deplay(finall);
     }
 });
    }
    public void deplay (String name1){
         TextView resulten = (TextView) findViewById(R.id.finamll);
         String ses =  "your name is :"+ name1;
         String tet = ses.toUpperCase();
         resulten.setText(tet);
    }
}






