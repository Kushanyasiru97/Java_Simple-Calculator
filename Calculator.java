
import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double n1;
      double n2;
      double result;
      char operate;
      Scanner cal = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      n1 = cal.nextDouble();
      n2 = cal.nextDouble();
      System.out.print("\nEnter Your Operator type(+, -, *, /): ");
      operate = cal.next().charAt(0);
      switch(operate) {
         case '+': result = n1+n2;
            break;
         case '-': result = n1-n2;
            break;
         case '*': result = n1*n2;
            break;
         case '/': result = num1/num2;
            break;
      default: System.out.printf("You are Enter Invalid Operator Type!!!!");
         return;
      }
      System.out.print("\nYour calculate result is: \n");
      System.out.printf(n1+""+operate+""+n2+"="+result);
   }
}
