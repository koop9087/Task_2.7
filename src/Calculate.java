public class Calculate {
    
    public static int[] findArrayOfNumber(int[] array) {
        int[] mas = new int[array.length - 1];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = array[i] + array[i + 1];
        }
        return mas;
    }

    public static int maxOfArray(int[] array) {
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                num = array[i];
            }
        }
        return num;
    }

}
