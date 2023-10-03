public class task2 {
    public static void main(String[] args) throws Exception {
        int d = 0;
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (intArray.length > 8) {
            if (d != 0) {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                throw new ArithmeticException("Деление на 0");                    
            }
        } else {
            throw new IndexOutOfBoundsException("Индекс за пределами массива");
        }
    }
}
