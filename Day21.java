public class day21 {
public static void main(String[] args) {
    int a = 22;
    int b = 28;
    
    System.out.println("=====SEBELUM DITUKAR=====");
    System.out.printf("%-7s : %d %n", "Nilai a", a);
    System.out.printf("%-7s : %d %n", "Nilai b", b);
    
    a = a + b; // 22 + 28 = 50
    b = a - b; // 50 - 28 = 22
    a = a - b; // 50 - 22 = 28
    
    System.out.println("=====SEBELUM DITUKAR=====");
    System.out.printf("%-7s : %d %n", "Nilai a", a);
    System.out.printf("%-7s : %d %n", "Nilai b", b);
}
}
