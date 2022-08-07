public class CalcMath {

    public static <T> T add(T a, T b) {
        T result = a + b;
        return result;
    }

    public static int subtract(int a, int b){
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b){
        int result = a*b;
        return result;
    }

    public static int divide(int a, int b){
        int result = 1010101;

    if(a == 0 || b == 0 ){
        System.out.println("На ноль не делим");
        return result;
    }else {
        result = a / b;
        return result;
        }

    }

}

