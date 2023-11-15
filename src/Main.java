import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MathFunction mathFunction=new MathFunction();
        System.out.print("Birinchi sonni kiriting: ");
        mathFunction.a=scanner.nextDouble();
        System.out.print("Ikkinchi sonni kiriting: ");
        mathFunction.b=scanner.nextDouble();

        System.out.println(mathFunction.mathAdd());
        System.out.println(mathFunction.mathSub());
        System.out.println(mathFunction.mathMultiply());
        System.out.println(mathFunction.mathDiv());
        System.out.println(mathFunction.mathABS());
        System.out.println(mathFunction.mathPow());
    }
}