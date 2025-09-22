public class day15 {
    public static void main(String[] args) {
        String bil1 = "123";
        String bil2 = "456";
        
        System.out.println("=====SEBELUM PARSE=====");
        System.out.println("Penjumlahan: " + (bil1 + bil2));
        
        int no1 = Integer.parseInt(bil1);
        double no2 = Double.parseDouble(bil2);
        
        System.out.println("=====SETELAH PARSE=====");
        System.out.println("Penjumlahan: " + (no1 + no2));
        System.out.println("Penguragan: " + (no2 - no1));
    }
}
