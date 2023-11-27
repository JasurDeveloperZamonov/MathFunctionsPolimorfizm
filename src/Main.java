import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MathFunction mathFunction=new MathFunction();
//        System.out.print("Birinchi sonni kiriting: ");
//        mathFunction.a=scanner.nextDouble();
//        System.out.print("Ikkinchi sonni kiriting: ");
//        mathFunction.b=scanner.nextDouble();
        System.out.println(mathFunction.mathAdd(6,7.5));
        System.out.println(mathFunction.mathSub(7.5,-5));
        System.out.println(mathFunction.mathMultiply(15,3));
        System.out.println(mathFunction.mathDiv(-3.6,3));
        System.out.println(mathFunction.mathABS(-125.6));
        System.out.println(mathFunction.mathPow(-20));
    }
}