public class day14 {
    public static void main(String[] args) {
     String untukByte = "123";
     String untukShort = "2025";
     String untukInt = "194508";
     String untukLong = "123456789";
     String untukFloat = "3.14";
     String untukDouble = "165.77";
     String untukBoolean = "true";
     
     byte nilaiByte = Byte.parseByte(untukByte);
     short nilaiShort = Short.parseShort(untukShort);
     int nilaiInt = Integer.parseInt(untukInt);
     long nilaiLong = Long.parseLong(untukLong);
     float nilaiFloat = Float.parseFloat(untukFloat);
     double nilaiDouble = Double.parseDouble(untukDouble);
     boolean nilaiBoolean = Boolean.parseBoolean(untukBoolean);
     
     System.out.printf("%-9s : %d %n","Byte", nilaiByte);
     System.out.printf("%-9s : %d %n","Short", nilaiShort);
     System.out.printf("%-9s : %d %n","Integer", nilaiInt);
     System.out.printf("%-9s : %d %n","Long", nilaiLong);
     System.out.printf("%-9s : %.2f %n","Float", nilaiFloat);
     System.out.printf("%-9s : %.2f %n","Double", nilaiDouble);
     System.out.printf("%-9s : %b %n","Boolean", nilaiBoolean);   
    }
}
