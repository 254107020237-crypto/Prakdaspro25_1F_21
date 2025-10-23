package P9;

import java.util.Scanner;

public class Tugas1_21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        
        int jmltiket, hrgtiket = 50000, ttltiket = 0;
        double hrgdasar, diskon, ttlbayar, ttlPendapatan = 0;
        String lanjut;

        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            jmltiket = Akbar21.nextInt();

            if (jmltiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.");
                continue; 
            }
            
            hrgdasar = jmltiket * hrgtiket;

            if (jmltiket > 10) {
                diskon = 0.15;
            } else if (jmltiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            ttlbayar = hrgdasar - (hrgdasar * diskon);

            ttltiket += jmltiket;
            ttlPendapatan += ttlbayar;

            System.out.println("Harga Dasar   : Rp " + hrgdasar);
            System.out.println("Diskon        : " + (diskon * 100) + "%");
            System.out.println("Total Bayar   : Rp " + ttlbayar + "\n");
             System.out.print("Apakah ada pelanggan lain? (True/False): ");
            lanjut = Akbar21.next();
            if (lanjut.equalsIgnoreCase("N")) {
                break;
                 
              }
              System.out.println();

        System.out.println("====================================");
        System.out.println("Total Tiket Terjual   : " + ttltiket);
        System.out.println("Total Pendapatan Hari : Rp " + ttlPendapatan);
        System.out.println("====================================");
    }
}
}
