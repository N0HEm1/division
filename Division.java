package jatsiry;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
         float no,mo,b;
         System.out.print("ingresa el numero: ");
         no=leer.nextFloat();
         System.out.print("ingresa el numero: ");
         mo=leer.nextFloat();
         b=no/mo;
         System.out.print("la division es: "+b);
    }
}
