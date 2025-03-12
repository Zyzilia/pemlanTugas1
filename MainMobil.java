
import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input mobil 1
        System.out.println("Input Mobil 1:");
        Mobil m1 = new Mobil();
        System.out.print("Masukkan kecepatan (km/h): ");
        int kecepatan1 = sc.nextInt();
        m1.setKecepatan(kecepatan1);
        System.out.print("Masukkan manufaktur: ");
        String manufaktur1 = sc.next();
        m1.setManufaktur(manufaktur1);
        System.out.print("Masukkan nomor plat: ");
        String noPlat1 = sc.next();
        m1.setNoPlat(noPlat1);
        System.out.print("Masukkan warna: ");
        String warna1 = sc.next();
        m1.setWarna(warna1);
        System.out.print("Masukkan waktu (jam): ");
        double waktu1 = sc.nextDouble();
        m1.setWaktu(waktu1);
        System.out.println();
        m1.displayMessage();
        System.out.println("\n================");

        // Input mobil 2
        System.out.println("Input Mobil 2:");
        Mobil m2 = new Mobil();
        System.out.print("Masukkan kecepatan (km/h): ");
        int kecepatan2 = sc.nextInt();
        m2.setKecepatan(kecepatan2);
        System.out.print("Masukkan manufaktur: ");
        String manufaktur2 = sc.next();
        m2.setManufaktur(manufaktur2);
        System.out.print("Masukkan nomor plat: ");
        String noPlat2 = sc.next();
        m2.setNoPlat(noPlat2);
        System.out.print("Masukkan warna: ");
        String warna2 = sc.next();
        m2.setWarna(warna2);
        System.out.print("Masukkan waktu (jam): ");
        double waktu2 = sc.nextDouble();
        m2.setWaktu(waktu2);
        System.out.println();
        m2.displayMessage();

        System.out.println("\n================");

        // Mengubah warna mobil dan  menampilkan hasil perubahan
        System.out.print("Mobil pada objek ");
        String seri = sc.next();
        System.out.print("di rubah menjadi warna: ");
        String warna3 = sc.next();
        System.out.println(" ");

        if ("m1".equals(seri)) {
            m1.setWarna(warna3);
            m1.displayMessage();
        } else if ("m2".equals(seri)) {
            m2.setWarna(warna3);
            m2.displayMessage();
        }

        System.out.println(" ");

        sc.close();
    }
}
