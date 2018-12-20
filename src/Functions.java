//---------------------------------------------------------------
//         Project
//         Functions.java
//         Calculates the sum of the products of array keys and their positions.
//---------------------------------------------------------------

public class Functions {

    public static void main(String[] args) {
        double[] sol = {1.0,5.0,1.0,1.0};
        int N = sol.length;
        double a = Math.pow(sol[0], 2);
        double b = Math.pow(sol[1], 1);
        double answ = 0;
        for (int i = N-1; i >= 0; i--) {
            answ += Math.pow(sol[N - 1 - i], i); 
            System.out.println(answ);
        }
    }
}
