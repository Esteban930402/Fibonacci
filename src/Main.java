import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        int counter=10;

        for (int repeticiones = 0; repeticiones<=counter; repeticiones++  ) {
            System.out.println(Fibrecurns(repeticiones)+ " ");
        }
    }
    public static int Fibrecurns(int n){
        if (n<=1){
            return n;
        }else {
            return Fibrecurns(n-1)+Fibrecurns(n-2);
        }
    }
}