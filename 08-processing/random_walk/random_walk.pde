int cellSize = 10;
color occupied = color(0, 200, 0);
color empty = color(255);
int[][] world; 
int[][] heatMap;
int xLocation;
int yLocation; 
void setup() {
  size (640, 360);
  world = new int[width/cellSize][height/cellSize];
  heatMap = new int[width/cellSize][height/cellSize];
  xLocation = (width/cellSize)/2;
  yLocation = (height/cellSize)/2;
  stroke(48);
  noSmooth();
  //noStroke();
  // Initialization of cells
  for (int x=0; x<width/cellSize; x++) {
    for (int y=0; y<height/cellSize; y++) {
      int state;
      if (x == xLocation && y == yLocation) { 
        state = 1;
      }
      else {
        state = 0;
      }
      world[x][y] = int(state);
    }
  }
  background(0);
}
void draw() {
  //Draw grid
  for (int x=0; x<width/cellSize; x++) {
    for (int y=0; y<height/cellSize; y++) {
      if (world[x][y]==1) {
        if(heatMap[x][y] <= 225){
          heatMap[x][y] += 30;
        }  
        fill(occupied); 
      }
      else {
        empty = color(255, 255 - heatMap[x][y], 255 - heatMap[x][y]);
        fill(empty); 
      }
      rect (x*cellSize, y*cellSize, cellSize, cellSize);
    }
  }
  iteration();
  delay(100);
}
void iteration() {
  world[xLocation][yLocation] = 0;
  int move = int(random(4));
  if (move == 0) {
    xLocation += 1;
  } else if (move == 1) {
    xLocation -= 1;
  } else if (move == 2) {
    yLocation += 1;
  } else {
    yLocation -=1 ;    
  }
  if(xLocation < 0) 
     xLocation = width/10 - 1;
  if(xLocation > width/10 - 1)
     xLocation = 0;
  if(yLocation < 0)
    yLocation = height/10 - 1;
  if(yLocation > height/10 - 1) 
    yLocation = 0;
  world[xLocation][yLocation] = 1;
}
