package P6;

import java.util.Scanner;

public class ifCetakKRS26 {
    
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) :");
        boolean uktLunas = Akbar21.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverivikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    }else{
        System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    }
    }}