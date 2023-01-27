public class TelefonoFijo extends Telefono {
    private String tipoContrato;
    private String operador;
    private int capacidadLlamadas;
    private int llamadasRealizadas;

    public TelefonoFijo(String marca, String modelo, String numeroTelefono, String tipoContrato, String operador, int capacidadLlamadas) {
        super(marca, modelo, numeroTelefono);
        this.tipoContrato = tipoContrato;
        this.operador = operador;
        this.capacidadLlamadas = capacidadLlamadas;
        this.llamadasRealizadas = 0;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public String getOperador() {
        return operador;
    }

    public int getCapacidadLlamadas() {
        return capacidadLlamadas;
    }

    public int getLlamadasRealizadas() {
        return llamadasRealizadas;
    }

    public void realizarLlamada(String numero) {
        if (llamadasRealizadas < capacidadLlamadas) {
            llamadasRealizadas++;
            super.realizarLlamada(numero);
        } else {
            System.out.println("No se puede realizar la llamada. Ha alcanzado el límite de llamadas permitidas para su plan.");
        }
    }

    public void mostrarInformacionLlamadas() {
        System.out.println("Información de llamadas para el teléfono fijo " + getMarca() + " " + getModelo() + " con número " + getNumeroTelefono());
        System.out.println("Tipo de contrato: " + tipoContrato);
        System.out.println("Operador: " + operador);
        System.out.println("Llamadas realizadas: " + llamadasRealizadas + " de " + capacidadLlamadas);
        }
        
}
        
        