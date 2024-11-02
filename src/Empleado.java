public class Empleado {
    protected String nombre;
    protected double Sueldo;
    protected long IdEmpleado;
    private static long idactual;
    protected int Antigüedad;

    public Empleado(String nombre, float Sueldo) {
        this.nombre = nombre;
        this.Sueldo = Sueldo;
        this.IdEmpleado = idactual++;
    }

    public Empleado() {
        nombre = "";
        Sueldo = 0;
        IdEmpleado = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public long getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(long IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Sueldo: " + Sueldo + ", IdEmpleado: " + IdEmpleado;
    }

    public int calcularDiasDeVacaciones(){
      int numeroDias=0;
      if(Antigüedad < 2)
          numeroDias = 12;
      else if(Antigüedad < 10)
          numeroDias = 14;
      else if(Antigüedad < 15)
          numeroDias = 18;
      else numeroDias = 25;

      return numeroDias;
    }

}
