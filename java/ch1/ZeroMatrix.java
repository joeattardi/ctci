public class ZeroMatrix {
  public static void main(String...args) {
    Integer[][] matrix = new Integer[][] {
      new Integer[] { 10, 11, 12, 13 },
      new Integer[] { 14, 0, 16, 17 },
      new Integer[] { 18, 19, 0, 21 },
      new Integer[] { 22, 23, 24, 25 }
    };

    zero(matrix);
    print(matrix);
  }

  private static void zero(Integer[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != null && matrix[i][j] == 0) {
          zeroOut(matrix, i, j);
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == null) {
          matrix[i][j] = 0;
        }
      }
    }
  }

  private static void zeroOut(Integer[][] matrix, int row, int column) {
    for (int i = 0; i < matrix[row].length; i++) {
      matrix[row][i] = null;
    }

    for (int i = 0; i < matrix.length; i++) {
      matrix[i][column] = null;
    }
  }

  private static void print(Integer[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }

      System.out.println("");
    }
  }
}
