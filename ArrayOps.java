public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    if (arr.length == 0) return 0;
    else {
      for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
      }
    }
    return sum;
  }
}
