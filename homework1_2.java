// Вывести все простые числа от 1 до 1000
public class homework1_2 {
  public static void main(String[] args) {
    int nums, count;
    for (nums = 1; nums <1001; nums++) {
        count = 0;
        for (int i = 1; i <= nums; i++) {
            if (nums % i == 0)
                count++;
        }
        if (count <= 2)
            System.out.printf("%d,", nums);

    }
  }
}
