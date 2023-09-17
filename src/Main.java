import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        int counterRecurns=3;

        for (int repeticiones = 0; repeticiones<=counterRecurns; repeticiones++  ) {
            System.out.println(Fibrecurns(repeticiones)+ " ");
        }
        int[] fibonacciSequence = FibList(counterRecurns);

        for (int i = 0; i < fibonacciSequence.length; i++) {
            System.out.println(fibonacciSequence[i] + "Lista ");
        }
    }
    public static int Fibrecurns(int n){
        if (n<=1){
            return n;
        }else {
            return Fibrecurns(n-1)+Fibrecurns(n-2);
        }
    }
    public static int[] FibList(int n) {
        int[] F = new int[n];
        F[0] = 0;
        F[1] = 1;

        for (int i = 2; i < n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }

        return F;
    }
}