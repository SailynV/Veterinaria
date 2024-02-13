public class Mascota{
    private int id;
    private String nombre;
    private TipoMascota tipo;

    public Mascota(int id, String nombre, TipoMascota tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMascota getTipo() {
        return tipo;
    }

    public void setTipo(TipoMascota tipo) {
        this.tipo = tipo;
    }
}

enum TipoMascota {
    PERRO,
    GATO,
    OTRO
}