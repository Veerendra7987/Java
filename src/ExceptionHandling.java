public class ExceptionExample {
    public static void main(String[] args) {
        try {
           
            int[] numbers = {1, 2, 3};
            System.out.println("Number at index 2: " + numbers[2]);
            
            int result = 10 / 0;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes (cleanup code).");
        }

        System.out.println("Program continues after exception handling.");
    }
}
