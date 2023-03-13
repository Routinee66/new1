public abstract class BangunRuang extends Lingkaran {
    private double luas;
    private double volume;

    public BangunRuang(double r) {
        super(r);
    }

    public double getLuas(){
        return this.luas;
    }

    public double getVolume(){
        return this.volume;
    }

    public void setLuas(double luas){
        this.luas = luas;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    public abstract double hitungLuasRuang();

    public abstract double hitungVolumeRuang();


}
