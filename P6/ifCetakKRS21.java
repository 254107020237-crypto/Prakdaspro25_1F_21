package P6;

import java.util.Scanner;

public class ifCetakKRS21 {
    
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) :");
        boolean uktLunas = Akbar21.nextBoolean();

    String pesan= (uktLunas) 
            ? "pembayaran UKT terverivikasi.\nSilakan cetak KRS dan minta tanda tangan DPA."
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
    System.out.println(pesan);
    }
}
       