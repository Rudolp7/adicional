public class Telefono {
    private String marca;
    private String modelo;
    private String numeroTelefono;
   

    public Telefono(String marca, String modelo, String numeroTelefono) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroTelefono = numeroTelefono;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void realizarLlamada(String numero) {
        System.out.println("Llamando al número " + numero + " desde el teléfono " + marca + " " + modelo + " con número " + numeroTelefono);
    }
    
}
