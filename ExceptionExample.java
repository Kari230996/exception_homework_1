
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
        }

        try {
            method2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }

        try {
            method3();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
        }
    }

    // Метод, генерирующий NullPointerException
    public static void method1() {
        String s = null;
        System.out.println(s.length());
    }

    // Метод, генерирующий ArrayIndexOutOfBoundsException
    public static void method2() {
        int[] arr = new int[5];
        System.out.println(arr[10]);
    }

    // Метод, генерирующий NumberFormatException
    public static void method3() {
        String s = "abc";
        Integer.parseInt(s);
    }
}
