public class MathFunction {

    //***************** YIG'INDI ***************************//
    public double mathAdd(double a,double b){
        return a+b;
    }
    public int mathAdd(int a,int b){
        return a+b;
    }
    public short mathAdd(short a,short b){
        return (short) (a+b);
    }
    public float mathAdd(float a,float b){
        return a+b;
    }
    public long mathAdd(long a,long b){
        return  a+b;
    }
    public byte mathAdd(byte a,byte b){
        return (byte) (a+b);
    }

    //***************** AYIRMA ***************************//
    public double mathSub(double a,double b){
        return a-b;
    }
    public int mathSub(int a,int b){
        return a-b;
    }
    public float mathSub(float a,float b){
        return a-b;
    }
    public short mathSub(short a,short b){
        return (short) (a-b);
    }
    public long mathSub(long a,long b){
        return a-b;
    }
    public byte mathSub(byte a,byte b){
        return (byte) (a-b);
    }

    //***************** KO'PAYTMA ***************************//
    public int mathMultiply(int a,int b){
        return a*b;
    }
    public double mathMultiply(double a,double b){
        return a*b;
    }
    public float mathMultiply(float a, float b){
        return a*b;
    }
    public short mathMultiply(short a, short b){
        return (short) (a*b);
    }
    public byte mathMultiply(byte a, byte b){
        return (byte) (a*b);
    }
    public long mathMultiply(long a, long b){
        return a*b;
    }
    //***************** BO'LINMA ***************************//
    public double mathDiv(double a,double b){
        return a/b;
    }
    public int mathDiv(int a,int b)
    {
        return a/b;
    }
    public float mathDiv(float a,float b)
    {
        return a/b;
    }
    public short mathDiv(short a,short b)
    {
        return (short) (a/b);
    }
    public byte mathDiv(byte a,byte b)
    {
        return (byte) (a/b);
    }
    public long mathDiv(long a,long b)
    {
        return a/b;
    }

    //***************** MODUL ***************************//
    public double mathABS(double a){
        return Math.abs(a);
    }
    public int mathABS(int a){
        return Math.abs(a);
    }
    public float mathABS(float a){
        return Math.abs(a);
    }public short mathABS(short a){
        return (short) Math.abs(a);
    }public byte mathABS(byte a){
        return (byte) Math.abs(a);
    }public long mathABS(long a){
        return Math.abs(a);
    }
    //***************** KVADRAT DARAJA ***************************//
    public double mathPow(double a){
        return Math.pow(a,2);
    }
    public int mathPow(int a){
        return a*a;
    }
    public float mathPow(float a){
        return a*a;
    }
    public short mathPow(short a){
        return (short) (a*a);
    }
    public byte mathPow(byte a){
        return (byte) (a*a);
    }
    public long mathPow(long a){
        return a*a;
    }
}
