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

  // Base
  rect(200, 200, 100, 100);

  // Ears
  triangle(200, 150, 250, 150, 250, 100);

  fill(0);
  stroke(0);
  triangle(212.5, 150, 245, 150, 245, 115);


  // Snoot
  noStroke();
  fill(210);
  arc(210, 225, 250, 70,  HALF_PI + QUARTER_PI, PI + QUARTER_PI);
  rect(160, 225, 70, 50);
  
  stroke(0);
  noFill();
  arc(140, 220, 100, 40, HALF_PI, PI + QUARTER_PI);

  fill(210);
  noStroke();
  rect(160, 220, 110, 25);

  fill(0);
  arc(105, 205, 25, 25, 1.1 * (HALF_PI + QUARTER_PI),  1.1 * (1.75 * PI));

  // Eyes
  fill(0);
  rect(200, 180, 25, 25);
  fill(255);
  rect(205, 175, 7, 7);
  rect(195, 185, 4, 4);
  
  
 
	

}