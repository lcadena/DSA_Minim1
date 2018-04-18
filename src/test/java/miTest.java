import examen.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
public class miTest {
    @Before
    public void setUp(){
        MathManagerImpl.getInstance();
        Operacion o1 = new Operacion("Suma", 3, 4);
        Operacion o2 = new Operacion("Resta", 4, 7);
        MathManagerImpl.getInstance().realizarOperación(o1);
        MathManagerImpl.getInstance().realizarOperación(o2);

    }

    @After
    public void tearDown(){
        MathManagerImpl.getInstance().reiniciarSingleton();
    }

    @Test
    public void listarOperacionesIntitutos(){
        Operacion o1 = new Operacion("Suma", 3, 3);
        MathManagerImpl.getInstance().realizarOperación(o1);
        Operacion o2 = new Operacion("Multiplicación", 5, 85);
        MathManagerImpl.getInstance().realizarOperación(o2);
        ArrayList<Instituto> institutos = new ArrayList<Instituto>();
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Alumno a1 = new Alumno("Pepe",o1);
        Alumno a2 = new Alumno("Luis",o2);
        alumnos.add(a1);
        alumnos.add(a2);
        Instituto i1 = new Instituto("Mundet", a1.getNombreAlumno());
        Instituto i2 = new Instituto("Gironella", a2.getNombreAlumno());
        institutos.add(i1);
        institutos.add(i2);
        MathManagerImpl.getInstance().listarinstitutospornumoperaciones();
    }


}

