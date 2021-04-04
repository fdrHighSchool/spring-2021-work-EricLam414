class Crossword{
  private Square[][] puzzle;
  public Crossword(boolean[][] blackSquares){
    int count = 1;
    for(int r = 0; r < blackSquares.length; r++){
      for(int c = 0; c < blackSquares[0].lenght; c++){
        if(toBeLabeled(r,c, blackSquares)){
          puzzle[r][c] = new Square(false, count);
          count++;
        }
        else{
          puzzle[r][c] = new Square(blackSquares[i][j], 0);
        }
      }
    }
  }

  private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
    if(blackSquares[r][c] == false){
      if(!(r == 0 && c == 0)){
        if(blackSquares[r-1][c] == false && blackSquares[r][c+1] == false){
          return false;
        }
        return true;
      }
    }
    return false;
  }

}
