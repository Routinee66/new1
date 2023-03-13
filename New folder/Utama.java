public class Utama {
    public static void main(String[] args) {
        System.out.println("TABUNG");
        Tabung cekson = new Tabung(10);
        double wew = cekson.hitungLuasRuang();
        double wow = cekson.hitungVolumeRuang();
        
        System.out.println("Luas = " + wew);
        System.out.println("Volume = " + wow);
        
        System.out.println();
        System.out.println("BOLA");
        Bola coksen = new Bola(5);
        double wew2 = coksen.hitungLuasRuang();
        double wow2 = coksen.hitungVolumeRuang();

        System.out.println("Luas = " + wew2);
        System.out.println("Volume = " + wow2);
        
        System.out.println();
        System.out.println("KERUCUT");
        Kerucut cekcek = new Kerucut(10);
        double wew3 = cekcek.hitungLuasRuang();
        double wow3 = cekcek.hitungVolumeRuang();

        System.out.println("Luas = " + wew3);
        System.out.println("Volume = " + wow3);
    }
}
