class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected int hargaBarang;

    // Constructor untuk mengisi data barang
    public Barang(String kodeBarang, String namaBarang, int hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Method untuk menampilkan informasi barang
    public void displayInfo() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
    }
}