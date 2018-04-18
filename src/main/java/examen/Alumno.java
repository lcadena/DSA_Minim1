package examen;

import java.util.ArrayList;

public class Alumno {
    String nombreAlumno;
    Operacion o;
    ArrayList<Operacion> operaciones;

    public Alumno(String nombreAlumno, ArrayList<Operacion> operaciones){
        this.nombreAlumno = nombreAlumno;
        this.operaciones = operaciones;
    }
    public String getNombreAlumno() {
        return nombreAlumno;
    }
    public Alumno(String nombreAlumno, Operacion o){
        this.nombreAlumno = nombreAlumno;
        this.operaciones = operaciones;
    }

    public void añadirOperacionAlumno(Operacion o){
        operaciones.add(o);
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }
}
