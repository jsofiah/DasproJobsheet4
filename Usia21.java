import java.util.Scanner;
public class Usia21 {
    public static void main(String[] args) {
        int usia;
        Scanner cekUsia = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("|  System kategori usia |");
        System.out.println("=========================");
        System.out.print("Masukkan usia anda: ");
        usia = cekUsia.nextInt();

        if (usia >= 0){
            if ( usia >=  0 && usia <= 12 )
            System.out.println("Usia anda termasuk kategori Anak");
            else if ( usia >=13 && usia <= 19 )
            System.out.println("Usia anda termasuk kategori Remaja");
            else if ( usia >= 20 && usia <= 64 )
            System.out.println("Usia anda termasuk kategori Dewasa");
            else if (usia >=65)
            System.out.println("Usia anda termasuk kategori Lansia");
            else {
                System.out.println("Usia tidak terdeteksi");
            }
        }
        else
            System.out.println("Inputan anda tidak valid");
    }
}
