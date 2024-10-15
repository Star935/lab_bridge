package repository.imp;

import repository.Color;
import repository.Shape;

public class circle extends Shape {
    public circle(Color color) { // Contructor para un color especifico para el circulo
        super(color);
    }

    @Override
    public void draw() { // Imprime un mensaje en la terminal e imprime el color del circulo
        System.out.println("Dibujando un circulo. ");
        color.applyColor();
    }
}
