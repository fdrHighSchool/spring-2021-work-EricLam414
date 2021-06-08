import java.util.*;
boolean player1 = false;
boolean player2 = true;
String winner = "";
String[][] board = new String[3][3];
int count = 0;
void setup(){
  size(300, 325);

}

void draw(){
  //frameRate(1);
  background(255);
  stroke(0);
  strokeWeight(5);
  line(0, 100, 300, 100);
  line(0, 200, 300, 200);
  line(100, 0, 100, 300);
  line(200, 0, 200, 300);
  textSize(75);
  fill(0);
  for(int r = 0; r < 3; r ++){
    for(int c = 0; c < 3; c ++){
      if(board[r][c] == null){
        board[r][c] = "-";
      }
      if(board[r][c].equals("X") || board[r][c].equals("O")){
        text(board[r][c], (c * 100) + 25, (r * 100) + 75);
      }
    }
  }
  String player = "";
  if(player1)
    player += "It is Player 1 (X)'s turn";
  else if(player2)
    player += "It is Player 2 (O)'s turn";
  textSize(25);
  text(player, 17, 323);
  
  textSize(75);
  fill(255);  
  if(hasWon()){
    noStroke();
    rect(0, 0, 300, 325);
    String str = winner +  " has won!";
    textSize(50);
    fill(0);
    text(str, 20, 160);
    
    textSize(25);
    text("Press r to play again", 23, 300);
    if(keyPressed && key == 'r'){
      player1 = true;
      player2 = false;
      count = 0; 
      board = new String[3][3];
    }
  } 
  else if(count == 9){
    noStroke();
    rect(0, 0, 300, 325);
    String str = "It's a tie!";
    textSize(50);
    fill(0);
    text(str, 50, 160);
    textSize(25);
    text("Press r to play again", 23, 300);
    if(keyPressed && key == 'r'){
      player1 = false;
      player2 = true;
      count = 0; 
      board = new String[3][3];
    }
  }
  else if(player2){ 
    nextMove();
  }

  
}
void nextMove(){
    int bestScore = Integer.MIN_VALUE;
    int[] bestMove = new int[2];
    for(int r = 0; r < 3; r++){
      for(int c = 0; c < 3; c ++){
          if(board[r][c] == null || board[r][c].equals("-")){
            board[r][c] = "O";
            int score = minimax(board, 0, false, count);
            System.out.println(score);
            board[r][c] = "-";
            if(score > bestScore){
              bestScore = score;
              bestMove[0] = r;
              bestMove[1] = c;
            }
          }
      }
    }
    board[bestMove[0]][bestMove[1]] = "O";
    player1 = true;
    player2 = false;
    count++;
}
int minimax(String[][] board, int depth, boolean isMaximizing, int turns){
  boolean result = hasWon();
  if(result){
    if(winner.equals("X")){
      winner = "";
      return -10;
    }
    else if(winner.equals("O")){
      winner = "";
      return 10;
    }
  }
  else if(turns == 9){
    winner = "";
    return 0;
  }
  if(isMaximizing){
    int bestScore = Integer.MIN_VALUE;
    for(int r = 0; r < 3; r++){
      for(int c = 0; c < 3; c ++){
          if(board[r][c] == null || board[r][c].equals("-")){
            board[r][c] = "O";
            int score = minimax(board, depth + 1, false, turns + 1);
            board[r][c] = "-";
            bestScore = max(score, bestScore);
          }
      }
    }
    return bestScore; 
  }
  else{
    int bestScore = Integer.MAX_VALUE;
    for(int r = 0; r < 3; r++){
      for(int c = 0; c < 3; c ++){
        if(board[r][c] == null || board[r][c].equals("-")){
          board[r][c] = "X";
          int score = minimax(board, depth + 1, true, turns + 1);
          board[r][c] = "-";
          bestScore = min(score, bestScore);
        }
      }
    }
    return bestScore;
  }
}
void mouseClicked(){
    textSize(75);
    fill(0);
    int x = mouseX;
    int y = mouseY;
    for(int r = 0; r < 300; r += 100){
      for(int c = 0; c < 300; c += 100){
        if(y > r && y < r + 100 && x > c && x < c + 100){
          if(board[r/100][c/100] == null || board[r/100][c/100].equals("-")){
            if(player1){
              board[r/100][c/100] = "X";
              player1 = false;
              player2 = true;
              count++;
            }         
          }
        }
      }
    }  
}
boolean hasWon(){
  for(int i = 0; i < 3; i++) {
    if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && !board[i][0].equals("-")) {
      winner = board[i][0];
      return true;
    }
  }
  for(int j = 0; j < 3; j++) {
    if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && !board[0][j].equals("-")){
      winner = board[0][j];
      return true;
    }
  }
  if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && !board[0][0].equals("-")) {
    winner = board[0][0];
    return true;
  }
  if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && !board[2][0].equals("-")) {
    winner =  board[2][0];
    return true;
  }
  return false;
}
