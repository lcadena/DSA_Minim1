package examen;

import java.util.ArrayList;
import java.util.Comparator;

public class Instituto {
    String nombreInstituto;
    String nombreAlumno;
    ArrayList<Operacion> operaciones;

    public Instituto(String nombreInstituto, String nombreAlumno,ArrayList<Operacion> operaciones){
        operaciones = new ArrayList<Operacion>();
        this.nombreInstituto = nombreInstituto;
        this.nombreAlumno = nombreAlumno;
    }

    public void añadirOperacionInstituto(Operacion o){
        operaciones.add(o);
    }

    public Instituto(String nombreInstituto, String nombreAlumno){
        operaciones = new ArrayList<Operacion>();
        this.nombreInstituto = nombreInstituto;
        this.nombreAlumno = nombreAlumno;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }

    public static Comparator<Instituto> comparadorInstitutoOperaciones = new Comparator<Instituto>() {
        public int compare(Instituto o1, Instituto o2) {
            Integer i1 = new Integer(o1.getOperaciones());
            Integer i2 = new Integer(o2.getOperaciones());
            return i1.compareTo(i2);
        }
    };
}
