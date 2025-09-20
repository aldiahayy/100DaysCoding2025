package evaluasiSatu;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Judul: ");
        final String JUDUL = sc.nextLine();
        System.out.print("Masukkan tahun: ");
        short tahun = sc.nextShort();
        sc.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan jauh perjalanan: ");
        byte perjalanan = sc.nextByte();
        System.out.print("Masukkan harga: ");
        int harga = sc.nextInt();
        System.out.print("Masukkan jumlah kota: ");
        byte kota = sc.nextByte();
        System.out.print("Masukkan kendaraan: ");
        char inisial = sc.next().charAt(0);
        System.out.print("Masukkan waktu perjalanan: ");
        float waktu = sc.nextFloat();
        System.out.print("Masukkan rata-rata perjalanan: ");
        double rataRata = sc.nextDouble();
        System.out.print("Masukkan biaya: ");
        long biaya = sc.nextLong();
        System.out.print("Masukkan status: ");
        boolean status = sc.nextBoolean();
        
        System.out.println("Judul: " + JUDUL);
        System.out.println("pada tahun " + tahun + ", seorang mahasiswa bernama " + nama
        + " melakukan\nperjalanan sejauh " + perjalanan + " km hanya demi makam ayam geprak seharga " + harga + "\nrupiah. Ia mengunjungi " + kota + 
         " kota dengan menggunakan kendaraan berinisial " + inisial + ".\nPerjalanan tersebut memakan waktu " + waktu + " hari dengan rata-rata\nkecepatan "
        + rataRata + " km/jam. Total biaya perjalanan mencapai " + biaya + "\nrupiah.\nStatus perjalanan: " + status);
    }
}

package evaluasiSatu;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
   
        System.out.print("Masukkan universitas : ");
        final String UNIVERSITAS = sc.nextLine();
        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        final String NIM = sc.nextLine();
        System.out.print("Masukkan semester : ");
        byte semester = sc.nextByte();
        System.out.print("Masukkan jumlah SKS : ");
        short sks = sc.nextShort();
        System.out.print("Masukkan tahun masuk : ");
        int tahun = sc.nextInt();
        System.out.print("Masukkan IPK : ");
        float ipk = sc.nextFloat();
        System.out.print("Masukkan tinggi badan : ");
        double tb = sc.nextDouble();
        System.out.print("Masukkan gender (L/P) : ");
        char gender = sc.next().charAt(0);
        System.out.print("Masukkan status pernikahan : ");
        boolean nikah = sc.nextBoolean();
        
        System.out.println("==========BIODATA MAHASISWA==========");
        System.out.printf("%-17s :%-10s %n", "Universitas",UNIVERSITAS);
        System.out.printf("%-17s :%-10s %n", "Nama",nama);
        System.out.printf("%-17s :%-10s %n", "NIM",NIM);
        System.out.printf("%-17s :%-10d %n", "Semester",semester);
        System.out.printf("%-17s :%-10d %n", "Jumlah SKS",sks);
        System.out.printf("%-17s :%-10d %n", "Tahun Masuk",tahun);
        System.out.printf("%-17s :%-10.2f %n", "IPK",ipk);
        System.out.printf("%-17s :%-10.2f %n", "Tinggi Badan",tb);
        System.out.printf("%-17s :%-10c %n", "Jenis Kelamin",gender);
        System.out.printf("%-17s :%-10b %n", "Status Aktif",nikah);
    }
}


package evaluasiSatu;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double luas, keliling;
        System.out.println("#Sebelum update");
        System.out.print("Masukkan nilai r : ");
        final double phi = 3.14;
        byte r = sc.nextByte();
         luas = phi * (r*r);
         keliling = 2 * phi * r; 
        
        System.out.println("Contoh Output");
        System.out.println("Hasil:\nJadi, luas lingkaran adalah "+ luas +" cm^2 dan keliling lingkaran adalah "+ keliling + " cm jika nilai r-nya adalah " + r +" cm");
        
        System.out.println("#Setelah update");
        System.out.print("Masukkan nilai r : ");
         r = sc.nextByte();
         luas = phi * (r*r);
         keliling = 2 * phi * r; 
         System.out.println("Contoh Output");
        System.out.println("Hasil:\nJadi, luas lingkaran adalah "+ luas +" cm^2 dan keliling lingkaran adalah "+ keliling + " cm jika nilai r-nya adalah " + r +" cm");         
    }
}

