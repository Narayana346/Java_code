package java_basic.exceptionHandelling;

public class our_throw_defult_catch {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawlAmount = 50000;
        try {

            if (balance < withdrawlAmount)
                throw new ArithmeticException("insufficient balance");
            balance = balance - withdrawlAmount;
            System.out.println("transation successfully completed");
        }catch (ArithmeticException error){
            System.out.println("Exception : " + error.getMessage());
        }
        finally {
            System.out.println("pogramming continue...");
        }
    }
}
