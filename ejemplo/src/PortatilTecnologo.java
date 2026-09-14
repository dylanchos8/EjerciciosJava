public class PortatilTecnologo extends Dispositivo {

    private int trimestreActual;

    public PortatilTecnologo(String nombrePropietario, String marca, String numeroSerie,
                             String numeroFicha, int trimestreActual) {
        super(nombrePropietario, marca, numeroSerie, numeroFicha);
        this.trimestreActual = trimestreActual;
    }

    public int getTrimestreActual() {
        return trimestreActual;
    }

    public void setTrimestreActual(int trimestreActual) {
        this.trimestreActual = trimestreActual;
    }

    @Override
    public String obtenerTipoDispositivo() {
        return "Portátil - Aprendiz Tecnólogo";
    }

    @Override
    public String obtenerDeclaracionResponsabilidad() {
        return getNombrePropietario() + " (Ficha " + getNumeroFicha()
                + ") declara ser responsable del cuidado del portátil durante su permanencia en el programa tecnólogo";
    }

    @Override
    public int calcularNumeroMaximoIngresosDiarios() {
        return 3;
    }

    @Override
    public boolean requiereRegistroFotografico() {
        if (trimestreActual == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mostrarDetalleEspecifico() {
        System.out.println("Trimestre actual del tecnólogo: " + trimestreActual);
    }
}

