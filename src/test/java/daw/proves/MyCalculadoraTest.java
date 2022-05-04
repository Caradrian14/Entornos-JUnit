package daw.proves;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculadoraTest {

    MyCalculadora myCalculadora;

    @BeforeEach
    void setUpMyCalculator(){
        myCalculadora = new MyCalculadora();
        System.out.println("MyCalculator created");
    }

    @Test
    void add() {
        int expected = 3;
        assertEquals(expected, myCalculadora.add(1,2));
    }

    @Test
    void sub(){
        int total = 5;
        int sub = 5;
        int expected = 0;
        assertEquals(expected, myCalculadora.sub(total,sub));
    }

    @Test
    void mult(){
        int total = 5;
        int sub = 5;
        int expected = 25;
        assertEquals(expected, myCalculadora.multi(total,sub));
    }

    @Test
    void divided(){
        int numerador = 15;
        int denominador = 3;
        int expected = 5;;
        assertEquals(expected, myCalculadora.div(numerador,denominador));
    }

    @Test
    void dicedByZero(){
        int numerador = 1;
        int denominador = 0;

        ArithmeticException e = assertThrowsExactly(ArithmeticException.class, ()->{
            myCalculadora.div(numerador, denominador);
        });

        assertEquals("Dividido por zero", e.getMessage());
    }

    @Test
    void dicedByZero2(){
        int numerador = 1;
        int denominador = 0;
        ArithmeticException e = assertThrowsExactly(ArithmeticException.class, ()->{
            myCalculadora.div(numerador, denominador);
        });

        assertEquals("Dividido por zero", e.getMessage());
    }

    @AfterEach
    void tearDownMyCalculator(){
        myCalculadora = null;
        System.out.println("MyCalculator=null");
    }
    @Disabled
    @Test
    void addWhenNegativeThrowsException(){
        int numero1 = -10;
        int numero2 = 0;
        IllegalArgumentException e = assertThrowsExactly(IllegalArgumentException.class, ()->{
            myCalculadora.div(numero1, numero2);
        });
    }
    @Disabled
    @Test
    void subWhenNegativeThrowsException(){
        int numero1 = -10;
        int numero2 = 0;
        IllegalArgumentException e = assertThrowsExactly(IllegalArgumentException.class, ()->{
            myCalculadora.div(numero1, numero2);
        });
    }
    @Disabled
    @Test
    void multWhenNegativeThrowsException(){
        int numero1 = -10;
        int numero2 = 0;
        IllegalArgumentException e = assertThrowsExactly(IllegalArgumentException.class, ()->{
            myCalculadora.div(numero1, numero2);
        });
    }
    @Disabled
    @Test
    void divWhenNegativeThrowsException(){
        int numero1 = -10;
        int numero2 = 4;
        IllegalArgumentException e = assertThrowsExactly(IllegalArgumentException.class, ()->{
            myCalculadora.div(numero1, numero2);
        });
    }
}