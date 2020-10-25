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
      for (int j = 0; j < matrix[i].length; j++) {
        a[i] = a[i] + matrix[i][j];
      }
    }
    return a;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] a = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] > a[i]) {
          a[i] = matrix[i][j];
        }
      }
    }
    return a;
    }
  }
