import java.util.Scanner;

public class Gajian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Meminta input jumlah jam kerja dan upah per jam
        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = input.nextDouble();

        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = input.nextDouble();

        //Menghitung gaji kotor
        double gajiKotor = jamKerja * upahPerJam;

        //Menghitung bonus 10% dari gaji kotor
        double bonus = 0.10 * gajiKotor;

        //Menghitung total gaji sebelum pajak
        double totalGajiSebelumPajak = gajiKotor + bonus;

        //Menghitung pajak 5% dari total gaji sebelum pajak
        double pajak = 0.05 * totalGajiSebelumPajak;

        //Menghitung gaji bersih setelah pajak 
        double gajiBersih = totalGajiSebelumPajak - pajak;

        //Menampilkan hasil
        System.out.printf("Gaji bersih setelah pajak adalah: Rp %.2f\n", gajiBersih);

        //Menutup scanner
        input.close();

    }
    
}
