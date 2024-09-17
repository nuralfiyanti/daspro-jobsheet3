import java.util.Scanner;

public class TagihanListrik {
    public static void main (String [] args){
        //Membuat scanner untuk input 
        Scanner scanner = new Scanner(System.in);

        //input: Penggunaan Listrik dalam kwh
        System.out.println("Masukkan jumlah penggunaan listrik dalam kwh: ");
        double penggunaanListrik = scanner.nextDouble();

        //Tarif listrik per kwh
        double tarifPerkwh = 1500;

        //Hitung total tagihan
        double totalTagihan = penggunaanListrik * tarifPerkwh;

        //cek apakah penggunaan Listrik melebihi 500 kwh
        boolean melebihi500Kwh = penggunaanListrik > 500;

        //Output hasil
        System.out.println("Total tagihan listrik: Rp" + totalTagihan);
        System.out.println("Penggunaan listrik melebihi 500 kwh:" + melebihi500Kwh);
        //Menutup scanner
        scanner.close();

    }
}