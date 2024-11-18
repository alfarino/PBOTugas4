import java.util.Scanner;

public class MainProgram {    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input data faktur dan barang dari pengguna
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            int hargaBarang = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = Integer.parseInt(scanner.nextLine());

            // Validasi jumlah beli menggunakan exception handling
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0!");
            }

            // Membuat objek transaksi
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan hasil transaksi
            System.out.println("\n--- Transaksi Berhasil ---");
            System.out.println("No Faktur: " + noFaktur);
            transaksi.displayInfo();
            System.out.println("Jumlah Beli: " + transaksi.getJumlahBeli());
            System.out.println("Total: " + transaksi.hitungTotal());
        } catch (NumberFormatException e) {
            // Menangani kesalahan input format angka
            System.out.println("Kesalahan: Input harga atau jumlah beli harus berupa angka!");
        } catch (IllegalArgumentException e) {
            // Menangani kesalahan input jumlah beli
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            // Menangani kesalahan umum lainnya
            System.out.println("Kesalahan tidak terduga: " + e.getMessage());
        } finally {
            // Menutup scanner
            scanner.close();
        }
    }
}
