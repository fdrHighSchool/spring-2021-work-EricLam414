public class Position{
  public Position(int r, int c){

  }
  //Part A
  public static Position findPosition(int num, int[][] intArr){
    for(int r = 0; r < intArr.length; r++){
      for(int c = 0; c < intArr[0].length; c++){
        if(intArr[r][c] = num){
          return new Position(r, c);
        }
      }
    }
    return null;
  }
  //Part B
  public static Position[][] getSuccessorArray(int[][] intArr){
    Position[][] successorArray = new Position[intArr.length, intArr[0].length];
    for(int r = 0; r < intArr.length; r++){
      for(int c = 0; c < intArr[0].length; c++){
        successorArray[r][c] = findPosition(int[r][c] + 1, intArr);
      }
    }
    return successorArray;
  }
}
