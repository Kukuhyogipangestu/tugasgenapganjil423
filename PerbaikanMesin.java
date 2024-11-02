class PerbaikanMesin extends Servis {
    public PerbaikanMesin() {
        super("Perbaikan Mesin");
    }

    @Override
    public void layananServis() {
        System.out.println("Layanan: Perbaikan Mesin, Harga: Rp. 150,000");
    }
}