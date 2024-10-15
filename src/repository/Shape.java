package repository;

public abstract class Shape {
    protected Color color;

    protected Shape(Color color) { // Constructor del color de la forma
        this.color = color;
    }
    public abstract void draw();
}