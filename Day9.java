public class day9 {
  public static void main(String[] args) {
    //deklarasi 
    String nama,nim;
    char kelas;
    byte umur;
    //inisialisasi
    nama = "aldi salam";
    nim = "d0224043";
    kelas = 'a';
    umur = 18;
    
      System.out.println("---Sebelum Update---");
      System.out.printf("%-7s : %-10s %n","Nama",nama);
      System.out.printf("%-7s : %-10s %n","Nim",nim);
      System.out.printf("%-7s : %-10c %n" ,"Kelas",kelas);
      System.out.printf("%-7s : %-10d %n","Umur",umur);
      //update
      nama = "ALDI SALAM";
      nim = "D0224043";
      kelas = 'A';
      umur = 19;
      
      System.out.println("---Setelah Update---");
      System.out.printf("%-7s : %-10s %n","Nama",nama);
      System.out.printf("%-7s : %-10s %n","Nim",nim);
      System.out.printf("%-7s : %-10c %n" ,"Kelas",kelas);
      System.out.printf("%-7s : %-10d %n","Umur",umur);  
} 
}
