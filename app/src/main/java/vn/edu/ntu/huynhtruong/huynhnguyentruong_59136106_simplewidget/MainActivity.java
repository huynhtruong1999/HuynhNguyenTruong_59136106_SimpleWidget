package vn.edu.ntu.huynhtruong.huynhnguyentruong_59136106_simplewidget;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup grbutton;
    Button bt;
    EditText ten,ns,stkhac;
    RadioButton nu,nam;
    CheckBox phim,nhac,home,nau,cafe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvent();
    }
    private void addViews()
    {
        ten = findViewById(R.id.ten);
        ns = findViewById(R.id.ns);
        grbutton = findViewById(R.id.grbutton);
        stkhac = findViewById(R.id.stkhac);
        bt = findViewById(R.id.bt);
        nu = findViewById(R.id.nu);
        nam = findViewById(R.id.nam);
        phim = findViewById(R.id.phim);
        cafe = findViewById(R.id.cafe);
        home = findViewById(R.id.home);
        nau = findViewById(R.id.nau);
        nhac= findViewById(R.id.nhac);

    }
    private  void addEvent()
    {
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonxn();
            }
        });
    }
    private void buttonxn()
    {
        int sex = this.grbutton.getCheckedRadioButtonId();
        String name = ten.getText().toString().trim();
        String date = ns.getText().toString().trim();
        RadioButton grbt = this.findViewById(sex);
        String sothich ="";
        if(nhac.isChecked()){
            if (sothich.length()>0){
                sothich+= ",";
            }
            sothich += "Nghe Nhạc";
        }
        if(phim.isChecked()){
            if (sothich.length()>0){
                sothich+= ",";
            }
            sothich += "Xem Phim";
        }
        if(nau.isChecked()){
            if (sothich.length()>0){
                sothich+= ",";
            }
            sothich += "Vào Bếp Nấu Ăn";
        }
        if(home.isChecked()){
            if (sothich.length()>0){
                sothich+= ",";
            }
            sothich += "Ở nhà một mình";
        }
        if(cafe.isChecked()){
            if (sothich.length()>0){
                sothich+= ",";
            }
            sothich += "Đi cafe với bạn";
        }
        sothich+=",";
        sothich += stkhac.getText().toString().trim();
        String xuat = name + "\nNgaySinh : " + date + "\nGiới Tính : " + grbt.getText() + "\nSở Thích : " + sothich ;
        Toast.makeText(getApplicationContext(), xuat, Toast.LENGTH_SHORT).show();
    }

}