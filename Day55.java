import java.util.Scanner;
public class day55 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Batas Bawah: ");
    int bawah = sc.nextInt();
    System.out.print("Batas Atas: ");
    int atas = sc.nextInt();
    System.out.print("Angka: ");
    int angka = sc.nextInt();
    
    if (angka >= bawah && angka <= atas) {
        System.out.println("YAYAYAYA");
    }else{
        System.out.println("NONONONO");
    }
}   
}

package latihanEvaluasi2;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai: ");
        int nilai = sc.nextInt();
        if (nilai > 70) {         
            System.out.println("Ujian Kroco Ji Pale");          
        }else{
            System.out.println("Sa Jappo’ka Aih");
        }
    }
}

package latihanEvaluasi2;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Angka: ");
        int angka = sc.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("Iyaji");
        }else{
            System.out.println("Tidakji");
        }
    }
}
