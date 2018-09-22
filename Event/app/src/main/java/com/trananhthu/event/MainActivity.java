package com.trananhthu.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //C2.private Button btn;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     /* cách 1:
    public void tong2so (View v ) {
     System.out.print("tong2so");
        EditText edita = (EditText) findViewById(R.id.edita);
        int a = Integer.parseInt(edita.getText() + "");
        EditText editb = (EditText) findViewById(R.id.editb);
        int b = Integer.parseInt(editb.getText() + "");
        TextView kq = (TextView) findViewById(R.id.kq);
        kq.setText((a + b) + "");
        }*/

     /* cách 2:
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("tong2so");
                EditText edita = (EditText) findViewById(R.id.edita);
                int a = Integer.parseInt(edita.getText() + "");
                EditText editb = (EditText) findViewById(R.id.editb);
                int b = Integer.parseInt(editb.getText() + "");
                TextView kq = (TextView) findViewById(R.id.kq);
                kq.setText((a + b) + "");
            }
        }); */

        // cách 3:
        btn.findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        // int id = v.getId();
        System.out.print("tong2so");
        EditText edita = (EditText) findViewById(R.id.edita);
        int a = Integer.parseInt(edita.getText() + "");
        EditText editb = (EditText) findViewById(R.id.editb);
        int b = Integer.parseInt(editb.getText() + "");
        TextView kq = (TextView) findViewById(R.id.kq);
        kq.setText((a + b) + "");
    }
}
