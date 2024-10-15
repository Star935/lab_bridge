package repository.imp;

import repository.Color;
import repository.Shape;

public class triangle extends Shape {

    public triangle(Color color) { // Contructor para un color especifico para el triangulo
        super(color);
    }

    @Override
    public void draw() { // Imprime un mensaje en la terminal e imprime el color del triangulo
        System.out.println("Dibujando un triangulo. ");
        color.applyColor();
    }
}
