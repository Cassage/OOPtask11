import Prototype.Circle;
import Prototype.Figure;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(124, 124);

        Figure clone = circle.clone();


    }
}
