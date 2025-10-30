import java.util.Scanner;
public class day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        switch (angka) {
            case 1:
                System.out.println("angka adalah 1");
                break;
            case 2:
                System.out.println("angka adalah 2");
            case 3:
                System.out.println("angka adalah 3");
                break;
            case 4:
                System.out.println("angka adalah 4");
                break;
            default:
                System.out.println("angka tidak diketahui");
                break;
        }
        for (int i = 1; i <= angka; i++) {
          System.out.print(i+" ");
          break;
        }System.out.println("");
        int angka2 = 2;
        while (angka2 <= 10) {
          System.out.println(angka2);
          angka2++;
          break;
        }
        do{
          System.out.println(angka);
          angka++;
          break;
        }while(angka <= 10);
    }
}
