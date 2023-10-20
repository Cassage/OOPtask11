package Prototype;

public class Square extends Figure{

    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public Figure clone() {
       Square square = new Square(this.height, this.width);
       square.setPosition(123);
       return square;
    }
}
