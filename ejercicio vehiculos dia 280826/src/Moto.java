public class Moto extends Vehiculo {
    @Override public void arrancar() {
        System.out.println("La moto ha arrancado.");
    }

    @Override public void combustible() {
        System.out.println("La moto esta usando gasolina");
    }

    @Override public void detener() {
        System.out.println("La moto se ha detenido.");
    }

}

