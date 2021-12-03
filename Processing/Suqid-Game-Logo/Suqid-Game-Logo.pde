void setup(){
 size (1441, 754);
 background(255);
}

void draw(){
  fill(0);
  rect(193, 163.5, 140, 30);
  circle(206, 217, 108);
  rect(198, 241, 98, 30);
  circle(294, 298, 112);
  rect(63, 320, 232, 34);
  
  fill(255);
  noStroke();
  circle(208, 218, 48);
  circle(296, 296, 48);
  rect(204, 194, 96, 48);
  rect(210, 272, 90, 48);
  //letter S
  
  fill(0);
  circle(471, 258, 190);
  fill(238,30,135,255);
  circle(470.5, 258.5, 125);
  fill(0);
  beginShape();//begin shape
  vertex(455, 258);//1st coordinate
  vertex(490, 258);//2nd coordinate
  vertex(574, 427);//3rd coordinate
  vertex(542, 427);//4th coordinate
  endShape(CLOSE);//close the shape
  //letter Q
  
  rect(596, 164, 33, 94);
  circle(690, 257, 186.5);
  fill(255);
  circle(690.5, 258.5, 123);
  rect(629, 163, 123, 94);
  fill(0);
  rect(752, 46, 32, 211);
  //letter U
  
  rect(828, 164, 33, 190);
  //letter I
  
  rect(905, 164, 146, 190);
  circle(1045, 259, 190);
  fill(255);
  rect(939, 196, 111, 126);
  circle(1045, 259, 126);
  //letter D
  
  fill(0);
  circle(421, 523, 191);
  rect(421, 427, 154, 192);
  fill(255);
  circle(418.5, 523.5, 125);
  rect(418.5, 461, 167, 125);
  fill(0);
  rect(408, 507, 111, 32);
  fill(255);
  beginShape();
  vertex(575, 428);
  vertex(560, 461);
  vertex(414, 461);
  vertex(414, 507);
  vertex(520, 507);
  vertex(635, 727);
  endShape(CLOSE);
  fill(0);
  beginShape();
  vertex(520, 507);
  vertex(633, 726);
  vertex(594, 726);
  vertex(498, 539);
  endShape(CLOSE);
  //letter G
  
  triangle(689, 427, 594, 618, 785, 618);
  fill(238,30,135,255);
  triangle(689, 502, 632, 618, 747, 618);
  //letter A
  
  fill(0);
  rect(813, 428, 219, 191);
  fill(255);
  triangle(844, 427, 1001, 427, 924, 585);
  triangle(846, 503, 846, 620, 905, 620);
  triangle(944, 620, 999, 620, 999, 503);
  //letter M
  
  fill(0);
  rect(1076, 427, 190, 191);
  fill(238,30,135,255);
  rect(1108, 458, 158, 129);
  fill(0);
  rect(1177, 506, 201, 33);
  //letter E

}
