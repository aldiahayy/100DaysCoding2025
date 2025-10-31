import java.util.Scanner;
public class day54 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan batas angka: ");
    int angka = sc.nextInt();
    System.out.println("=== FOR LOOP ===");
    for (int i = 1; i <= angka; i++) {
        if (i % 2 == 0) {
            continue;  
        }
        System.out.print(i + " ");
    }
    System.out.println("\n=== WHILE LOOP ===");
    
    int awal = 1;
    while (awal <= 20){
        if (awal % 10 == 0 || awal % 4 == 0) {
            awal++;
            continue;
        }
        System.out.print(awal + " ");
        awal++;
    }
    System.out.println("\n=== DO WHILE LOOP ===");
    do{
        if (angka % 3 == 0 && angka % 5 == 0) {
            angka++;
            continue;
        }
        System.out.print(angka + " ");
        angka++;
    }while(angka <= 30);
}
}
