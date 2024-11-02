
public class Data {
    // Properti untuk menyimpan informasi pelanggan
    private String nama;
    private int noTelp;
    private String jenisKendaraan;
    private String layanan;

    // Constructor untuk menginisialisasi data
    public Data(String nama, int noTelp, String jenisKendaraan, String layanan) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.jenisKendaraan = jenisKendaraan;
        this.layanan = layanan;
    }

    // Metode untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("No Telp: 0" + noTelp);
        System.out.println("Jenis Kendaraan: " + jenisKendaraan);
        System.out.println("Layanan: " + layanan);
    }
}
