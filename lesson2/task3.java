import java.io.FileNotFoundException;

public class task3 {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = null;
        if (abc != null) {
            if (abc.length > 3) {
                abc[3] = 9;
            } else {
                throw new IndexOutOfBoundsException("Массив выходит за пределы своего размера!");
            }  
        } else {
            throw new NullPointerException("Указатель не может указывать на null!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
