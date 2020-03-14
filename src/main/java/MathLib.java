public class MathLib {

    public static long sqr(long x){
        return x*x;
    }
    public static double sqr(double x){
        return x*x;
    }

    public static long factorial(int x){
        long p=1;
        for(int i=2;i<=x;i++)
            p*=i;
        return p;
    }
    public static long power(int a,int n){
        long r=a;
        for(int i=2;i<=n;i++){
            r*=a;
        }
        return r;
    }
    public static int log(int a,int b){
        long r=a;
        int c=1;
        for(;r<b;c++){
            r*=a;
        }
        if(r>b)return -1;
        return c;
    }







}
