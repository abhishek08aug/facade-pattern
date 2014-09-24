package in.blogspot.randomcompiler.facade.pattern.impl;

import in.blogspot.randomcompiler.facade.pattern.api.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

}
