public class Piano implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Se esta tocando -te esperare de Julio Jaramillo- con el piano");
    }

    @Override
    public void afinar() {
        System.out.println("se estan afinando las cuerdas del piano");
    }

}
