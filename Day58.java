import java.util.Scanner;
public class day58 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan batas N: ");
    int N = sc.nextInt();
    for (int i = 1; i <= N; i++) {
        System.out.print(i+" ");
    }
    System.out.println("");
    for (int j = N; j >= 1; j--) {
        System.out.print(j+" ");
    }
}  
}
