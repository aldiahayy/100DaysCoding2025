import java.util.Scanner;
public class day22 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====PROGRAM MENGHITUNG LUAS PERSEGI====");
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = sc.nextInt();
        
        int luas = sisi * sisi;
        System.out.println("Jadi luas persegi dari panjang sisi " + sisi + " adalah " + luas);
        
    }
    
}
