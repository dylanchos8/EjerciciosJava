public abstract class Dispositivo {

    private String nombrePropietario;
    private String marca;
    private String numeroSerie;
    private String numeroFicha;
    private boolean dentroDeLaInstitucion;

    public Dispositivo(String nombrePropietario, String marca, String numeroSerie, String numeroFicha) {
        this.nombrePropietario = nombrePropietario;
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.numeroFicha = numeroFicha;
        this.dentroDeLaInstitucion = false;
    }

    // ---------- Getters y Setters (R3) ----------
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(String numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public boolean isDentroDeLaInstitucion() {
        return dentroDeLaInstitucion;
    }

    // ---------- Métodos concretos (heredados igual por todas las hijas) ----------


    public void registrarEntrada() {
        this.dentroDeLaInstitucion = true;
        System.out.println(nombrePropietario + " (Ficha " + numeroFicha + ") registró su entrada con: " + marca);
    }


    public void registrarSalida() {
        this.dentroDeLaInstitucion = false;
        System.out.println(nombrePropietario + " (Ficha " + numeroFicha + ") registró su salida con: " + marca);
    }


    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("Propietario: " + nombrePropietario);
        System.out.println("Marca: " + marca);
        System.out.println("N° Serie: " + numeroSerie);
        System.out.println("Tipo de dispositivo: " + obtenerTipoDispositivo());
        System.out.println("Declaración de responsabilidad: " + obtenerDeclaracionResponsabilidad());
        System.out.println("N° máximo de ingresos/salidas al día: " + calcularNumeroMaximoIngresosDiarios());


        if (requiereRegistroFotografico()) {
            System.out.println("Registro fotográfico: SÍ se debe tomar foto del dispositivo al ingresar");
        } else {
            System.out.println("Registro fotográfico: NO es necesario tomar foto");
        }

        mostrarDetalleEspecifico();
        System.out.println("Dentro de la institución: " + dentroDeLaInstitucion);
    }


    public abstract String obtenerTipoDispositivo();


    public abstract String obtenerDeclaracionResponsabilidad();


    public abstract int calcularNumeroMaximoIngresosDiarios();

    public abstract boolean requiereRegistroFotografico();

    public abstract void mostrarDetalleEspecifico();

}