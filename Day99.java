import java.util.Scanner;
public class day99 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan batas angka: ");
    int n = sc.nextInt();
    System.out.print("Deret bilangan prima dari 1-" + n +": ");
    for (int i = 2; i <= n; i++) {
        boolean prima = true;
        for (int j = 2; j < i-1; j++) {
            if (i%j==0) {
                prima = false;
                break;
            }
        }
        if (prima) {
            System.out.print(i+" ");
        }
    }
}
}
