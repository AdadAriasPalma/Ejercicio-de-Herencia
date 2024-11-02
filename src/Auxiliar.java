public class Auxiliar extends Empleado {
    private String area;
    private float bonoXAsistencias;
    private int asistencias;


    public Auxiliar(String nombre, double Sueldo, String area,int asistencias) {
        this.nombre = nombre;
        this.Sueldo = Sueldo;
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getBonoXAsistencias() {
        return bonoXAsistencias;
    }

    public void setBonoXAsistencias(float bonoXAsistencias) {
        this.bonoXAsistencias = bonoXAsistencias;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public float calcularBonoXAsistencias() {
        bonoXAsistencias = 1000;
        switch (asistencias) {
            case 20:
                bonoXAsistencias += 500;
                break;
            case 30:
                bonoXAsistencias += 1000;
                break;
            case 40:
                bonoXAsistencias += 1500;
                break;
        }
        return bonoXAsistencias;
    }

    public String toString() {
        return super.toString() + "Area: "+ area +"asistencias:" +asistencias;
    }
}
