package com.lu;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		AbstractFactory factory1 = FactoryProducer.getAbstractFactory("shape");
		AbstractFactory factory2 = FactoryProducer.getAbstractFactory("color");

		factory1.getShape("square").draw();
		factory1.getShape("rectangle").draw();
		factory1.getShape("circle").draw();
		factory2.getColor("red").fill();
		factory2.getColor("blue").fill();
		factory2.getColor("green").fill();
	}

}
