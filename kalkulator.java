import java.util.*;

public class Cakulator {
    public static void main(String[] args) {
  
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("=----------< KALKULATOR >----------=");
        System.out.println("====================================");
        System.out.println(" ");

        System.out.print("Input bilangan pertama = ");
        a = inputUser.nextFloat();
        System.out.print("Input bilangan kedua = ");
        b = inputUser.nextFloat();
        System.out.print("Operasi aritmatika (*,/,+,-,%) = ");
        operator = inputUser.next();
       
        System.out.println(" ");

        switch(operator){
            case "+":
                 //penjumlahan
                 hasil = a + b;
                 System.out.println("hasil = " + hasil);
                 break;
            case "-":
                 //pengurangan
                 hasil = a - b;
                 System.out.println("hasil = " + hasil);
                 break;
            case "*":
                 //perkalian
                 hasil = a * b;
                 System.out.println("hasil = " + hasil);
                 break;
            case "/":
                 //pembagian
                 hasil = a / b;
                 System.out.println("hasil = " + hasil);
                 break;
            default:
                 System.out.println("operator" + operator + "tidak di temukan");
        }
    }
}