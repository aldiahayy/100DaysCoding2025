import java.util.Scanner;
public class day61 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan batas angka(N): ");
    int N = sc.nextInt();
    System.out.print("Masukan angka kelipatan(M): ");
    int M = sc.nextInt();
    System.out.print("Kelipatan "+M+" antara 1-"+N+": ");
    for (int i = 1; i <= N; i++) {
        if (i%M==0) {
            System.out.print(i+" ");
        }
    }
}
}
