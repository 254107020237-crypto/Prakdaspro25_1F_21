package P9;

import java.util.Scanner;

public class SiakadFor21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        double nilai, tertinggi=0, terendah=100;

        for (int i =1; i <= 10; i++) {
        }

        for (int i =1; i <= 10; i++) {
            System.out.print("Masukkan Mahasiswa ke-" + i + ":");
            nilai = Akbar21.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai terendah: " +tertinggi);
        System.out.println("Nilai terendah:" +terendah);
    }
}

