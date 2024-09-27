/**
 * PemilihanBilangan21
 */
import java.util.Scanner;
 public class PemilihanBilangan21 {

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = bilangan.nextInt();

        if (angka % 2 ==0){
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
    }
}