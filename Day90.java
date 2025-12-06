import java.util.Scanner;
public class day90 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan angka pertama: ");
    int a = sc.nextInt();
    System.out.print("Masukan angka kedua  : ");
    int b = sc.nextInt();
    System.out.println("Nilai Maksimal: " + maxx(a, b));
    System.out.println("Nilai Minimal : " + minn(a, b));
}
public static int maxx(int a, int b){
    if (a>b) {
      return a;
    }else{
      return b;   
    }   
}
public static int minn(int a, int b){
    if (a<b) {
        return a;
    }else{
        return b;
    }
}
}
