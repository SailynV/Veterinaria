import java.util.ArrayList;
import java.util.List;

public class Receta {
    private List<Medicamento> medicamentos;

    public Receta() {
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}