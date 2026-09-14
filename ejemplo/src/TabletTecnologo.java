public class TabletTecnologo extends Dispositivo {

    private int trimestreActual;

    public TabletTecnologo(String nombrePropietario, String marca, String numeroSerie,
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
        return "Tablet - Aprendiz Tecnólogo";
    }

    @Override
    public String obtenerDeclaracionResponsabilidad() {
        return getNombrePropietario() + " (Ficha " + getNumeroFicha()
                + ") declara ser responsable del cuidado de la tablet durante su permanencia en el programa tecnólogo";
    }

    @Override
    public int calcularNumeroMaximoIngresosDiarios() {
        return 5;
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
