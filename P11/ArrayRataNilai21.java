package P11;

import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa: ");
        int jumlahmahasiswa = Akbar21.nextInt();
        int[] Nilaimhs =  new int[jumlahmahasiswa];
        int mhslulus=0, mhstidaklulus=0;
        double total=0, totallulus=0, totaltdklulus=0;
        double rata, ratalulus, ratatidaklulus;

        for (int i = 0; i < Nilaimhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+ (i+1) + ": ");
            Nilaimhs[i] = Akbar21.nextInt();
        }
        for (int i = 0; i < Nilaimhs.length; i++) {
            total += Nilaimhs[i];

            if (Nilaimhs[i]>70){
                totallulus += Nilaimhs[i];
                mhslulus++;
            }
            if (Nilaimhs[i]<=70) {
                totaltdklulus += Nilaimhs[i];
                mhstidaklulus++; 
            }
        }
        rata = total/Nilaimhs.length;
        ratalulus = totallulus/mhslulus;
        ratatidaklulus = totaltdklulus/mhstidaklulus;
        System.out.println("Rata rata nilai lulus = "+ratalulus);
        System.out.println("Rata rata nilai tidak lulus = "+ratatidaklulus);
    }
}