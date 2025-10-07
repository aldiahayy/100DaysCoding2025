import java.util.Scanner;
public class day30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur : ");
        int umur = sc.nextInt();

        boolean minimal = umur >= 1;  
        boolean maksimal = umur <= 5;  
        System.out.println("Apakah umur " + umur + " tahun termasuk balita? " + (!minimal ^ maksimal));
    }
}
