package pr1_blatt3;

public class SumArray {
  public static void main(String[] args) {
    int someArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    for (int i : someArray)
      sum += i;
    System.out.println("sum is " + sum);
  }
}