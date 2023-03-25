import java.util.Scanner;

/**Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */

public class homework1_1 {
  
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner num = new Scanner(System.in);
    int val = num.nextInt();
    int fact = 1;
    int trian = 0;
    num.close();
    for (int i = 1; i <= val; i++) {
      trian+=i;
      fact*=i; 
    }
    System.out.println(trian);
    System.out.println(fact);

  }
}

