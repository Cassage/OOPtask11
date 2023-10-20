package Prototype;

public class Circle extends Figure{
    public Circle(int height, int width) {
        super(height, width);
    }

    @Override
    public Figure clone() {
        Circle circle = new Circle(this.height, this.width);
        circle.setPosition(123);
        return circle;
    }
}
