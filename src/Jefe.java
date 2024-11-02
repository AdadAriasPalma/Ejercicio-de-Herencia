public class Jefe extends Empleado {

    private float bono;

    public Jefe(String nombre,double Sueldo, float bono) {
        super(nombre, (float) Sueldo);
        this.bono = bono;
    }
@Override
    public int calcularDiasDeVacaciones(){
        return 31;
    }

    public String toString() {
        return super.toString() + "Bono del patron: " + bono;
    }


}

