package P15;

import java.util.Scanner;

public class Cm2_Siakad_21 {

    static int Menu21, jumlahMhsTerisi21 = 0;
    static String[] NamaMhs21 = new String[100];
    static int[] NimMhs21 = new int[100];
    static int[][] nilaiMhs21 = new int[100][9];

    static String Matkul21[] = {
        "Pancasila","Dasar Pemrograman","Praktikum Dasar Pemrograman","Bahasa Inggris 1",
        "Fisika","Matematika Dasar","Konsep Teknologi Informasi",
        "Keselamatan Dan Kesehatan Kerja","Critical Thinking dan Problem Solving"};

    static int SKS21[] = {2,2,2,2,2,2,3,2,2};

    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        do {
            menu();
            System.out.print("Pilih menu (1 - 3) : ");
            Menu21 = Akbar21.nextInt();

            switch(Menu21) {
                case 1:
                    inputMahasiswa(Akbar21);
                    break;

                case 2:
                    lihatKHS(Akbar21);
                    break;

                case 3:
                    System.out.println("Keluar");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while(Menu21 != 3);
    }

    static void menu() {
        System.out.println("=====================================");
        System.out.println("     SISTEM SIAKAD SEDERHANA MENU   ");
        System.out.println("=====================================");
        System.out.println("1. Input nilai mata kuliah");
        System.out.println("2. Lihat KHS (Konversi & IP + Status)");
        System.out.println("3. Keluar");
        System.out.println("=====================================");
    }

    static void inputMahasiswa(Scanner Akbar21) {
        System.out.println();
        System.out.println("==== INPUT NILAI MAHASISWA ====");

        Akbar21.nextLine(); 
        System.out.print("Nama : ");
        String Nama21 = Akbar21.nextLine();

        System.out.print("NIM  : ");
        int Nim21 = Akbar21.nextInt();

        NamaMhs21[jumlahMhsTerisi21] = Nama21;
        NimMhs21[jumlahMhsTerisi21] = Nim21;

        System.out.println();
        System.out.println("Masukkan nilai untuk setiap mata kuliah (0 - 100) : ");

        for (int i = 0; i < Matkul21.length; i++) {
            System.out.print((i+1) + ". " + Matkul21[i] + " : ");
            int Nilai21 = Akbar21.nextInt();
            if (Nilai21 < 0) Nilai21 = 0;
            if (Nilai21 > 100) Nilai21 = 100;
            nilaiMhs21[jumlahMhsTerisi21][i] = Nilai21;
        }

        jumlahMhsTerisi21++;
        System.out.println();
        System.out.println("[OK] Semua Nilai berhasil dimasukkan");
    }

    static void lihatKHS(Scanner Akbar21) {
        if (jumlahMhsTerisi21 == 0) {
            System.out.println("Belum ada data mahasiswa!");
            return;
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < jumlahMhsTerisi21; i++) {
            System.out.println((i+1) + ". " + NamaMhs21[i] + " / " + NimMhs21[i]);
        }

        System.out.print("Pilih nomor mahasiswa: ");
        int Pilih21 = Akbar21.nextInt();

        if (Pilih21 < 1 || Pilih21 > jumlahMhsTerisi21) {
            System.out.println("Nomor mahasiswa tidak valid!");
            return;
        }

        int Idx21 = Pilih21 - 1;

        System.out.println("\n===== HASIL KONVERSI NILAI =====");
        System.out.println("Nama : " + NamaMhs21[Idx21]);
        System.out.println("NIM  : " + NimMhs21[Idx21]);
        System.out.println("========================================================================");
        System.out.printf("%-3s %-38s %4s %7s %7s %8s\n", "No", "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");
        System.out.println("========================================================================");

        double TotalBobot21 = 0.0;
        int TotalSKS21 = 0;
        boolean adaE = false;

        for (int i = 0; i < Matkul21.length; i++) {
            int Nilai21 = nilaiMhs21[Idx21][i];
            String Huruf21 = konversiNilai21(Nilai21);
            double Bobot21 = BobotNilai21(Huruf21);

            System.out.printf("%-3d %-38s %4d %7d %7s %8.1f\n", i+1, Matkul21[i], SKS21[i], Nilai21, Huruf21, Bobot21);

            TotalBobot21 += Bobot21 * SKS21[i];
            TotalSKS21 += SKS21[i];

            if (Huruf21.equals("E")) {
                adaE = true;
            }
        }

        double IP21 = TotalBobot21 / TotalSKS21;

        System.out.println("========================================================================");
        System.out.println("Total Bobot : " + TotalBobot21);
        System.out.println("Total SKS : " + TotalSKS21);
        System.out.println("Ip Semester : " + IP21);

        String status;
        if (adaE) status = "TIDAK LULUS (Terdapat Nilai E)";
        else status = (IP21 >= 2.0) ? "LULUS" : "TIDAK LULUS";

        System.out.println("Status : " + status);
        System.out.println("========================================================================");
        System.out.println();
    }

    static String konversiNilai21(int N) {
        if (N >= 80) return "A";
        else if (N >= 73) return "B+";
        else if (N >= 65) return "B";
        else if (N >= 60) return "C+";
        else if (N >= 50) return "C";
        else if (N >= 40) return "D";
        else return "E";
    }

    static double BobotNilai21(String H) {
        switch(H) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0; 
        }
    }
}
