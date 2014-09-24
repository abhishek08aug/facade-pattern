package in.blogspot.randomcompiler.facade.pattern.impl;

import in.blogspot.randomcompiler.facade.pattern.api.Shape;

public class ShapeMaker {
	public Shape circle;
	public Shape rectangle;
	public Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}
