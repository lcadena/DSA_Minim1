package examen;

import java.util.*;

import com.sun.java.util.jar.pack.Instruction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MathManagerImpl implements MathManager {
    HashMap<String,Instituto> institutos;
    HashMap<String, Alumno> alumnos;
    Queue<Operacion> cola;
    ArrayList<Operacion> todaslasoperaciones = new ArrayList<Operacion>();

    private static final Logger logger = LogManager.getLogger(MathManagerImpl.class.getName());
    private static MathManagerImpl mathManagerImpl = null;

    public static MathManagerImpl getInstance(){
        if(mathManagerImpl == null)
            mathManagerImpl = new MathManagerImpl();
        return mathManagerImpl;
    }

    private MathManagerImpl(){
        logger.info("Cramos alumnos, institutos y añadimos operacion a la cola");
        this.institutos = new HashMap<String, Instituto>();
        this.alumnos = new HashMap<String, Alumno>();
        cola = new LinkedList<Operacion>();
        Operacion o1 = new Operacion("Suma", 3, 4);
        Operacion o2 = new Operacion("Resta", 4, 7);
        Alumno a1 = new Alumno("Pepe",o1);
        Alumno a2 = new Alumno("Luis",o2);
        alumnos.put("Pepe", a1);
        alumnos.put("Luis", a2);
        Instituto i1 = new Instituto("Mundet", a1.getNombreAlumno());
        Instituto i2 = new Instituto("Gironella", a2.getNombreAlumno());
        institutos.put("Mundet", i1);
        institutos.put("Gironella",i2);
    }
    public void reiniciarSingleton(){
        logger.info("Reiniciando Silgleton");
        mathManagerImpl = null;
    }
    //Lista institutos ordenado por operacines de alumnos
    public ArrayList<Instituto> listarinstitutospornumoperaciones(){
        logger.info("Inicio listar institutos por operaciones");
        ArrayList<Instituto> listarInstitutos = new ArrayList<Instituto>(this.institutos.values());
        Collections.sort(listarInstitutos,Instituto.comparadorInstitutoOperaciones);
        logger.info("Devolvemos arralist ordenado por operaciones");
        for (Instituto o : listarInstitutos){
            logger.info(o.getNombreInstituto());
        }
        return listarInstitutos;
    }
    public void realizarOperación(Operacion g){
        if (cola.size() == 0){
            logger.info("la cola esta vacia");
        }
        else
        {
            Operacion t = new Operacion("Suma",2,2+3);
            Operacion t2 = new Operacion("Resta",2,23-87);
            cola.add(t);
            cola.add(t2);

            cola.poll();

            todaslasoperaciones.add(t);
            todaslasoperaciones.add(t2);

        }
        /*int op = 0;
        switch (op){
            case 0:
                int sum1 = 9;
                int sum2 = 2;
                int resultado = sum1 + sum2;
                Operacion t = new Operacion("Suma",2,resultado);
                cola.add(t);
            break;
            case 2:
                int res1 = 6;
                int res2 = 1;
                int resultado2 = res1 + res2;
                Operacion t2 = new Operacion("Suma",2,resultado2);
                cola.add(t2);
                break;
        }*/

    }

    public ArrayList<Operacion> listarOperacionesIntitutos(Instituto t){
        ArrayList<Operacion> misOperacionesInstituto = t.getOperaciones();
        int i = 0;
        int x = 0;
        Instituto p;
        String nombre = t.getNombreInstituto();
        while (i < cola.size()) {
            while (x == 0) {
                if (nombre.equals(todaslasoperaciones.get(x).getCantidadOperaciones())) ;

                {
                    misOperacionesInstituto.add(todaslasoperaciones.get(x));
                    x++;
                }
                i++;
            }
        }
        return  misOperacionesInstituto;
    }

    public ArrayList<Operacion> listarOperacionesAlumnos(Alumno q){
        ArrayList<Operacion> misOperacionesAlumno = q.getOperaciones();
        int j = 0;
        int k = 0;
        Instituto p;
        String nombre = q.getNombreAlumno();
        while (j < cola.size()) {
            while (k == 0) {
                if (nombre.equals(todaslasoperaciones.get(k).getCantidadOperaciones()));

                {
                    misOperacionesAlumno.add(todaslasoperaciones.get(k));
                    k++;
                }
                j++;
            }
        }
        return  misOperacionesAlumno;
    }
}
