/**Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1. */

public class seminar1_1 {
  public static void main(String[] args) {
    int[] arr = new int[]{1,1,1,1,0,1,1,1};
    int count = 0;
    int max_count = 0;
    // indexes
    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i]==1) {
    //     count++;
    //     if (count > max_count) {
    //       max_count = count;
    //     }
    //   } else count = 0;
    // }
    // items
    // for (int item : arr) {
    //   if (item==1) {
    //     count++;
    //     if (count > max_count) max_count = count;
    //   } else count = 0;
    // }
    // от учителя
    for (int item : arr) {
      if (item==1) {
        count++;        
      } else {
        if (count>max_count) max_count = count;
        count = 0;
      }
    }
    if (count>max_count) max_count = count;
    System.out.println(max_count);
  }
  
}
