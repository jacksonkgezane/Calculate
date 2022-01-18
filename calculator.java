import java.util.Scanner;

class Main {
  private static int i;

public static void main(String[] args) {

    char operator;
    int number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextInt();

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter second number");
    i = number2 = input.nextInt();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

     // performs division between numbers
     case '/':
       
     if(number2==0) {
       System.out.println("Please note that you cannot divide by 0");
       
       
     }
     else{
       
       result = number1 / number2;
     System.out.println(number1 + " / " + number2 + " = " + result);

     }
     break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}