import java.util.Scanner;
public class day33{
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Masukkan umur anda : ");
            int umur = sc.nextInt();
            System.out.print("Apakah anda sudah menikah? (true/false) : ");
            boolean sudahMenikah = sc.nextBoolean();
            System.out.print("Berapakah mobil anda? : ");
            int mobil = sc.nextInt();
            
            boolean syaratKaryawan = (umur >= 18) && (!sudahMenikah == true);
            boolean menantuIdaman = syaratKaryawan || (mobil >= 2);
            
            System.out.println("Apakah anda diterima jadi karyawan? " + syaratKaryawan);
            System.out.println("Apakah anda diterima jadi menantu idaman? " + menantuIdaman);
            
    }
    }
