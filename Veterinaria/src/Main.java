import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la veterinaria
        Veterinaria veterinaria = new Veterinaria();
        veterinaria.setNombre("Veterinaria Patitas Sanas");
        veterinaria.setDireccion("123 Calle de las Mascotas");
        veterinaria.setTelefono("555-1234");

        // Crear un cliente
        Cliente cliente = new Cliente(1, "Juan Pérez", "456 Avenida Los Animales", "555-5678");

        // Crear una mascota y asociarla con el cliente
        Mascota mascota = new Mascota(1, "Firulais", TipoMascota.PERRO);
        cliente.agregarMascota(mascota);

        // Agregar el cliente a la veterinaria
        veterinaria.agregarCliente(cliente);

        // Crear un veterinario
        Veterinario veterinario = new Veterinario(1, "Dra. Ana Gómez", "Especialista en caninos");

        // Crear una consulta
        Consulta consulta = new Consulta(new Date(), "Control anual y vacunación");
        consulta.agregarMascota(mascota);

        // Crear una receta
        Receta receta = new Receta();
        Medicamento medicamento = new Medicamento("Vacuna Antirrábica", "1 dosis");
        receta.agregarMedicamento(medicamento);

        // Asociar la receta con la consulta
        consulta.setReceta(receta);

        // Simular una atención de la mascota por parte del veterinario
        veterinario.atenderMascota(mascota);

        // Mostrar información del cliente, su mascota y la consulta
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Mascota: " + mascota.getNombre() + " - " + mascota.getTipo());
        System.out.println("Consulta: " + consulta.getFecha() + " - " + consulta.getMotivo());
        System.out.println("Receta: ");
        for (Medicamento m : receta.getMedicamentos()) {
            System.out.println("Medicamento: " + m.getNombre() + " - Dosis: " + m.getDosis());
        }
    }
}