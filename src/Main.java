import repository.Shape;
import repository.imp.*;

public class Main {
    public static void main(String[] args) {
        // Inicializa cada figura con un color
        Shape blueSquare = new square(new blue());
        Shape yellowCircle = new circle(new yellow());
        Shape greenTriangle = new triangle(new green());

        // Imprime en la terminal las formas y colores escogidos
        blueSquare.draw();
        yellowCircle.draw();
        greenTriangle.draw();
    }
}