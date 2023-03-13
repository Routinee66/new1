public class Kerucutterpancung extends Kerucut{
    private double tinggi;
    private double miring;
    
    public Kerucut(double tinggi){
        super(4);
        this.tinggi = tinggi;
    }
    
    public Kerucut(double tinggi, double jari){
        super(jari);
        this.tinggi = tinggi;
    }

    public double hitungLuasRuang(){
        this.miring = Math.sqrt(super.r * super.r + this.miring * this.miring);
        super.setLuas(Lingkaran.PI * super.r * (super.r + this.miring));
        return super.getLuas();
    }

    public double hitungVolumeRuang() {
        super.setVolume((Lingkaran.PI * super.r * super.r * this.tinggi) / 3);
        return super.getVolume();
    }
}