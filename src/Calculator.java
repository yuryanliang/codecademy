//A basic Calculator
public class Calculator{
    int a;
    int b;

    public static int addTwo(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int sum = cal.addTwo(4, 5);
        System.out.println("sum is " + sum);
    }
}