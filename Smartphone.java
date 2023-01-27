class Smartphone extends Telefono {
    private String marca;
    private boolean tieneSMS;
    private boolean tieneMMS;

    public Smartphone(String numeroTelefono, String operador, String tipoContrato, String marca, boolean tieneSMS, boolean tieneMMS) {
        super(numeroTelefono, operador, tipoContrato);
        this.marca = marca;
        this.tieneSMS = tieneSMS;
        this.tieneMMS = tieneMMS;
    }

    public void realizarLlamada(String numeroDestino) {
        // código para realizar una llamada
    }

    public void enviarSMS(String numeroDestino, String mensaje) {
        // código para enviar un SMS
    }

    public void enviarMMS(String numeroDestino, String mensaje, String[] archivos) {
        // código para enviar un MMS
    }

    public String getMarca() {
        return marca;
    }

    public boolean tieneSMS() {
        return tieneSMS;
    }

    public boolean tieneMMS() {
        return tieneMMS;
    }
}
