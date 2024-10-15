package repository.imp;

import repository.Color;
import repository.Shape;

public class square extends Shape {
    public square(Color color) { // Contructor para un color especifico para el cuadrado
        super(color);
    }

    @Override
    public void draw() { // Imprime un mensaje en la terminal e imprime el color del cuadrado
        System.out.println("Dibujando un cuadrado. ");
        color.applyColor();
    }
}
