import java.util.Date;

public class Consulta {
    private Date fecha;
    private String motivo;
    private Mascota mascota;
    private Receta receta;

    public Consulta(Date fecha, String motivo) {
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public void agregarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void registrarConsulta() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
}