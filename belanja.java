import java.util.Scanner;

public class belanja {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalBelanja, hargaBarang, jumlahBarang;

        totalBelanja = 0;
        jumlahBarang = 0;
        String lanjut;

        lanjut = "yes";

        while (lanjut.equals("yes")) {
            System.out.print("Masukan Harga Barang: ");
            hargaBarang = input.nextInt();

            totalBelanja = hargaBarang + totalBelanja;
            jumlahBarang = jumlahBarang + 1;

            input.nextLine(); // Membersihkan Enter setelah nextInt()

            System.out.print("Apakah Belanja Lagi? (yes/no): ");
            lanjut = input.nextLine();
        }

        System.out.println("Total Harga = " + totalBelanja);
        System.out.println("Jumlah Barang = " + jumlahBarang);

        input.close();
    }
}
