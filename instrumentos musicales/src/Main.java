public class Main {
    public static void main(String[] args) {

        InstrumentoMusical[] instrumentos = {
                new Guitarra(),
                new Piano(),
                new Bateria()
        };

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
            instrumento.afinar();
            System.out.println("----------");
        }
    }
}
