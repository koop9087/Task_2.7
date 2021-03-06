import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scanInt();
        int[] array = new int[size];
        int[] mas;
        Filler.fillInArray(array);
        System.out.println(Arrays.toString(array));
        mas = Calculate.findArrayOfNumber(array);
        System.out.println(Arrays.toString(mas));
        System.out.println(Integer.toString(Calculate.maxOfArray(mas)));
    }
}
