package com.trananhthu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.trananhthu.calculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et;
    private TextView tv;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;

    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;
    private Button btnBang;
    private Button btnCham;
    private Button btnC;
    private Button btnAC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickView ();
    }
    public void initWidget()
    {
        et = (EditText) findViewById(R.id.et);
        tv = (TextView) findViewById(R.id.tv);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        btnCham = (Button) findViewById(R.id.btnCham);
        btnC = (Button) findViewById(R.id.btnC);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnBang = (Button) findViewById(R.id.btnBang);
    }

    //dùng để bắt được sự kiện
    public void setEventClickView ()
    {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnCham.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnAC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                //TO DO
                et.append("0");
                break;
            case R.id.btn1:
                //TO DO
                et.append("1");
                break;
            case R.id.btn2:
                //TO DO
                et.append("2");
                break;
            case R.id.btn3:
                //TO DO
                et.append("3");
                break;
            case R.id.btn4:
                //TO DO
                et.append("4");
                break;
            case R.id.btn5:
                //TO DO
                et.append("5");
                break;
            case R.id.btn6:
                //TO DO
                et.append("6");
                break;
            case R.id.btn7:
                //TO DO
                et.append("7");
                break;
            case R.id.btn8:
                //TO DO
                et.append("8");
                break;
            case R.id.btn9:
                //TO DO
                et.append("9");
                break;
            case R.id.btnCong:
                //TO DO
                et.append("+");
                break;
            case R.id.btnTru:
                //TO DO
                et.append("-");
                break;
            case R.id.btnNhan:
                //TO DO
                et.append("*");
                break;
            case R.id.btnChia:
                //TO DO
                et.append("/");
                break;
            case R.id.btnCham:
                //TO DO
                et.append(".");
                break;
            case R.id.btnC:
                //TO DO
              /*C1:  Xóa kí tự cuối cùng khi click nút C
               String numberAfterRemove = deleteANumber(et.getText().toString());
               et.setText(numberAfterRemove);*/
                BaseInputConnection textFileInputConnection = new BaseInputConnection(et, true);
                textFileInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                break;
            case R.id.btnAC:
                //TO DO
                et.setText("");
                break;
            case R.id.btnBang:
                //TO DO
                // Lấy số vừa mới nhập chuyển sang kiểu string để sau có thể chuyển số vừa nhập sang kiểu int
                //String numberA = et.getText().toString();
                int numberA = Integer.parseInt(et.getText().toString());
                break;
        }
    }

  /
}
