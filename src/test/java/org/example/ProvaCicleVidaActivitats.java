package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assumptions.*;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProvaCicleVidaActivitats {
    public ProvaCicleVidaActivitats(){System.out.println("---- Constructor ----");
    }
/*
    assertEquals() permite comprobar si dos objetos son "equals", por otro lado
 */
    @DisplayName("Primer test: assertNotEquals")
    @Test
    void testOne(){
        String name = "Adria";
        StringBuilder name2 = new StringBuilder("Arturo");
        assertNotEquals(name, name2);
    }

    @DisplayName("Segundo test: assertNotEquals")
    @Test
    void testTwo(){
        String name = "Adria";
        assertEquals(name, name);
    }

    /*
    assertTrue fallara si el segundo parametro es falso, si se usa assertFalse
    falla si en el segundo parametro es True.
     */
    @DisplayName("tercer test: assertTrue")
    @Test
    void testThree(){
        assertTrue("Aprobamos!!! :)", true);
    }

    @DisplayName("cuarto test: assertTrue")
    @Test
    void testFour(){
        assertTrue("Suspendimos :(", false);
    }

    @DisplayName("quinto test: assertFalse")
    @Test
    void testFive(){
        assertFalse("Suspendimos :(", false);
    }

    /*
    AssertNull() si el objeto no es null, lanza un error. Por otro lado,
    AssertNotNull hace lo contrario, si es null, lanza un error
     */
    @DisplayName("sexto test: assertNull")
    @Test
    void testSix(){
        String a = null;
        assertNull(a);
    }

    @DisplayName("Septimo test: assertNull")
    @Test
    void testSeven(){
        String a = null;
        assertNotNull(a);
    }

    /*
    AssertSame comprueba el valor y el tipo asociado y devuelve True si es igual.
    Si es asserNotSame sucede lo contrario.
     */
    @DisplayName("Octavo test: assertSame")
    @Test
    void testEight(){
        String a = "1";
        String b = "1";
        assertSame(a,b);
    }

    @DisplayName("Noveno test: assertSame")
    @Test
    void testNine(){
        String a = "0";
        String b = "1";
        assertSame(a,b);
    }

    /*
    assertThrows() testea un codigo que espera que lance una excepcion concreta.
     */
    @DisplayName("Decimo test: assertThrows()")
    @Test
    void testTen(){
        NumberFormatException thrown = Assertions
                .assertThrows(NumberFormatException.class, () -> {
                    Integer.parseInt("1");
                }, "NumberFormatException error esperado");

        Assertions.assertEquals("Algun mensaje esperado", thrown.getMessage());
    }

    /*
    Si se llama assumeTrue con una expresion en false, esta sera ignorada, lanzando un
    AssumptionViolatedException. Si se usa AssumeFalse lanza lo contrario
     */
    @DisplayName("decimo-primer test: assertSame")
    @Test
    void testEleven(){
        String a = "0";
        String b = "1";
        assumeFalse(true, "Hola");
    }

    /*
    assumingThat() solo ejecuta el contenido dado solo si es valido, este metodo no aborta el test.
    Si es invalido no hace nada. Si es valido y lanza una excepcion se tratara como un test fallido.
    el error lanzado se enmascara como una excepcion "unchecked".
     */

    @Test
    void testTweleve(){
        assumingThat("DEV".equals(System.getenv("ENV")),
                () -> {
                    assertEquals(2, (4/ 2));
                });
        assertEquals(42, (6 * 7));
    }
}
