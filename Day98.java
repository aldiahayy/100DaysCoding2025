import java.util.Scanner;
public class day98 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan jumlah deret: ");
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.print("Deret fibonanci : ");
    for (int i = 0; i < n; i++) {
        System.out.print(a+" ");
    int c = a+b;
    a=b;
    b=c;
    }
}
}
