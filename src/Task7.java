import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        Integer[] value = new Integer[]{3, 4};
        changeValue(value);
        System.out.println("value = " + Arrays.toString(value));
    }

    public static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }
}
