import java.util.Scanner;
public class day60 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan batas angka(N): ");
    int N = sc.nextInt();
    System.out.print("Angka ganjil("+N+"-1): ");
    for (int i = N; i >= 1; i--) {
        if (i%2==1) {
            System.out.print(i+" ");
        }
    }
    System.out.print("\nAngka genap("+N+"-1): ");
    for (int i = N; i >= 1; i--) {
        if (i%2==0) {
            System.out.print(i+" ");
        }
    }
}  
}
