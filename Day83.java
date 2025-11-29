import java.util.Scanner;
public class day83 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pengeluaran [] = new int[7];
    int total = 0;
    for (int i = 0; i < pengeluaran.length; i++) {
        System.out.print("Masukkan pengeluaran hari ke-" + (i+1) + ": ");
        pengeluaran[i] = sc.nextInt();
    }
    System.out.println("\n>>> Rincian Pengeluaran <<<");
    for (int i = 0; i < pengeluaran.length; i++) {
        System.out.println("Hari ke-" + (i+1) + ": Rp " + pengeluaran[i]);
        total += pengeluaran[i];
    }
    System.out.println("--------------------------------------");
    System.out.println("Total Pengeluaran Sepekan: Rp "+total);
}   
}
