package P7;

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
        System.out.print("2. Dasar Pemrograman\t:");
        int nilai= Akbar21.nextInt();
        System.out.print("3. Bahasa Inggris 1\t: ");
        int Masukkan= Akbar21.nextInt();

        String nilaihurufP, nilaihurufD, nilaihurufB;
        if (angka > 80 && angka <= 100){    
            nilaihurufP = "A";
        }else if(angka > 73 && angka <=80){
            nilaihurufP = "B+";
        }else if(angka > 65 && angka <= 73){
            nilaihurufP = "B";
        }else if(angka > 60 && angka <= 65){
            nilaihurufP = "C+";
        }else if(angka > 50 && angka <= 60){
            nilaihurufP = "C";
        }else if(angka > 39 && angka <= 50){
            nilaihurufP = "D";
        }else{
            nilaihurufP = "E";
        }

        if (nilai > 80 && nilai <= 100){    
            nilaihurufD = "A";
        }else if(nilai > 73 && nilai <=80){
            nilaihurufD = "B+";
        }else if(nilai > 65 && nilai <= 73){
            nilaihurufD = "B";
        }else if(nilai > 60 && nilai <= 65){
            nilaihurufD = "C+";
        }else if(nilai > 50 && nilai <= 60){
            nilaihurufD = "C";
        }else if(nilai > 39 && nilai <= 50){
            nilaihurufD = "D";
        }else{
            nilaihurufD = "E";
        }

        if (Masukkan > 80 && Masukkan <= 100){    
            nilaihurufB = "A";
        }else if(Masukkan > 73 && Masukkan <=80){
            nilaihurufB = "B+";
        }else if(Masukkan > 65 && Masukkan <= 73){
            nilaihurufB = "B";
        }else if(Masukkan > 60 && Masukkan <= 65){
            nilaihurufB = "C+";
        }else if(Masukkan > 50 && Masukkan <= 60){
            nilaihurufB = "C";
        }else if(Masukkan > 39 && Masukkan <= 50){
            nilaihurufB = "D";
        }else{
            nilaihurufB = "E";
        }

        double nilaisetaraP, nilaisetaraD, nilaisetaraB;
        if(nilaihurufP.equals("A")){
            nilaisetaraP = 4;
        }else if(nilaihurufP.equals("B+")){
            nilaisetaraP = 3.5;
        }else if(nilaihurufP.equals("B")){
            nilaisetaraP = 3;
        }else if(nilaihurufP.equals("C+")){
            nilaisetaraP = 2.5;
        }else if(nilaihurufP.equals("C")){
            nilaisetaraP = 2;
        }else if(nilaihurufP.equals("D")){
            nilaisetaraP = 1;
        }else{
            nilaisetaraP = 0;
        }

        if(nilaihurufD.equals("A")){
            nilaisetaraD = 4;
        }else if(nilaihurufD.equals("B+")){
            nilaisetaraD = 3.5;
        }else if(nilaihurufD.equals("B")){
            nilaisetaraD = 3;
        }else if(nilaihurufD.equals("C+")){
            nilaisetaraD = 2.5;
        }else if(nilaihurufD.equals("C")){
            nilaisetaraD = 2;
        }else if(nilaihurufD.equals("D")){
            nilaisetaraD = 1;
        }else{
            nilaisetaraD = 0;
        }

        if(nilaihurufB.equals("A")){
            nilaisetaraB = 4;
        }else if(nilaihurufB.equals("B+")){
            nilaisetaraB = 3.5;
        }else if(nilaihurufB.equals("B")){
            nilaisetaraB = 3;
        }else if(nilaihurufB.equals("C+")){
            nilaisetaraB = 2.5;
        }else if(nilaihurufB.equals("C")){
            nilaisetaraB = 2;
        }else if(nilaihurufB.equals("D")){
            nilaisetaraB = 1;
        }else{
            nilaisetaraB = 0;
        }

       System.out.println("==========================================================================");
       System.out.println("                         hasil Konveksi Nilai");
       System.out.println("==========================================================================");
       System.out.println("Nama  : " + Nama);
       System.out.println("Nim  : " + NIM);
       System.out.println("--------------------------------------------------------------------------");
        System.out.println("Mata Kuliah                SKS   Nilai   Huruf   Setara");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Pancasila                  2     " + angka + "      " + nilaihurufP + "       " + nilaisetaraP);
        System.out.println("Dasar Pemrograman          3     " + nilai  + "      " + nilaihurufD + "       " + nilaisetaraD);
        System.out.println("Bahasa Inggris             2     " + Masukkan + "      " + nilaihurufB + "       " + nilaisetaraB);
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

        
        if (nilaisetaraP > 2 && nilaisetaraP >=2.75) {
        } else  {
            System.out.println("Lulus dengan percobaan");
        }

        if (nilaisetaraD >2 && nilaisetaraD >=2.75) {
        }    else {
                System.out.println("Lulus dengan percobaan");
        }

        if (nilaisetaraB >2 && nilaisetaraB >=2.75) {
        } else {
            System.out.println("Lulus dengan percobaan");
        }
    }
}
    