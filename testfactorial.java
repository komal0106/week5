public class testfactorial {
    public static void main(String[] args) {
        try{
            if(factorial.compute(5)!=120){
                throw new AssertionError("Test failed for input 5");
            }
            if(factorial.compute(0)!=1){
                throw new AssertionError("Test failed for input 0");
            }
            System.out.println("All tests passed.");
        }
        catch(Exception e){
            System.err.println("test failed: " + e.getMessage());
        }
    }
}