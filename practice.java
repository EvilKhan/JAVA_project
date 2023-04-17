import java.util.Scanner;

public class practice {
  public static void main(String[] args) {
    System.out.println("Hello");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    String name = sc.next();
    System.out.println(age);
    System.out.println(name);
    sc.close();
  }

}

