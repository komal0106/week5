public class Factorial{
    public static long compute(int n){
        if(n < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
        long result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

   /* public static void main(String[] args){
        int number = 5; // Example input
        long factorial = compute(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    */
}