
public class Mobil {

    private String noPlat;
    private String Warna;
    private String Manufaktur;
    private double Kecepatan;
    private double Waktu;

    // nomor plat mobil
    public void setNoPlat(String s) {
        noPlat = s;
    }

    // warna mobil
    public void setWarna(String s) {
        Warna = s;
    }

    // nama manufaktur/perusahaan
    public void setManufaktur(String s) {
        Manufaktur = s;
    }

    // Konversi Km/h ke m/s
    public void setKecepatan(int i) {
        Kecepatan = rubahKecepatan(i);
    }

    // Menerima dan mengubah input Waktu jam ke sekon
    public void setWaktu(double jam) {
        Waktu = rubahSekon(jam);
    }

    // Konversi jam menjadi sekon dan hanya bisa dipanggil di class Mobil
    private double rubahSekon(double jam) {
        return jam * 3600;
    }

    // Konversi Kecepatan dari km/h ke m/s dan hanya bisa dipanggil di class Mobil
    private double rubahKecepatan(double kmh) {
        return kmh / 3.6;
    }

    // Menghitung jarak yang dapat ditempuh: jarak = Kecepatan * Waktu = m
    public double hitungJarak() {
        return Kecepatan * Waktu;
    }

    // Menampilkan informasi mobil, termasuk jarak yang ditempuh (dikonversi ke kilometer)
    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + Manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Serupa memiliki warna " + Warna);
        System.out.printf("Dan mampu menempuh kecepatan %.2f" + " m/s\n", Kecepatan);
        double jarakTotal = hitungJarak() / 1000; //mengubah m ke km
        System.out.printf("Jarak yang dapat ditempuh adalah %.2f" + " km\n", jarakTotal);
    }
}
