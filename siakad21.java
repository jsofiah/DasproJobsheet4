/**
 * Tugas-Java1
 */
import java.util.Scanner;
public class siakad21 {

   public static void main(String[] args) {
       Scanner siakad = new Scanner(System.in);
       String nama, nim, nilaiAkhirHuruf, kualifikasi;
       char kelas;
       byte absen;
       double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

       System.out.print("Masukkan nama: ");
       nama = siakad.nextLine();
       System.out.print("Masukkan NIM: ");
       nim = siakad.nextLine();
       System.out.print("Masukkan kelas: ");
       kelas = siakad.nextLine().charAt(0);
       System.out.print("Masukkan nomor absen: ");
       absen = siakad.nextByte();

       System.out.print("Masukkan nilai kuis: ");
       nilaiKuis = siakad.nextDouble();
       System.out.print("Masukkan nilai tugas: ");
       nilaiTugas = siakad.nextDouble();
       System.out.print("Masukkan nilai ujian: ");
       nilaiUjian= siakad.nextDouble();
      
       nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian)/3;

       if ( nilaiAkhir > 80 && nilaiAkhir <= 100 ){
           nilaiAkhirHuruf = "A";
           kualifikasi = "Sangat Baik";
       }
       else if ( nilaiAkhir > 73 && nilaiAkhir <= 80 ){
           nilaiAkhirHuruf = "B+";
           kualifikasi = "Lebih dari Baik";
       }
       else if ( nilaiAkhir > 65 && nilaiAkhir <= 73 ){
           nilaiAkhirHuruf = "B";
           kualifikasi = "Baik";
       }
       else if ( nilaiAkhir > 60 && nilaiAkhir <= 65 ){
           nilaiAkhirHuruf = "C+";
           kualifikasi = "Lebih dari Cukup";
       }
       else if ( nilaiAkhir > 50 && nilaiAkhir <= 60 ){
           nilaiAkhirHuruf = "C";
           kualifikasi = "Cukup";
       }
       else if ( nilaiAkhir > 39 && nilaiAkhir <= 50 ){
           nilaiAkhirHuruf = "D";
           kualifikasi = "Kurang";
       }
       else if ( nilaiAkhir <= 39){
           nilaiAkhirHuruf = "E";
           kualifikasi = "Gagal";
       }
       else{
            nilaiAkhirHuruf = "Tidak teridentifikasi"; 
           kualifikasi = "Tidak teridentifikasi"; 
       }
       
       System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")" + " kelas " + kelas + " nomor absen " + absen);
       System.out.println("Nilai akhir: " + nilaiAkhir);
       System.out.println("Nilai akhir huruf: " + nilaiAkhirHuruf);
       System.out.println("Kualifikasi: " + kualifikasi);
       
       }
}