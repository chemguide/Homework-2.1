import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        Integer[] value = new Integer[] {3, 4};
        System.out.println("value = " + Arrays.toString(value));
        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }
    public static void changeValue(Integer[] value) {
        value[0] = 99;
    }
}
