/**
 * PemilihanBilangan21
 */
import java.util.Scanner;
 public class PemilihanBilangan21 {

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = bilangan.nextInt();
        String penentu_bilangan;

        penentu_bilangan = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println("Angka " + angka + " termasuk " + penentu_bilangan);

        // if (angka % 2 ==0){
        //     System.out.println("Angka " + angka + " termasuk bilangan genap");
        // }
        // else {
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }
    }
}