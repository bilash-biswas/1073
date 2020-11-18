import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
     int a,b,i;
     Scanner input = new Scanner(System.in);
     a = input.nextInt();
     for(i=2;i<=a;i=i+2)
     {
         System.out.printf("%d^2 = %d\n",i,i*i);
     }
   }
}
