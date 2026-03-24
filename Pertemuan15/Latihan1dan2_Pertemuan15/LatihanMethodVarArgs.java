/*
Nama: Zalikhah Khairunnisa
NIM: D1041241018
Tanggal: 24/03/2026  
*/
package Pertemuan15.Latihan1dan2_Pertemuan15;

public class LatihanMethodVarArgs {
    // Method untuk VarArgs menghitung rata-rata
    static double rataRata(int... nilai) { // Hanya boleh satu VarArgs, diletakkan di akhir
        if (nilai.length == 0) { // Error apabila rata-rata dibagi oleh 0
            return 0;
        }

        // Menghitung rata-rata
        int sum = 0;
        for (int i : nilai) {
            sum += i;
        } 
        return (double) sum / nilai.length;
    }
    public static void main(String[] args) {
        // Method VarArgs bisa menginput nilai sebanyak yang diinginkan dan fleksibel
        double rata1 = rataRata(80, 80, 80);
        System.out.println("Rata-rata (3 nilai): " + rata1);

        double rata2 = rataRata(80, 85, 88, 87, 90);
        System.out.println("Rata-rata (5 nilai): " + rata2);
    }
}
