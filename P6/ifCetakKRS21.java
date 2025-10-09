package P6;

import java.util.Scanner;

public class ifCetakKRS21 {
    
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) :");
        boolean uktLunas = Akbar21.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran ukt terverivikasi");
         System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
    } 
    else {
        System.out.println("Registrasi ditolak");
         System.out.println("Silakan melunasi UKT terlebih dahulu");
        
    }
    }
}
       