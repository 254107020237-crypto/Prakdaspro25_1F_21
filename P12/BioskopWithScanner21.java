package P12;

import java.util.Scanner;

public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        String [] [] Penonton = new String [4] [2];
        int Baris, Kolom;
        String Nama, Next;
        
        while (true) {
            System.out.print("Masukkan Nama : ");
            Nama = Akbar21.nextLine();
            System.out.print("Masukkan Baris : ");
            Baris = Akbar21.nextInt();
            System.out.print("Masukkan Kolom : ");
            Kolom = Akbar21.nextInt();
            Akbar21.nextLine();

            Penonton[Baris-1][Kolom-1] = Nama;

            System.out.print("Input Penonton Lainnya? (y/n): ");
            Next = Akbar21.nextLine();

            if (Next.equalsIgnoreCase("n")) {
                break;
            }
        }   
    }
}
