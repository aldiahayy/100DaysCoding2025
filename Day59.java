import java.util.Scanner;
public class day59 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan batas angka(N): ");
    int N = sc.nextInt();
    System.out.print("Angka ganjil: ");
    for (int i = 1; i <= N; i++) {
        if (i%2==1) {
         System.out.print(i+" ");    
        }           
        }
    System.out.print("\nAngka genap: ");
    for (int j = 1; j <= N; j++) {
        if (j%2==0) {
            System.out.print(j+" ");
        }
        }
    }
}
