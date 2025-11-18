package P12;

import java.util.Scanner;

public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        String [] [] Penonton = new String [4] [2];
        int Baris, Kolom, Menu;
        String Nama, Next;

        while (true) {
            System.out.println("===== Menu Bioskop =====");
            System.out.println("1. Input data Penonton");
            System.out.println("2. Tampilan Daftar Penonton");
            System.out.println("3. Exit/Keluar");
            System.out.print("Pilih Menu : ");
            Menu = Akbar21.nextInt();
            Akbar21.nextLine();

            switch (Menu) {
                case 1:
                    System.out.println("Menu 1 Input Data Penonton : ");
                    while (true) {
                        System.out.print("Masukkan Nama : ");
                        Nama = Akbar21.nextLine();
                        System.out.print("Masukkan Baris : ");
                        Baris = Akbar21.nextInt();
                        System.out.print("Masukkan Kolom : ");
                        Kolom = Akbar21.nextInt();
                        Akbar21.nextLine();

                        Penonton[Baris-1][Kolom-1]= Nama;

                        System.out.print("Input Penonton Lainnya? (y/n): ");
                        Next = Akbar21.nextLine();

                       if (Next.equalsIgnoreCase("n")) {
                            break;
                       }
                    }
                    break;

                    case 2:
                    System.out.println("Menu 2 Tampilan Daftar Penonton : ");
                    for (int i = 0; i < Penonton.length; i++) {
                        for (int j = 0; j < Penonton[i].length; j++) {
                             Nama = Penonton[i][j];
                             System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + " : " + Nama);
                        }
                    }
                    break;

                    case 3:
                    System.out.println("Terimah Kasih");
                    Akbar21.close();
                    return;
            
                default:
                    System.out.println();
            }
        }
    }
}


//comit pertanyaan 3 