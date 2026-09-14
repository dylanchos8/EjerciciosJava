import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura[] figuras = new Figura[3];

        try {
            System.out.print("Radio del círculo: ");
            double radio = Double.parseDouble(sc.nextLine());
            figuras[0] = new Circulo(radio);

            System.out.print("Base del rectángulo: ");
            double base = Double.parseDouble(sc.nextLine());
            System.out.print("Altura del rectángulo: ");
            double altura = Double.parseDouble(sc.nextLine());
            figuras[1] = new Rectangulo(base, altura);

            System.out.print("Lado A del triángulo: ");
            double ladoA = Double.parseDouble(sc.nextLine());
            System.out.print("Lado B del triángulo: ");
            double ladoB = Double.parseDouble(sc.nextLine());
            System.out.print("Lado C del triángulo: ");
            double ladoC = Double.parseDouble(sc.nextLine());
            figuras[2] = new Triangulo(ladoA, ladoB, ladoC);

        } catch (NumberFormatException e) {
            System.out.println("Error: debes ingresar solo números. El programa se detiene aquí.");
            sc.close();
            return;
        } finally {
            sc.close();
        }

        Figura mayor = null;

        for (Figura f : figuras) {
            f.dibujar();
            System.out.printf("Área: %.2f | Perímetro: %.2f%n", f.area(), f.perimetro());
            System.out.println("---------------------------");

            if (mayor == null || f.area() > mayor.area()) {
                mayor = f;
            }
        }

        System.out.printf("La figura con mayor área tiene un área de %.2f%n", mayor.area());
    }
}
