public class ArrayDifference {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 2, 1, 5};

        int[] result = calculateDifference(array1, array2);
        if (result == null) {
            System.out.println("Длины массивов не совпадают!");
        } else {
            System.out.print("Разность элементов массивов: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] calculateDifference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return null; // Возвращаем null, если длины массивов не совпадают
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }

        return result;
    }
}