package P6;

import java.util.Scanner;

public class Tugas3Izinmasukperpus {
    public static void main(String[] args) {
        Scanner Akbar21= new Scanner(System.in);
        System.out.println("Masukkan syarat masuk perpustakaan (kartu mahasiswa dan Registrasi online)");
        String syaratmasuk= Akbar21.nextLine().trim();
        
        if (syaratmasuk.equals("Kartu mahasiswa")); {
            System.out.print("syarat masuk diterima");
        } if (syaratmasuk.equals("Registrasi online")) {
            System.out.print("Syarat masuk diterima");
        }
    }
}
