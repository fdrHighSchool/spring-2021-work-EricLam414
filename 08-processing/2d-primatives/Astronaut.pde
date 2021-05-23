void setup(){
  size(600, 800);
  noStroke();
}

void draw(){
  background(184,216,211,255);
  strokeWeight(1);
  fillWhite();
  rect(240, 165, 120, 60);//helmet
  arc(300, 165, 119, 110, radians(180), radians(360));//suit
  fills(58,78,105,255);
  circle(300, 170, 100);//head
  fills(124,148,159,255);
  quarterCircleDotted(300, 170, 50, 0); //dotted head
  quarterCircleDotted(300, 170, 50, 90); //dotted head
  star(280, 170, 18);//head star
  strokeWeight(1);
  fillBrown();
  rect(240, 225, 120, 120);//body
  fillCyan();
  rectDotted(240, 225, 300, 345);//left body dotted
  fills(0, 51, 90);
  circle(330, 260, 25);// button
  fillCyan();
  triangle(330, 253, 336, 265, 324, 265);//button triangle
  fills(184,216,211,255);
  rect(318, 280, 23, 4);//upper rect
  circle(260, 245, 17);//upper circle
  fillCyan();
  rect(318, 290, 23, 4);//lower rect
  circle(260, 265, 17);//middle circle
  fillWhite();
  circle(260, 285, 17);//lower circle
  strokeWeight(10);
  stroke(184,216,211,255);
  line(280, 330, 360, 330);//line
  line(260, 287, 260, 310);//line
  noFill();
  arc(273, 318, 25, 25, radians(90), radians(180));//line
  strokeWeight(1);
  fillCyan();
  rect(240, 345, 120, 90);//lower body
  fills(196,221,212,255);
  triangleDotted(240, 345, 400, 430);
  fillBrown();
  triangle(240, 435, 360, 435, 300, 520);
  fillWhite();
  triangle(240, 435, 300, 520, 120, 525);
  triangle(360, 435, 300, 520, 480, 525);
  //fill(246,230,213,255);
  //triangleDotted();
  triangle(120, 575, 290, 575, 120, 525);
  triangle(480, 575, 310, 575, 480, 525);
  fillRed();
  arc(120, 550, 50, 50, radians(90), radians(270));
  arc(480, 550, 50, 50, radians(270), radians(450));
  fills(238,240,203,255);
  arc(120, 550, 50, 50, radians(270), radians(450));
  arc(480, 550, 50, 50, radians(90), radians(270)); 
  fills(213,231,202,255);
  quarterCircleDotted(120, 550, 25, 0);
  quarterCircleDotted(120, 550, 25, 90);
  quarterCircleDotted(476, 550, 25, 180);
  quarterCircleDotted(476, 550, 25, 270); 
  fills(247,242,192,255);
  rect(308, 575, 35, 40);
  rect(257, 575, 35, 40);
  fillBrown();
  arc(293, 615, 71, 80, radians(90), radians(270));
  arc(308, 615, 70, 80, radians(270), radians(450));
  fills(0, 0, 0);
  quarterCircleDotted(287, 615, 35, 270); 
  quarterCircleDotted(308, 615, 35, 0); 
  fills(247,242,192,255);
  rect(308, 575, 12, 80);
  rect(280, 575, 12, 80);
  fills(128,142,135,255);
  for(int i = 1; i <= 12; i++){
    rect(308, 578 + i*6, 12, 2);
    rect(280, 578 + i*6, 12, 2);
  }
  strokeWeight(3);
  fillWhite();
  //rect(240, 225, 120, 120);//body
  line(232, 165, 232, 345);
  line(367, 165, 367, 345);
  line(367, 345, 393, 345);
  line(367, 330, 393, 330);
  line(367, 192, 393, 192);
  line(393, 192, 393, 345);
  line(383, 192, 383, 165);
  //arc(300, 165, 119, 110, radians(180), radians(360));//suit
  noFill();
  arc(300, 165, 135, 125, radians(180), radians(360));
  circle(383, 158, 10);
  circle(380, 310, 13);
  circle(380, 290, 13);
  strokeWeight(1);
  fillCyan();
  triangle(229, 225, 229, 345, 140, 225);
  fillRed();
  triangle(229, 225, 140, 225, 140, 126);
  triangle(367, 225, 456, 225, 456, 345);
  fillWhite();
  triangle(140, 126, 140, 76, 360, 76);
  fillCyan();
  arc(140, 100, 50, 50, radians(90), radians(270));
  fills(184,216,211,255);
  arc(140, 100, 50, 50, radians(270), radians(450));
  fillWhite();
  triangle(456, 345, 456, 395, 200, 395);
  fills(184,216,211,255);
  arc(456, 370, 50, 50, radians(90), radians(270));
  fillCyan();
  arc(456, 370, 50, 50, radians(270), radians(450));
  fillBrown();
  triangle(360, 76, 360, 126, 410, 126);
  triangle(200, 395, 200, 345, 150, 345);
  fills(233,241,236,255);
  triangle(360, 76, 410, 76, 410, 126);
  triangle(200, 395, 150, 395, 150, 345);
} 
void fillCyan(){
  fills(224,240,227,255);
}
void fillBrown(){
  fills(224,178,100,255);
}
void fillWhite(){
  fills(251,252,242,255);
}
void fillRed(){
  fills(228,109,69,255);
}
void fills(int r, int b, int g){
  stroke(r, b, g);
  fill(r, b, g);
}
void fills(int r, int b, int g, int a){
  stroke(r, b, g, a);
  fill(r, b, g, a);
}

void star(int x, int y, int l){
  fillWhite();
  strokeWeight(2);
  line(x, y - 4*l/5, x, y + 4*l/5);
  line(x - l/2, y, x + l/2, y);
  line(x - l/3, y - l/3, x + l/3, y + l/3);
  line(x - l/3, y + l/3, x + l/3, y - l/3);
}
void rectDotted(int x, int y, int x2, int y2){
  for(int r = x + 2; r < x2 - 2; r += 5){
    int odd = 0; 
    for(int c = y + 2; c < y2 - 2; c += 5){
       if(odd % 2 == 1){
         square(r + 2, c, 1);
       }
       else{
         square(r, c, 1);
       }
       odd++;
    }
  }
}
void triangleDotted(int x, int y, int x2, int y2){
  double slope = (x - x2) / (y - y2);
  slope *= 1.4;
  slope = 1 / slope;
  for(int r = x; r < x2; r += 5){
    int odd = 0; 
    for(int c = y2 + 4; c > y + (r - x) * slope; c -= 5){
       if(odd % 2 == 1){
         square(r + 2, c, 1);
       }
       else{
         square(r, c, 1);
       }
       odd++;
    }
  }
  
}
void quarterCircleDotted(int x, int y, int r, int d){
  if(d == 0 || d == 360){
    Dotted0(x, y, r);
  }
  else if(d == 90){
    Dotted90(x, y, r);
  }
  else if(d == 180){
    Dotted180(x, y, r);
  }
  else if(d == 270){
    Dotted270(x, y, r);
  }
  
}
void Dotted0(int x, int y, int r){
  for(int row = x; row < x + r; row += 5){
    int odd = 0;
    for(int col = y; col < (int) distance(x, y, row, r) - 2; col += 5){
      if(odd % 2 == 1){
        square(row + 2, col, 1);
      }
      else{
        square(row, col, 1);
      }
      odd++;
    }
  }
  
}
void Dotted90(int x, int y, int r){
  for(int row = x; row < x + r; row += 5){
    int odd = 0;
    for(int col = y ; col > ((int) distance2(x, y, row, r) + 2); col -= 5){
      if(odd % 2 == 1){
        square(row + 2, col, 1);
      }
      else{
        square(row, col, 1);
      }
      odd++;
    }
  }
  
}
void Dotted180(int x, int y, int r){
  for(int row = x; row > x - r; row -= 5){
    int odd = 0;
    for(int col = y ; col > ((int) distance2(x, y, row, r) + 2); col -= 5){
      if(odd % 2 == 1){
        square(row + 2, col, 1);
      }
      else{
        square(row, col, 1);
      }
      odd++;
    }
  }
}
void Dotted270(int x, int y, int r){
  for(int row = x; row > x - r; row -= 5){
    int odd = 0;
    for(int col = y; col < (int) distance(x, y, row, r) - 2; col += 5){
      if(odd % 2 == 1){
        square(row + 2, col, 1);
      }
      else{
        square(row, col, 1);
      }
      odd++;
    }
  }
}

double distance(int x1, int y1, int x2, int d){
  //(x1-x2)^2 + (y1-y2)^2 = d^2
  //sqrt(d^2 - (x1-x2)^2) = y1 - y2
  return sqrt(sq(d) - sq(x1-x2)) + y1;
}
double distance2(int x1, int y1, int x2, int d){
  //(x1-x2)^2 + (y1-y2)^2 = d^2
  //sqrt(d^2 - (x1-x2)^2) = y1 - y2
  return -sqrt(sq(d) - sq(x1-x2)) + y1;
}
