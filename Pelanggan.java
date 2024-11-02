public class Pelanggan {
    public String nama;
    public int notelp;

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Pelanggan(int notelp) {
        this.notelp = notelp;
    }

    public int getNotelp() {
        return this.notelp;
    }

    public void setNotelp(int  notelp) {
        this.notelp = notelp;
    }
}
