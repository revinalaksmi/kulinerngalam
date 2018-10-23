package com.example.globalstore.kulinernusantara;

public class MenuModel {
    private int id;
    private String nama;
    private String jenis;
    private String harga;
    private String bahan;
    private String review;

    public MenuModel(int id, String nama, String jenis, String harga, String bahan, String review) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.bahan = bahan;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public String getHarga() {
        return harga;
    }

    public String getBahan() {
        return bahan;
    }

    public String getReview() {
        return review;
    }
}
