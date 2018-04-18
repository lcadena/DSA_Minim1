package examen;

import java.util.ArrayList;

public interface MathManager {
    public ArrayList<Instituto> listarinstitutospornumoperaciones();
    public ArrayList<Operacion> listarOperacionesIntitutos(Instituto instituto);
    public void realizarOperación(Operacion g);
    public ArrayList<Operacion> listarOperacionesAlumnos(Alumno q);
}
