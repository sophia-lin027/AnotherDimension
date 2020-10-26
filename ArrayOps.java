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

  public static int largest(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) max = arr[i];
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
    int a[] = new int [matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      a[i] = sum(matrix[i]);
      }
    return a;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] a = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      a[i] = largest(matrix[i]);
    }
    return a;
  }

  public static int sum(int[][] arr) {
    int sum1 = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        sum1 = sum1 + arr[i][j];
      }
    }
    return sum1;
  }

  // note: for my previous commits, I didn't use 4a and 4b in 4c and 4d since I wasn't
  //       sure how to use it at first.

  public static int[] sumCols(int[][] matrix) {
    int a[] = new int [matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        a[j] += matrix[i][j];
      }
    }
    return a;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int sum = sumRows(matrix)[0];
    int count = 0;
    boolean magic = false;
    for (int i = 1; i < sumRows(matrix).length; i++) {
      if (sum == sumRows(matrix)[i]) {
        count++;
      }
    }
    if (count == matrix.length - 1){
      magic = true;
    }
    return magic;
  }

  public static boolean isColMagic(int[][] matrix) {
    int sum = sumCols(matrix)[0];
    int count = 0;
    boolean magic = false;
    for (int i = 1; i < sumCols(matrix).length; i++) {
      if (sum == sumCols(matrix)[i]) {
        count++;
      }
    }
    if (count == sumCols(matrix).length - 1) {
      magic = true;
    }
    return magic;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    int a[] = sumRows(matrix);
    int b[] = sumCols(matrix);
    if (a[row] != a[col]) {
      return false;
    }
    else return true;
  }
}
