package com.example.recylerviewbaru;

public class MakananModel {
    private String namaMakanan;
    private String hargaMakanan;
    private int GambarMakanan;

    public MakananModel(String namaMakanan, String hargaMakanan, int GambarMakanan){
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.GambarMakanan = GambarMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public int getGambarMakanan(){
        return GambarMakanan;
    }
}