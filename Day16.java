import java.util.Scanner;
public class day16 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai X = ");
    int X = sc.nextInt();
    final int KURSI_PENUMPANG = 50;
    final int SEWA_PER_BUS = 7500000;
    int totalKapasitas = X * KURSI_PENUMPANG;
    double sewaPerKursi = (X * SEWA_PER_BUS) / totalKapasitas;
    
    System.out.println("Total kapasitas penumpang ketika menyewa " + X + " bus adalah " + totalKapasitas + " kursi");
    System.out.println("Biaya sewa perpenumpang jika kita menyewa " + X + " bus adalah " + sewaPerKursi); 
} 
}
