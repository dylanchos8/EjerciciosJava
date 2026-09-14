public class Bateria implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Se esta tocando -Welocome to the jungle de Guns N'Roses- con la bateria");
    }

    @Override
    public void afinar(){
        System.out.println("Se afinan los platos de la bateria");
    }
}
