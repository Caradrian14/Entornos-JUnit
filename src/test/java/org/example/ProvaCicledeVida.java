package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

@DisplayName("PROVA DEL CICLE DE VIDA EN JUnit5")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProvaCicledeVida {

    public ProvaCicledeVida(){
        System.out.println("---- Constructor ----");
    }

    @BeforeAll
    static  void  setup(){
        System.out.println("@beforeAll => setup(): S'executa Abans de començar les proves");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll => tear(): S' executa Al FINAL de totes les proves");
    }

    @BeforeEach
    void  setupThis(){
        System.out.println("@BeaforeEach => setupThis(): S'executa ABANS DE CADA prova");
    }

    @AfterEach
    void  tearThis(){
        System.out.println("@AfterEach => tear(): S'executa DESPRES DE CADA prova");
    }

    @DisplayName("Primer test...")
    @RepeatedTest(3)
    void testOne(){
        boolean isServerUp = false;
        assumeTrue(isServerUp, "Ignoring test, server is down!!");

        System.out.println("======= Test One Execute =======");
        int resultatEsperat = 3;
        assertEquals( resultatEsperat, 1 + 2);
    }
    @DisplayName("Segundo test...")
    @RepeatedTest(value = 2, name = "--> {currentRepetition}/{totalRepetitions}")
    void testTwo(){
        System.out.println("======= Test Two Execute =======");
        int resultatEsperat = 3;
        assertEquals( resultatEsperat, 1 + 2);
    }

    @Disabled
    @Test
    void testThree(){
        System.out.println("======= Test Three Execute =======");
    }

    @Test
    void testFour(){
        System.out.println("======= Test Four Execute =======");
        fail("testFour ha FALLAT, encara no esta acabat :(");
    }

    @Test
    void testFive(){
        int resultatEsperat = 2;
        assertEquals(resultatEsperat, 1 +2);
    }

    @Test
    void testSix(){
        System.out.println("======= Test Six Execute =======");
        assumeTrue(true, "Ignoring test, server is done");
    }

    @Test
    @RepeatedTest(3)
    void testSeven(){
        boolean isServerUp = Math.random() >= 0.5;
        assumeTrue(isServerUp, "Ignoring test, server is down!!");

        int resultatEsperat = 3;
        assertEquals(resultatEsperat, 1 + 2);

        System.out.println("======= Test Seven Execute =======");
    }


}