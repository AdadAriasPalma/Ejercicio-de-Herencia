import java.util.ArrayList;
import java.util.Comparator;

public class ControlarEmpleados {
    private ArrayList<Empleado> misEmpleados;

    public ControlarEmpleados() {
        misEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado em) {
        misEmpleados.add(em);
    }

    public String mostrarEmpleados() {
        StringBuilder cadena = new StringBuilder();
        misEmpleados.forEach(e -> cadena.append(e.toString()).append("\n"));
        return cadena.toString();
    }

    public void ordenarPorNombre() {
        misEmpleados.sort(Comparator.comparing(Empleado::getNombre));
    }

    public void ordenarPorSueldo() {
        misEmpleados.sort(Comparator.comparingDouble(Empleado::getSueldo));
    }
}
