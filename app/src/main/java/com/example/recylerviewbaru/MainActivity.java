package com.example.recylerviewbaru;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterListMakanan.OnItemClickListener{

    RecyclerView rvListMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvListMakanan = (RecyclerView) findViewById(R.id.rvListMakanan);
        rvListMakanan.setLayoutManager(new LinearLayoutManager(this));
        // prepare data arraylist
        ArrayList<MakananModel> dataMakanan = new ArrayList<>();
        dataMakanan.add(new MakananModel("Nasi Goreng", "Rp.11.000",R.drawable.nasgor));
        dataMakanan.add(new MakananModel("Ayam Geprek", "Rp.9.000",R.drawable.ayam_geprek));
        dataMakanan.add(new MakananModel("Seblak", "Rp.15.000", R.drawable.seblak));
        dataMakanan.add(new MakananModel("Sate Ayam", "Rp.10.000", R.drawable.sate));

        // call adapter class
        AdapterListMakanan adapterListMakanan = new AdapterListMakanan(dataMakanan, this);
        rvListMakanan.setAdapter(adapterListMakanan);

    }

    @Override
    public void onItemClick(MakananModel makananModel) {
        Toast.makeText(this, makananModel.getNamaMakanan(), Toast.LENGTH_SHORT).show();
        //mainactivity makanan ke Detail makanan
        Intent in = new Intent(MainActivity.this, DetailMakanan.class);
        //memberikan data
        in.putExtra("NamaMakanan",makananModel.getNamaMakanan());
        in.putExtra("HargaMakanan",makananModel.getHargaMakanan());
        in.putExtra("GambarMakanan",makananModel.getGambarMakanan());
        startActivity(in);

    }
}