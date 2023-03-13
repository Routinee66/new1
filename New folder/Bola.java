public class Bola extends BangunRuang {
    public Bola() {
        super(4);
    }

    public Bola(double jari) {
        super(jari);
    }

    public double hitungLuasRuang() {
        super.setLuas(4 * Lingkaran.PI * super.r * super.r);
        return super.getLuas();
    }

    public double hitungVolumeRuang() {
        super.setVolume((4 * (Lingkaran.PI * super.r * super.r * super.r))/3);
        return super.getVolume();
    }
}
