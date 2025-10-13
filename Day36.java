import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah kamu memiliki kartu akses? (true/false) : ");
        boolean kartu = sc.nextBoolean();
        if (kartu) {
            System.out.print("Pintu Gerbang Utama berhasil diakses\nApakah kamu sedang dalam jadwal piket? (true/false) : ");
            boolean piket = sc.nextBoolean();
            if (piket) {
                System.out.print("Pintu Gerbang IT berhasil di akses\nSilahkan masukkan pin : ");
                int pin = sc.nextInt();
                if (pin == 1234) {
                    System.out.println("Pintu Ruang Server berhasil diakses\nKamu di persilahkan masuk");
                } else {
                    System.out.println("kamu dilarang masuk, pin yang kamu masukkan salah");}
            } else {
                System.out.println("kamu dilarang masuk, kamu tidak memiliki jadwal piket");}
        } else {
            System.out.println("kamu dilarang masuk, kamu tidak memiliki kartu akses");
        }
    }
}
