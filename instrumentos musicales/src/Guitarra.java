public class Guitarra implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Se esta tocando -Todo de cabeza de Kaleth Morales- con la guitarra");
    }

    @Override
    public void afinar(){
        System.out.println("se esta afinando las cuerdas de la Guitarra");
    }
}
