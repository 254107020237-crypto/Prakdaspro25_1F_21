package P13;

import java.util.Scanner;

public class PotonganGaji21 {
 public static void main(String[] args) {
    Scanner Akbar21 = new Scanner(System.in);

    int Potongan21, Hadir21, TotalPotongan21 = 0;
    String Nama21, Next21;
    String [] [] Karyawan = new String [4] [3];

   System.out.print("Masukkan Nama Karyawan : ");
   Nama21 = Akbar21.nextLine();
   System.out.print("Masukkan Jumlah hadir : ");
    Hadir21 = Akbar21.nextInt();

   if (Hadir21 < 29) {
        Potongan21 = 2500;
   } else {
    TotalPotongan21 = Hadir21 - 2500;
   }
   System.out.println("Total");
 }   
}
