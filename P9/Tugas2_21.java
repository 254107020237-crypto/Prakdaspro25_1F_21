package P9;

import java.util.Scanner;

public class Tugas2_21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        int jenis, durasi, totalharga, mobil, motor, keluar=0;
        int parkirmobil = 3000;
        int parkirmotor = 2000;
        String jeniskendaraan;

do {
    System.out.println("Masukkan jenis kendaraan mobil/motor (ketik 'batal' untuk keluar):");
    jeniskendaraan = Akbar21.nextLine();
    if (jeniskendaraan.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan");
        break;
    }
    System.out.println("Masukkan durasi (jam): ");
    durasi = Akbar21.nextInt();

     if (jeniskendaraan.equalsIgnoreCase("mobil")) {
        if (durasi > 5) {
            totalharga = 12500;
        } else {
            totalharga = durasi * parkirmobil;
        }
        System.out.println("total harga:  Rp " + totalharga);
     } else if (jeniskendaraan.equalsIgnoreCase("motor")) {
                if (durasi > 5) {
            totalharga =  12500;
        } else {
            totalharga = durasi * parkirmotor;
        }
        System.out.println("total harga:  Rp " + totalharga);
     } else {
            System.out.println("Apakah anda ingin keluar? (ya/tidak): ");
            keluar = Akbar21.nextInt();
            }
     
} while (keluar !=0);
System.out.println("Transaksi selesai.");
    }
}
