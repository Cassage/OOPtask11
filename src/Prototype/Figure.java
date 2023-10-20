package Prototype;

public abstract class Figure {

    public abstract  Figure clone();

    int height;
    int width;

    int position;

    public void setPosition(int position) {
        this.position = position;
    }

    public Figure(int height, int width){
        this.height = height;
        this.width = width;
    }

}
