package in.blogspot.randomcompiler.facade.pattern.demo;

import in.blogspot.randomcompiler.facade.pattern.impl.ShapeMaker;

public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
