import java.util.Scanner;

public class HerenciaEmpleado {
    public static void main(String[] args) {
        ControlarEmpleados ce = new ControlarEmpleados();
        Scanner sc = new Scanner(System.in);

        int op;
        do {
            System.out.println("1. Registrar empleado");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Ordenar empleados por nombre");
            System.out.println("4. Ordenar empleados por sueldo");
            System.
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine(); // Consumir el salto de línea después de `nextInt`
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el sueldo del empleado: ");
                    double sueldo = sc.nextDouble();
                    // Agregar un empleado con los datos ingresados
                    ce.agregarEmpleado(new Empleado(nombre, (float) sueldo));
                    System.out.println("Empleado registrado exitosamente.");
                    break;

                case 2:
                    System.out.println("Lista de todos los empleados:");
                    System.out.println(ce.mostrarEmpleados());
                    break;

                case 3:
                    ce.ordenarPorNombre();
                    System.out.println("Empleados ordenados por nombre:");
                    System.out.println(ce.mostrarEmpleados());
                    break;

                case 4:
                    ce.ordenarPorSueldo();
                    System.out.println("Empleados ordenados por sueldo:");
                    System.out.println(ce.mostrarEmpleados());
                    break;

                case 5:
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (op != 5);

        sc.close();
    }
}
