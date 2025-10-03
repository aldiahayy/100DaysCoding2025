public class day26 {
public static void main(String[] args) {
    // penugasan aritmatika
    System.out.println(">>> Penugasan Aritmatika <<<");
    int a = 7;
    a += 3; // 7 + 3 = 10
    System.out.println("nilai a += 3 = " + a);
    a -= 4; // 10 - 4 = 6
    System.out.println("nilai a -= 3 = " + a);
    a *= 2; // 6 x 2 = 12
    System.out.println("nilai a *= 2 = " + a);
    a /= 3; // 12 / 3 = 4
    System.out.println("nilai a /= 3 = " + a);
    a %= 3; // 4 % 3 = 1
    System.out.println("nilai a %= 3 = " + a);
    
    // penugasan bitwise
    System.out.println("\n>>> Penugasan Bitwise <<<");

    int b = 7;
    b &= 3; // 7 & 3 = 3
    System.out.println("nilai b &= 3 = " + b);
    b |= 6; // 3 | 6 = 7 
    System.out.println("nilai b |= 6 = " + b);
    b ^= 5; // 7 ^ 5 = 2
    System.out.println("nilai b ^= 5 = " + b);
    b <<= 2; // 2 << 2 = 8 
    System.out.println("nilai b <<= 2 = " + b);
    b >>= 2; // 8 >> 2 = 2
    System.out.println("nilai b >>= 2 = " + b);
}   
}
