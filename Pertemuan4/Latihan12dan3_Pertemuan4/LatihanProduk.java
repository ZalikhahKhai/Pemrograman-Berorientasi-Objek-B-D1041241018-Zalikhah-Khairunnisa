/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 18/02/2026  
*/
package Pertemuan4.Latihan12dan3_Pertemuan4;

public class LatihanProduk {
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int stok = 15;
        boolean  tersedia = true;


        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk     : " + namaProduk);
        System.out.println("Harga Satuan    : " + hargaSatuan);
        System.out.println("Jumlah Stok     : " + stok);
        System.out.println("Status Tersedia : " + tersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok: Rp " + hargaSatuan * stok);

        double hasilPajak = (hargaSatuan * stok) * PAJAK;
        System.out.println("Pajak (11%)     : Rp " + hasilPajak);
    }
}