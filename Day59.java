import java.util.Scanner;
public class day59 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan batas angka: ");
    int n = sc.nextInt();
    System.out.println("ganjil");
    for (int i = 1; i <= n; i+=2) {
        System.out.print(i+" ");            
        }
    System.out.println("\ngenap");
    for (int j = 1; j <= n; j++) {
        if (j%2==0) {
            System.out.print(j+" ");
        }
    }
    }
}
