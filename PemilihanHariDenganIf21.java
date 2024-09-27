import java.util.Scanner;
public class PemilihanHariDenganIf21 {
    public static void main(String[] args) {
        Scanner hari = new Scanner(System.in);
        int kode_hari;
        String dayTipe;

        System.out.print("Masukkan kode hari: ");
        kode_hari = hari.nextInt();

        if (kode_hari >= 0){
            if (kode_hari >= 1 && kode_hari <= 5){
                dayTipe = "Weekday";
                System.out.println(kode_hari + " adalah hari " + dayTipe);
            }
            else if (kode_hari >= 6 && kode_hari <= 7){
                dayTipe = "Weekend";
                System.out.println(kode_hari + " adalah hari " + dayTipe);
            }
            else {
                System.out.println("Invalid Number");
            }
        }
    }
}
