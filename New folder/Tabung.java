class Tabung extends BangunRuang{
    private double tinggi = 5;
    
    public Tabung(double tinggi){
        super(4);
        this.tinggi = tinggi;
    }
    
    public Tabung(double tinggi, double jari){
        super(jari);
        this.tinggi = tinggi;
    }

    public double hitungLuasRuang(){
        super.setLuas(2*super.getLuasLingkaran() + super.kelilingLingkaran*tinggi);
        return super.getLuas();
    }

    public double hitungVolumeRuang() {
        super.setVolume(super.getLuasLingkaran() * this.tinggi);
        return super.getVolume();
    }
}