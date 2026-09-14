class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double area() {
        double p = ladoA + ladoB + ladoC;
        double s = p / 2; // semiperímetro
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo de lados " + ladoA + ", " + ladoB + ", " + ladoC);
    }
}
