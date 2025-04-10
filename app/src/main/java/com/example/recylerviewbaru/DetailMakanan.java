package com.example.recylerviewbaru;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMakanan extends AppCompatActivity {
    TextView tvNamaMakananDetail;
    TextView tvHargaMakananDetail;
    ImageView tvGambarMakananDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);

        tvNamaMakananDetail = findViewById(R.id.tvNamaMakananDetail);
        tvHargaMakananDetail = findViewById((R.id.tvHargaMakananDetail));
        tvGambarMakananDetail = findViewById(R.id.tvGambarMakananDetail);

        Intent intent = getIntent();
        String NamaMakanan = intent.getStringExtra("NamaMakanan");
        String HargaMakanan = intent.getStringExtra("HargaMakanan");
        int GambarMakanan = intent.getIntExtra("GambarMakanan",1);
        tvNamaMakananDetail.setText(NamaMakanan);
        tvHargaMakananDetail.setText(HargaMakanan);
        tvGambarMakananDetail.setImageResource(GambarMakanan);


    }
}