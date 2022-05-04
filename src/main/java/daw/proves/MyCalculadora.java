package daw.proves;

public class MyCalculadora {
    public int add(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException();
        }
        return a +b;
    }

    public int sub(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException();
        }
        return a - b;
    }

    public int multi(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException();
        }
        return a * b;
    }

    public int div(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException();
        }
        if(b == 0){
            throw new ArithmeticException("Dividido por zero");
        }
        return a / b;
    }
}
