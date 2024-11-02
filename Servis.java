public class Servis {
    private String layanan;

    public Servis(String layanan) {
        this.layanan = layanan;
    }

    public String getNamaLayanan() {
        return layanan;
    }

    public void layananServis() {
        System.out.println("Layanan servis: " + layanan);
    }
}