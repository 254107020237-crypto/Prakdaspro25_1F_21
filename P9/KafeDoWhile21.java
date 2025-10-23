package P9;

import java.util.Scanner;

public class KafeDoWhile21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        int kopi, teh, roti, totalharga;
        String namapelanggan;
        int hargakopi = 12000;
        int hargateh = 7000;
        int hargaroti = 20000;

do {
    System.out.print("Masukkan nama pelanggan (ketik 'batal'untuk keluar): ");
    namapelanggan = Akbar21.nextLine();
    if (namapelanggan.equalsIgnoreCase("batal")) {
        System.out.println("Transaksi dibatalkan");
        break;
    }
    
    System.out.print("Jumlah kopi: ");
    kopi = Akbar21.nextInt();
    System.out.print("Jumlah teh:");
    teh = Akbar21.nextInt();
    System.out.print("Jumlah roti:");
    roti = Akbar21.nextInt();
    totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
    System.out.println("Total yang harus dibayar: Rp " + totalharga);
    Akbar21.nextLine();
} while (true);
System.out.println("Transaksi selesai.");
    }
}
