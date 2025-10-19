import java.util.Scanner;
public class day42 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("--- Program Hitung Gaji Bersih (PPh 21 Sederhana) ---");
    System.out.print("Masukkan Gaji Kotor Bulanan : ");
    double gajiKotor = sc.nextDouble();
    double biayaJabatan = gajiKotor * 0.05;
    if (biayaJabatan > 500000) {
        biayaJabatan = 500000;
    }
    double netoBulanan = gajiKotor - biayaJabatan;
    double netoTahunan = netoBulanan * 12;
    double PTKPtahunan = 54000000;
    double PPh21Tahunan = netoTahunan - PTKPtahunan;
    double pajakPKP = 0;
    
    if (PPh21Tahunan < 0) {
        PPh21Tahunan = 0;
    }else if (PPh21Tahunan < 60000000) {
        pajakPKP = PPh21Tahunan * 0.05;
    }else if (PPh21Tahunan < 250000000) {
        pajakPKP = PPh21Tahunan * 0.15;
    }else if (PPh21Tahunan < 500000000) {
        pajakPKP = PPh21Tahunan * 0.25;
    }else if (PPh21Tahunan < 5000000000d) {
        pajakPKP = PPh21Tahunan * 0.30;
    }else{
        pajakPKP = PPh21Tahunan * 0.35;
    }
    double PPh21Bulanan = pajakPKP / 12;
    double GajiBersihBulanan = netoBulanan - PPh21Bulanan;
    
    System.out.println("\n--- Rincian Perhitungan ---");
    System.out.printf("Gaji Kotor Bulanan              : Rp %, .2f %n" , gajiKotor);
    System.out.printf("Biaya Jabatan (5%%, maks 500rb)  : Rp %, .2f %n" , biayaJabatan);
    System.out.printf("Penghasilan Neto Bulanan        : Rp %, .2f %n" , netoBulanan);
    System.out.printf("Penghasilan Neto Tahunan        : Rp %, .2f %n" , netoTahunan);
    System.out.printf("PTKP (TK/0) Tahunan             : Rp %, .2f %n" , PTKPtahunan);
    System.out.printf("Penghasilan Kena Pajak (PKP)    : Rp %, .2f %n" , PPh21Tahunan);
    System.out.printf("PPh 21 Tahunan                  : Rp %, .2f %n" , pajakPKP);
    System.out.printf("PPh 21 Bulanan                  : Rp %, .2f %n" , PPh21Bulanan);
    System.out.println("--------------------------------------------------------------");
    System.out.printf("Gaji Bersih Bulanan             : Rp %, .2f %n" , GajiBersihBulanan);
} 
}
