import java.util.Scanner;
public class day62 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan batas angka(N): ");
    int N = sc.nextInt();
    int total = 0;
    for (int i = 1; i <= N; i++) {
        System.out.print(i);
        if (i< N) {
             System.out.print(" + ");
        }
        total+=i;
    }
     System.out.println(" = "+total);
     System.out.println("Total penjumlahan dari 1 sampai " +N+" adalah " + total);
}   
}
