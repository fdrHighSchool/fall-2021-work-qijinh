PImage img1;
PImage img2;
PImage img3;
PImage img4;

void setup(){
  //backround
  size(800, 800);
  background(255);
  img1 = loadImage("NYSInspections.png");
  img2 = loadImage("once-a-year.jpg");
  img3 = loadImage("car1.png");
  img4 = loadImage("car2.png");
  
  //DMV inspection gate
  stroke(150);
  strokeWeight(50);
  line(100, 360, 100, 50);
  line(420, 560, 420, 230);
  line(100, 50, 420, 230);
  
  image (img1, 300, -30);
  image (img2, 500, 300, width/3, height/4);
  
  //road
  stroke(100);
  strokeWeight(30);
  line(600, 1150, -10, 600);
  line(800, 850, -10, 300);
  
}


void draw(){
  carV1(550, 800);
  int x1Pos = 550;
  int y1Pos = 800;
  
  
    x1Pos++;
    y1Pos++;
  }
  while(x1Pos <=80);
   
  
  carV2(600, 800);
  
  int x2Pos = 550;
  int y2Pos = 800;
  
  do{
    x1Pos++;
    y1Pos++;
  }
  while(x1Pos <=80);

}


void carV1(int x1Pos, int y1Pos){
  image(img3, x1Pos, y1Pos, width/6, height/8);
  
}


void carV2(int x2Pos, int y2Pos){
  image(img4, 460, 800, width/6, height/8);



}
