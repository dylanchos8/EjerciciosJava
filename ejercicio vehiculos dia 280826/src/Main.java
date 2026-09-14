public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro();
        vehiculos[1] = new Moto();
        vehiculos[2] = new Bicicleta();
        Viaje viaje = new Viaje();


        viaje.iniciarViaje(vehiculos[0]);
        viaje.iniciarViaje(vehiculos[1]);
        viaje.iniciarViaje(vehiculos[2]);

        for (Vehiculo v : vehiculos) {
            v.arrancar();
            v.combustible();
            v.detener();
            System.out.println("-----");
        }
    }
}


