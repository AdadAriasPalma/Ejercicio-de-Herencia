import java.util.Scanner;

public class HerenciaEmpleado {

    private static ControlarEmpleados ce = new ControlarEmpleados();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            mostrarMenu();
            op = obtenerOpcion(); // Método que valida la entrada del usuario

            switch (op) {
                case 1 -> registrarEmpleado();
                case 2 -> registrarAuxiliar();
                case 3 -> registrarJefe();
                case 4 -> mostrarEmpleados();
                case 5 -> ordenarYMostrarEmpleadosPorNombre();
                case 6 -> ordenarYMostrarEmpleadosPorSueldo();
                case 7 -> System.out.println("Saliendo del sistema.");
                default -> System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (op != 7);
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("1. Registrar empleado");
        System.out.println("2. Registrar auxiliar");
        System.out.println("3. Registrar jefe");
        System.out.println("4. Mostrar todos los empleados");
        System.out.println("5. Ordenar empleados por nombre");
        System.out.println("6. Ordenar empleados por sueldo");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcion() {
        int opcion = -1;
        while (opcion == -1) { // Repetir hasta obtener una opción válida
            String entrada = sc.nextLine(); // Leer entrada como String
            try {
                opcion = Integer.parseInt(entrada); // Intentar convertir a int
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                System.out.print("Seleccione una opción: ");
            }
        }
        return opcion;
    }

    private static void registrarEmpleado() {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el sueldo del empleado: ");
        double sueldo = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea
        ce.agregarEmpleado(new Empleado(nombre, (float) sueldo));
        System.out.println("Empleado registrado exitosamente.");
    }

    private static void registrarAuxiliar() {
        System.out.print("Ingrese el nombre del auxiliar: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el sueldo del auxiliar: ");
        double sueldo = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el área del auxiliar: ");
        String area = sc.nextLine();
        System.out.print("Ingrese las asistencias del auxiliar: ");
        int asistencias = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        ce.agregarEmpleado(new Auxiliar(nombre, sueldo, area, asistencias));
        System.out.println("Auxiliar registrado exitosamente.");
    }

    private static void registrarJefe() {
        System.out.print("Ingrese el nombre del jefe: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el sueldo del jefe: ");
        double sueldo = sc.nextDouble();
        System.out.print("Ingrese el bono del jefe: ");
        float bono = sc.nextFloat();
        sc.nextLine(); // Consumir el salto de línea
        ce.agregarEmpleado(new Jefe(nombre, sueldo, bono));
        System.out.println("Jefe registrado exitosamente.");
    }

    private static void mostrarEmpleados() {
        System.out.println("Lista de todos los empleados:");
        System.out.println(ce.mostrarEmpleados());
    }

    private static void ordenarYMostrarEmpleadosPorNombre() {
        ce.ordenarPorNombre();
        System.out.println("Empleados ordenados por nombre:");
        System.out.println(ce.mostrarEmpleados());
    }

    private static void ordenarYMostrarEmpleadosPorSueldo() {
        ce.ordenarPorSueldo();
        System.out.println("Empleados ordenados por sueldo:");
        System.out.println(ce.mostrarEmpleados());
    }
}
