public class LightBoard{
  public LightBoard(int numRows, int numColumns){
  boolean lights = new boolean [numRows][numColumns];
  for(int i = 0; i < row; i++ ){
    for(int j = 0; j < col; j++){
      int random = (int)(Math.random() * 10) + 1;
      if (random <= 4){
        lights[row][col] = true;
      }
    }
  }
}

public boolean evaluateLight(int row, int col){
  int count = 0;
  for (int i = 0; i < lights.length; i++){
    if(lights[i][col]){
      count++;
    }
  }
  if ((lights[row][col]) && (count % 2 == 0)){
    return false;
  } //end else
  else if ((lights[row][col] == false) && (count % 3 == 0)){
    return true;
  } //end if
  return lights[row][col];
} //end evaluateLight()

} //end class
