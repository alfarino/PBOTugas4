class Transaksi extends Barang {
    private int jumlahBeli;

    public Transaksi(String kodeBarang, String namaBarang, int hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Inheritance digunakan
        this.jumlahBeli = jumlahBeli;
    }

    // Method untuk menghitung total harga
    public int hitungTotal() {
        return jumlahBeli * hargaBarang;
    }

    // Getter untuk jumlah beli
    public int getJumlahBeli() {
        return jumlahBeli;
    }
}
