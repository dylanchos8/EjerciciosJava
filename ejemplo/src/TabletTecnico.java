public class TabletTecnico extends Dispositivo {

    private int duracionMesesPrograma;

    public TabletTecnico(String nombrePropietario, String marca, String numeroSerie,
                         String numeroFicha, int duracionMesesPrograma) {
        super(nombrePropietario, marca, numeroSerie, numeroFicha);
        this.duracionMesesPrograma = duracionMesesPrograma;
    }

    public int getDuracionMesesPrograma() {
        return duracionMesesPrograma;
    }

    public void setDuracionMesesPrograma(int duracionMesesPrograma) {
        this.duracionMesesPrograma = duracionMesesPrograma;
    }

    @Override
    public String obtenerTipoDispositivo() {
        return "Tablet - Aprendiz Técnico";
    }

    @Override
    public String obtenerDeclaracionResponsabilidad() {
        return getNombrePropietario() + " (Ficha " + getNumeroFicha()
                + ") declara ser responsable del cuidado de la tablet durante su permanencia en el programa técnico";
    }

    @Override
    public int calcularNumeroMaximoIngresosDiarios() {
        return 5;
    }

    @Override
    public boolean requiereRegistroFotografico() {
        if (duracionMesesPrograma <= 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mostrarDetalleEspecifico() {
        System.out.println("Duración del programa técnico: " + duracionMesesPrograma + " meses");
    }
}
