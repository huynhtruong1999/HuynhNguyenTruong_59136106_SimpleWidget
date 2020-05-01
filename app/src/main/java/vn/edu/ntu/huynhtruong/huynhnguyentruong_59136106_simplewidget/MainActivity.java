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

    RadioGroup grdbt;
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
        grdbt = findViewById(R.id.grdbt);
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
        int sex = this.grdbt.getCheckedRadioButtonId();
        String name = ten.getText().toString().trim();
        String date = ns.getText().toString().trim();
        RadioButton grbt = this.findViewById(sex);
        String st ="";
        if(nhac.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Nghe Nhạc";
        }
        if(phim.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Xem Phim";
        }
        if(nau.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Vào Bếp Nấu Ăn";
        }
        if(home.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Ở nhà một mình";
        }
        if(cafe.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Đi cafe với bạn";
        }
        st +=",";
        st += stkhac.getText().toString().trim();
        String xuat = name + "\nNgaySinh : " + date + "\nGiới Tính : " + grbt.getText() + "\nSở Thích : " + st ;
        Toast.makeText(getApplicationContext(), xuat, Toast.LENGTH_SHORT).show();
    }

}