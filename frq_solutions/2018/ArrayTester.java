public class Arraytester {
  public static int[] getColumn(int[][] arr2D, int c){
      int[] arr = new int[arr2D.length];
      for (int i = 0; i < arr2D.length; i++){
          arr[i] = arr2D[i][c];
      }
      return arr;
  }
  public static boolean isLatin(int[][] square) {
    if (!containsDuplicates(square[0])) {
      for(int i = 0; i < square.length; i++){
        if(!hasAllValues(square[0], square[i])){
          return false;
        }
      }
      for(int j = 0; j < square.length; j++){
        if(!hasAllValues(square[0], getColumn(square, j)){
          return false;
        }
      }
      return true;
    }
    return false;
  }

}
