import java.util.*;

public class BasicCalculator
{
   public static void main(String[] args)
   {
      Scanner con = new Scanner(System.in);
      
      System.out.print("Enter 1st number: ");
      double firstNum = con.nextDouble();
      
      System.out.print("Enter 2nd number: ");
      double secondNum = con.nextDouble();
      
      System.out.print("Choose an operator (+, -, *, /): ");
      char operator = con.next().charAt(0);
      
      //formula and conditions
      
      if (operator == '+')
      {
         double sum = firstNum + secondNum;
         System.out.println("Result: " + sum);
      }
      
      else if (operator == '-')
      {
         double diff = firstNum - secondNum;
         System.out.println("Result: " + diff);
      }
      
      else if (operator == '*')
      {
         double prod = firstNum * secondNum;
         System.out.println("Result: " + prod);
      }
      
      else if (operator == '/')
      {
         double quo = firstNum / secondNum;
         System.out.println("Result: " + quo);
      }
      
      else 
      {
         System.out.println("Error: You have entered an invalid operator. Please try again.");
      }
   }
}