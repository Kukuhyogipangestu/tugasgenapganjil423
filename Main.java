import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Servis gantiOli = new GantiOli();
        Servis perbaikanMesin = new PerbaikanMesin();

        ArrayList<Data> daftarServis = new ArrayList<>();
               
        boolean running = true;
        while (running) {
        System.out.println("+------------------------------+");
        System.out.println("|Selamat datang di Bengkel saya|");
        System.out.println("+------------------------------+");
        System.out.println("Pilih salah satu opsi dibawah ini");
        System.out.println("1. Servis");
        System.out.println("2. Lihat Riwayat");
        System.out.println("3. Keluar");
        
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan = scanner.nextInt(); 

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan no telp: ");
                int notelp = scanner.nextInt();

                System.out.print("Masukkan jenis kendaraan: " );
                String jenis = scanner.nextLine();

                System.out.println("Masukan pilihan servis");
                System.out.println("1. Ganti oil");
                System.out.println("2. Perbaikan Mesin");
                System.out.print("Masukan pilihan anda (1/2): ");
                int pilih = scanner.nextInt();

                String layanan = "";

                switch (pilih) {
                    case 1: 
                        layanan = "Ganti Oli";
                        System.out.println("Data pesanan anda:");
                        System.out.println("Nama: " + nama);
                        System.out.println("No telp: 0" +  notelp);
                        System.out.println("Kendaraan: " + jenis);
                        gantiOli.layananServis(); 
                        break;
                    case 2:
                        layanan = "Perbaikan Mesin";
                        System.out.println("Data pesanan anda:");
                        System.out.println("Nama: " + nama);
                        System.out.println("No telp: 0" + notelp);
                        System.out.println("Kendaraan " + jenis);
                        perbaikanMesin.layananServis();
                }

                    Data dataServis = new Data(nama, notelp, jenis, layanan);
                    daftarServis.add(dataServis);
                break;
            case 2:
                    if (daftarServis.isEmpty()) {
                    System.out.println("Belum ada riwayat servis.");
                    } else {
                        System.out.println("Riwayat Servis:");
                        for (Data data : daftarServis) {
                        data.tampilkanData();
                        System.out.println("---------------------");
                    }
                }
                break;
            case 3:
                System.out.println("Keluar dari program. Terima kasih!");
                running = false;
                break;
            default:
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                break;
        }
        }
    }
}
