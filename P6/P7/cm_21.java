package P6.P7;

import java.util.Scanner;

public class cm_21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        System.out.println("=====INPUT DATA MAHASISWA=====");
        System.out.print("Masukkan Nama\t:");
        String Nama= Akbar21.nextLine().trim();
        System.out.print("Masukkan NIM\t:");
        int NIM= Akbar21.nextInt();

        System.out.println("Masukkan nilai angka (0-100)");
        System.out.print("1. Pancasila\t:");
        int angka= Akbar21.nextInt();
        String angkaP= Akbar21.nextLine().trim();
        System.out.print("2. Dasar Pemrograman\t:");
        int nilai= Akbar21.nextInt();
        String nilaiD= Akbar21.nextLine().trim();
        System.out.print("3. Bahasa Inggris 1\t: ");
        int Masukkan= Akbar21.nextInt();
        String MasukkanB= Akbar21.nextLine().trim();

       if (angka > 80 && angka <=100) {
        System.out.println("Nilai huruf = A");
       } else if (angka >73 && angka <=80) {
        System.out.println("Nilai huruf = B+");
       } else if (angka >65 && angka<=73) {
        System.out.println("Nilai huruf = B");
       } else if (angka >60 && angka<=65) {
        System.out.println("Nilai huruf = C+");
       } else if (angka >50 && angka<=60) {
        System.out.println("Nilai huruf = C");
       } else if (angka >39 && angka<=50) {
        System.out.println("Nilai huruf = D");
       }

        if (nilai > 80 && nilai <=100) {
        System.out.println("Nilai huruf = A");
       } else if (nilai >73 && nilai <=80) {
        System.out.println("Nilai huruf = B+");
       } else if (nilai >65 && nilai<=73) {
        System.out.println("Nilai huruf = B");
       } else if (nilai >60 && nilai<=65) {
        System.out.println("Nilai huruf = C+");
       } else if (nilai >50 && nilai<=60) {
        System.out.println("Nilai huruf = C");
       } else if (nilai >39 && nilai<=50) {
        System.out.println("Nilai huruf = D");
       }

        if (Masukkan > 80 && Masukkan <=100) {
        System.out.println("Nilai huruf = A");
       } else if (Masukkan >73 && Masukkan <=80) {
        System.out.println("Nilai huruf = B+");
       } else if (Masukkan >65 && Masukkan<=73) {
        System.out.println("Nilai huruf = B");
       } else if (Masukkan >60 && Masukkan<=65) {
        System.out.println("Nilai huruf = C+");
       } else if (Masukkan >50 && Masukkan<=60) {
        System.out.println("Nilai huruf = C");
       } else if (Masukkan >39 && Masukkan<=50) {
        System.out.println("Nilai huruf = D");
       }

         if(angkaP.equals("A")) {
        System.out.println("Nilai setara = 4");
       } else if (angkaP.equals("B+")) {
        System.out.println("Nilai setara = 3,5");
       } else if (angkaP.equals("B")) {
        System.out.println("Nilai setara = 3");
       } else if (angkaP.equals("C+")) {
        System.out.println("Nilai setara = 2,5");
       } else if (angkaP.equals("C")) {
        System.out.println("Nilai setara = 2");
       } else if (angkaP.equals("D")) {
        System.out.println("Nilai setara = 1");
       }

        if(nilaiD.equals("A")) {
        System.out.println("Nilai setara = 4");
       } else if (nilaiD.equals("B+")) {
        System.out.println("Nilai setara = 3,5");
       } else if (nilaiD.equals("B")) {
        System.out.println("Nilai setara = 3");
       } else if (nilaiD.equals("C+")) {
        System.out.println("Nilai setara = 2,5");
       } else if (nilaiD.equals("C")) {
        System.out.println("Nilai setara = 2");
       } else if (nilaiD.equals("D")) {
        System.out.println("Nilai setara = 1");
       }

       if(MasukkanB.equals("A")) {
        System.out.println("Nilai setara = 4");
       } else if (MasukkanB.equals("B+")) {
        System.out.println("Nilai setara = 3,5");
       } else if (MasukkanB.equals("B")) {
        System.out.println("Nilai setara = 3");
       } else if (MasukkanB.equals("C+")) {
        System.out.println("Nilai setara = 2,5");
       } else if (MasukkanB.equals("C")) {
        System.out.println("Nilai setara = 2");
       } else if (MasukkanB.equals("D")) {
        System.out.println("Nilai setara = 1");
       }

       System.out.println("==========================================================================");
       System.out.println("                         hasil Konveksi Nilai");
       System.out.println("==========================================================================");
       System.out.println("Nama  : " + Nama);
       System.out.println("Nim  : " + NIM);
       System.out.println("--------------------------------------------------------------------------");
        System.out.println("Mata Kuliah                SKS   Nilai   Huruf   Setara");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Pancasila                  2     " + angka + "      " + angkaP + "       " + angkaP);
        System.out.println("Dasar Pemrograman          3     " + nilai  + "      " + nilaiD + "       " + nilaiD);
        System.out.println("Bahasa Inggris             2     " + Masukkan + "      " + MasukkanB + "       " + MasukkanB);
        System.out.println("--------------------------------------------------------------------------");

        int skspancasila= 2;
        int sksdaspro=3;
        int sksbing=2;
        double totalSKS = 2 + 3 + 2;
        double totalNilai = (angka * skspancasila) + (nilai * sksdaspro) + (Masukkan * sksbing);
        double ip = totalNilai / totalSKS;
        double bobot = totalNilai;

        System.out.println("Total SKS : "+ totalSKS);
        System.out.println("Bobot : " + bobot);
        System.out.println("IP3 ");
        System.out.println(String.format("%.2f",ip));

        String status;
        if(ip >= 2){
            status = "Lulus";
        }else{
            status = "Tidak Lulus";
        }
        System.out.println("Status Semester : " + status);
        

    }
}
    