package com.example.persegi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    TextView sisi;
    TextView luas;
    TextView keliling;

    RadioButton dtor;
    RadioButton rtod;

    Button count;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.desain);

        sisi = (TextView)this.findViewById(R.id.sisi);
        keliling = (TextView)this.findViewById(R.id.keliling);
        luas = (TextView)this.findViewById(R.id.luas);

        dtor = (RadioButton)this.findViewById(R.id.dtor);
        dtor.setChecked(true);
        rtod = (RadioButton)this.findViewById(R.id.rtod);

        count = (Button)this.findViewById(R.id.count);
        count.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (dtor.isChecked()){
            convertToLuas();}
        if (rtod.isChecked()){
            convertToKeliling();}
    }

    protected void convertToLuas() {
        double val= Double.parseDouble(sisi.getText().toString());
        luas.setText(Double.toString(val*val));
    }

    protected void convertToKeliling() {
        double val= Double.parseDouble(sisi.getText().toString());
        keliling.setText(Double.toString(val*4));
    }
}