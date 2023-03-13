public class Lingkaran {
    public static final double PI = 3.14159265359;
    public double x, y; 
    public double luasLingkaran;
    public double r = 5;
    public double kelilingLingkaran;

    public Lingkaran(double r){
        this.r = r;
    }

    public double getLuasLingkaran() {
        this.luasLingkaran = PI * this.r * this.r;
        return luasLingkaran;
    }
    
    public double getKelilingLingkaran(){
        this.kelilingLingkaran = 2*PI*r;
        return kelilingLingkaran;
    }
}

