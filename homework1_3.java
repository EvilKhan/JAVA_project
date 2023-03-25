import java.util.Scanner;

/**
* Реализовать простой калькулятор (+ - / *)
* Ввод числа ->
* Ввод знака ->
* Ввод числа ->
 */

public class homework1_3 {
  public static void main(String[] args) {
    double num1, num2, res;
    char opper;
    Scanner reader = new Scanner(System.in);
    System.out.print("введите число: ");
    num1 = reader.nextDouble();
    System.out.print("введите оператор (+, -, *, /): ");
    opper = reader.next().charAt(0);
    System.out.print("введите число: ");
    num2 = reader.nextDouble();
    reader.close();
    switch(opper) {
       case '+': res = num1 + num2;
          break;
       case '-': res = num1 - num2;
          break;
       case '*': res = num1 * num2;
          break;
       case '/': res = num1 / num2;
          break;
       default:  System.out.printf("ошибка! ");
          return;
    }
    System.out.println(res);
  }
}