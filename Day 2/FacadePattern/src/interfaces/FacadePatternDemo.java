package interfaces;

public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCirle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
