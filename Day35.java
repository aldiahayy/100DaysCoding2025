import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan koordinat x awal : ");
        int x = sc.nextInt();
        System.out.print("Masukkan koordinat y awal : ");
        int y = sc.nextInt();
        System.out.print("Masukkan arah mata angin yang ingin dituju (U/S/T/B) : ");
        String arah = sc.next();

        if (arah.equalsIgnoreCase("U")) {
            y += 1;
            System.out.println("posisi akhir Adham adalah x : " + x + " dan y : " + y + " (Adham bergerak satu langkah ke utara)");
        } else if (arah.equalsIgnoreCase("S")) {
            y -= 1;
            System.out.println("posisi akhir Adham adalah x : " + x + " dan y : " + y + " (Adham bergerak satu langkah ke selatan)");
        } else if (arah.equalsIgnoreCase("T")) {
            x += 1;
            System.out.println("posisi akhir Adham adalah x : " + x + " dan y : " + y + " (Adham bergerak satu langkah ke timur)");
        } else if (arah.equalsIgnoreCase("B")) {
            x -= 1;
            System.out.println("posisi akhir Adham adalah x : " + x + " dan y : " + y + " (Adham bergerak satu langkah ke barat)");
        } else {
            System.out.println("Upss! arah mata angin yang kamu masukan salah");
        }
    }
}
