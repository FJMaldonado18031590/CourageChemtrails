import static org.junit.Assert.assertEquals;
import static org.;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class EcuacionPrimerGradoMockitoTest {

    @Spy
    private EcuacionPrimerGrado ecuacionPrimerGrado;

    @Mock
    private Parseador parseador=new Parseador();

    @Before public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test

    public void solucionaEcuacionConMenos() {
        String ecuacion = "2x - 1 = 0";

        when(parseador.obtenerParte1(ecuacion)).thenReturn(2);
        when(parseador.obtenerParte2(ecuacion)).thenReturn(-1);
        when(parseador.obtenerParte3(ecuacion)).thenReturn(0);

        Double result = ecuacionPrimerGrado.obtenerResultado(ecuacion);

        Double valueExpected = 0.5;

        assertEquals(valueExpected, result);
    }


    @Test
    public void solucionaEcuacionConMas() {
        String ecuacion = "2x + 1 = 0";
        //when(parseador.obtenerParte1(ecuacion)).thenReturn(2);
        System.out.println(when(parseador.obtenerParte1(ecuacion)).thenReturn(2));
        //when(parseador.obtenerParte2(ecuacion)).thenReturn(1);
        //when(parseador.obtenerParte3(ecuacion)).thenReturn(0);

        Double result = ecuacionPrimerGrado.obtenerResultado(ecuacion);

        Double valueExpected = -0.5;

        assertEquals(valueExpected, result);
    }

    @Test
    public void solucionaEcuacionConParte3Mayor0() {
        String ecuacion = "2x + 1 = 10";

        when(parseador.obtenerParte1(ecuacion)).thenReturn(2);
        when(parseador.obtenerParte2(ecuacion)).thenReturn(1);
        when(parseador.obtenerParte3(ecuacion)).thenReturn(10);

        Double result = ecuacionPrimerGrado.obtenerResultado(ecuacion);

        Double valueExpected = 4.5;

        assertEquals(valueExpected, result);
    }

    @Test
    public void solucionaEcuacionConParte3Menor0() {
        String ecuacion = "2x + 1 = -10";

        when(parseador.obtenerParte1(ecuacion)).thenReturn(2);
        when(parseador.obtenerParte2(ecuacion)).thenReturn(1);
        when(parseador.obtenerParte3(ecuacion)).thenReturn(-10);

        Double result = ecuacionPrimerGrado.obtenerResultado(ecuacion);

        Double valueExpected = -5.5;

        assertEquals(valueExpected, result);
    }
}
