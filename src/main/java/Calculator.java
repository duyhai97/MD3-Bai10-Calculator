public class Calculator {
    public static double Cong(double a, double b){
        return a + b ;
    }

    public static double tru(double a, double b){
        return a + b ;
    }
    public static double nhan(double a, double b){
        return a + b ;
    }
    public static double chia(double a, double b){
        if (b != 0) return a/b;
        else throw new RuntimeException("Can't divide by zero");
    }
}
