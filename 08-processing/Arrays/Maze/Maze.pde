int cols, rows;
int w = 30;
cell[][] grid;

int went, last, first;
boolean reached, start;
ArrayList<cell> stack = new ArrayList<cell>();
cell current;
void setup(){
  cols = width / w;
  rows = height/ w;
  //changes size of maze
  size(600, 600);
  //sets speed
  //frameRate(5);
  went = 1;
  last = rows*cols;
  reached = false;
  start = true; 
  grid = new cell[rows][cols];
  for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
      grid[i][j] = new cell(i, j);
    }
  }
  current = grid[0][0];
}
void draw(){
  noStroke();
  fill(255);
  rect(0, 0, height, width);
  stroke(10);
  for(int i = 0; i < rows; i++){
    for(int j = 0; j < cols; j++){
      grid[i][j].show();
    }
  }
  current.setVisited(true);
  cell next = current.checkNeighbors();
  if(next != null){
    next.visited = true;
    
    stack.add(current);
    
    removeWalls(current, next);
    current = next;
  }
  else if(stack.size() > 0){
    current = stack.remove(stack.size() - 1);
  }
}
class cell{
  int i, j;
  boolean[] walls = {true, true, true, true};
  boolean visited = false;
  boolean lastCell = false;
  boolean firstCell = false;
  cell(int i, int j){
    this.i = i;
    this.j = j;
  }
  void setWalls(int i, boolean status){
    this.walls[i] = status;
  }
  boolean[] getWalls(){
    return this.walls;
  }
  int getI(){
    return this.i;
  }
  int getJ(){
    return this.j;
  }
  void show(){
    int x = this.i * w;
    int y = this.j * w;
    if(this.walls[0]){
      line(x, y, x + w, y);
    }
    if(this.walls[1]){
      line(x + w, y, x + w, y + w);
    }
    if(this.walls[2]){
      line(x + w, y + w, x, y + w);
    }
    if(this.walls[3]){
      line(x, y + w, x, y);
    }
    if(this.visited){
      noStroke();
      if(this.lastCell)
        fill(100, 0, 100, 100);
      else if(this.firstCell)
        fill(100, 0, 100, 100);
      else
        fill(255, 0, 255, 100);
      rect(x, y, w, w);
      stroke(10);
      fill(255);
    }
  }
  void setVisited(boolean v){
    this.visited = v;
  }
  boolean visited(){
    return this.visited;
  }
  cell checkNeighbors(){
    if(!reached && went == last){
      this.lastCell = true;
      reached = true;
    }
    if(start && went == 1){
      this.firstCell = true;
      start = false;
    }
    ArrayList<cell> neighbors = new ArrayList<cell>();
    
    cell top = null;
    cell right = null;
    cell bottom = null;
    cell left = null;
    if(inRange(i, j - 1)){
      top = grid[i][j - 1];
    }
    if(inRange(i + 1, j)){
      right = grid[i + 1][j];
    }
    if(inRange(i, j + 1)){
      bottom = grid[i][j + 1];
    }
    if(inRange(i - 1, j)){
      left = grid[i - 1][j];
    }
    if(top != null && !top.visited()){
      neighbors.add(top);
    }
    if(right != null && !right.visited()){
      neighbors.add(right);
    }
    if(bottom != null && !bottom.visited()){
      neighbors.add(bottom);
    }
    if(left != null && !left.visited()){
      neighbors.add(left);
    }
    
    if(neighbors.size() > 0){
      int r = (int)(Math.random() * neighbors.size());
      went++;
      return neighbors.get(r);
    }
    else{
      return null;
    }
  }
  boolean inRange(int i, int j){
    if(i < 0 || j < 0 || i > cols - 1 || j > rows - 1){
      return false;
    }
    return true;
  }
}
  void removeWalls(cell a, cell b){
    int x = a.getI() - b.getI();
    if(x == 1){
      grid[a.getI()][a.getJ()].setWalls(3, false);
      grid[b.getI()][b.getJ()].setWalls(1, false);
    }
    else if(x == -1){
      grid[a.getI()][a.getJ()].setWalls(1, false);
      grid[b.getI()][b.getJ()].setWalls(3, false);
    }
    int y = a.getJ() - b.getJ();
    if(y == 1){
      grid[a.getI()][a.getJ()].setWalls(0, false);
      grid[b.getI()][b.getJ()].setWalls(2, false);
    }
    else if(y == -1){
      grid[a.getI()][a.getJ()].setWalls(2, false);
      grid[b.getI()][b.getJ()].setWalls(0, false);
    }
  }
