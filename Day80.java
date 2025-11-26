import java.util.Scanner;
public class day80 {
public static void main(String[] args) {
    String buah[] = {"anggur","apel", "stroberi", "pisang", "mangga"};
    System.out.println("Buah terenak  : " + buah[0]);
    System.out.println("Buah terakhir : " + buah[4]);
    System.out.println("Saya bosan dengan buah " + buah[3] + ". Ganti dengan durian");
    buah[3] = "durian";
    System.out.println("Buah yang ke-4 sekarang adalah " +  buah[3]);
    System.out.println("Banyak buah adalah " + buah.length);   
}
}
