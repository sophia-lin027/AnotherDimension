import java.util.*;

public class Tester {
  public static void main(String[] args){
    int[] array = {};
    int[] array1 = {3, 4, 5};
    int[][] A = {{1, 0, 12, -1}, {7, -2, 2, 1}, {-5, -2, 2, -9}};
    System.out.println(ArrayOps.sum(array));
    System.out.println(ArrayOps.largest(array1));
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
  }
}
