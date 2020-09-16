void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  
  noStroke();
  fill(210);

  //Head
  //  Base
  rect(200, 200, 100, 100);

  //  Ears
  rect(195, 150, 10, 30);
  rect(205, 150, 10, 50);
  rect(215, 150, 10, 70);
  rect(225, 150, 10, 100);
  rect(235, 150, 10, 110);
  rect(245, 150, 10, 120);

  fill(0);
  rect(205, 140, 10, 10);
  rect(215, 137, 10, 15);
  rect(225, 135, 10, 20);
  rect(235, 130, 10, 30);


  //  Snoot
  fill(210);
  rect(160, 225, 110, 50);
  
  stroke(0);
  noFill();
  ellipse(125, 230, 35, 35);

  fill(210);
  noStroke();
  rect(160, 220, 110, 25);

  fill(0);
  rect(105, 205, 10, 10);
  rect(107, 220, 1, 30);

  //  Eyes
  fill(0);
  rect(200, 180, 25, 25);
  fill(255);
  rect(205, 175, 7, 7);
  rect(195, 185, 4, 4);
  
  
 
	

}