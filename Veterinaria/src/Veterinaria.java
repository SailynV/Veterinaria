import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private Set<Cliente> clientes;

    public Veterinaria() {
        this.clientes = new HashSet<>();
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void agregarMascota(Mascota mascota) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

