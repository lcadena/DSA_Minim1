import examen.*;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
public class miTest {
    @Before
    public void setUp(){
        MathManagerImpl.getInstance();

        MathManagerImpl.getInstance().procesarOperación();

    }

    @After
    public void tearDown(){
        MathManagerImpl.getInstance().reiniciarSingleton();
    }

}
