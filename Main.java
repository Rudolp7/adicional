public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Smartphone
        Smartphone smartphoneSamsung = new Smartphone("Samsung", "AT&T", "Prepago", "555-1234567", false, false);
        smartphoneSamsung.realizarLlamada("555-9876543");
        smartphoneSamsung.recibirLlamada("555-0987654", "Hola buen día");
        smartphoneSamsung.enviarMensaje("555-9988776", "prueba de mensaje");
        smartphoneSamsung.mostrarInformacionLlamadasMensajes();

        // Crear un objeto de la clase TelefonoFijo
        TelefonoFijo telefonoCasaSiemens = new TelefonoFijo("Siemens", "Telmex", "Plan de renta", "555-9876543", null, 0);
        telefonoCasaSiemens.realizarLlamada("555-0987654");
        telefonoCasaSiemens.realizarLlamada("555-1234567");
        telefonoCasaSiemens.mostrarInformacionLlamadas();
    }
}
