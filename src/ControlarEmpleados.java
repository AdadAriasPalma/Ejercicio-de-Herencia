import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControlarEmpleados {
    private List<Empleado> misEmpleados;

    public ControlarEmpleados() {
        misEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado em) {
        misEmpleados.add(em);
    }

    public String mostrarEmpleados() {
        StringBuilder cadena = new StringBuilder();
        for (Empleado e : misEmpleados) {
            if (e instanceof Jefe) {
                cadena.append("Jefe: ").append(e.toString()).append("\n");
            } else if (e instanceof Auxiliar) {
                cadena.append("Auxiliar: ").append(e.toString()).append("\n");
            } else {
                cadena.append("Empleado: ").append(e.toString()).append("\n");
            }
        }
        return cadena.toString();
    }

    public void ordenarPorNombre() {
        misEmpleados.sort(Comparator.comparing(Empleado::getNombre));
    }

    public void ordenarPorSueldo() {
        misEmpleados.sort(Comparator.comparingDouble(Empleado::getSueldo));
    }
}
