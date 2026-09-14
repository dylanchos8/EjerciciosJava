import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registro de un nuevo portátil (Aprendiz Técnico) ===");
        System.out.print("Nombre del aprendiz: ");
        String nombre = sc.nextLine();
        System.out.print("Marca del portátil: ");
        String marca = sc.nextLine();
        System.out.print("Número de serie: ");
        String serie = sc.nextLine();
        System.out.print("Número de ficha: ");
        String ficha = sc.nextLine();
        int duracion = sc.nextInt();

        PortatilTecnico portatilCapturado = new PortatilTecnico(nombre, marca, serie, ficha, duracion);

        PortatilTecnologo portatilTecnologo = new PortatilTecnologo("María Gómez", "Dell", "SN-002", "2589700", 3);
        TabletTecnico tabletTecnico = new TabletTecnico("Carlos Ruiz", "Samsung", "SN-003", "2589720", 2);
        TabletTecnologo tabletTecnologo = new TabletTecnologo("Laura Torres", "Lenovo", "SN-004", "2589750", 1);

        Dispositivo[] dispositivos = {
                portatilCapturado,
                portatilTecnologo,
                tabletTecnico,
                tabletTecnologo
        };

        for (Dispositivo d : dispositivos) {
            d.registrarEntrada();
            d.mostrarInformacion();
        }

        System.out.println("----------------------------------------");
        dispositivos[0].registrarSalida();

        sc.close();
    }
}

