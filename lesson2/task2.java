public class task2 {
    public static void main(String[] args) throws Exception {
        int[] intArray = {1,2,3};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } finally {
            System.out.println("Bye!");
        }
    }
}
