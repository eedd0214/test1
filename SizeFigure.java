abstract class Figure {
	abstract void area();
	abstract void around();

	void measure(){
		area();
		around();
		System.out.println();
	}
}

class Square extends Figure{
	double side;
	double height;

	Square(double side){
		this.side = this.height = side;
	}

	Square(double side, double height){
		this.side =side;
		this.height =height;
	}

	void area(){
		System.out.println("사각형의 면적:" + (side * height));
	}

	void around(){
		System.out.println("사각형의 둘레:"+(2*(side+height)));
	}
}

class Circle extends Figure{
	final double pi = 3.14;
	double radius;

	Circle(double r){
		radius = r;
	}
	
	void area(){
		System.out.println("원의면적 :" + (radius*radius*pi));
	}
	
	void around(){
		System.out.println("원의 둘레 :" + (2*radius*pi));
	}
}

class SizeFigure{
	public static void main(String[] args){
		Figure fig1 = new Square(2.5);
		Figure fig2 = new Square(2.5,3.7);
		Figure fig3 = new Circle(3.6);
		fig1.measure();
		fig2.measure();
		fig3.measure();
	}
}