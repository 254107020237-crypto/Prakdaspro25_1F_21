package P6;

import java.util.Scanner;

public class Tugas3akseswifi {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        System.out.println("Masukkan jenis pengguna (dosen dan mahasiswa): ");
        String akseswifi = Akbar21.nextLine().trim();

         if (akseswifi.equals("dosen")) {
        System.out.print("Akses wifi diberikan");
         } else if (akseswifi.equals("mahasiswa")){
            System.out.print("masukkan jumlah SKS:");
            int jumlahSKS= Akbar21.nextInt();

            if (jumlahSKS < 12){
            } else {
                System.out.println("Akses wifi  diberikan (mahasiswa aktif)");
            }
            if (jumlahSKS > 12){
            } else {
                System.out.println("Akses wifi tidak diberikan, SKS kurang dari 12");
            }
         }
         
    }
}
