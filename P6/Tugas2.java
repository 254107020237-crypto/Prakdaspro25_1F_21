package P6;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        System.out.print("Masukkan angka");
        int angka = Akbar21.nextInt();

        if (angka % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
