import java.util.Scanner;

public class Siakad19 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaikuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama    = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim     = sc.nextLine();
        System.out.print("Masukkan kelas: ");  
        kelas   = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen   = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaikuis   = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas  = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian  = sc.nextDouble();

        nilaiAkhir  = (nilaikuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai-Akhir: " + nilaiAkhir);
        

    }
}