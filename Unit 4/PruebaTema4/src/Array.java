import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 4, 4, 3, 7, 8, 5};
        System.out.println(sumArray(array));
        System.out.println(maxArray(array));
        System.out.println(minArray(array));
        System.out.println(Arrays.toString(positionArray(array, 5)));
        System.out.println(Arrays.toString(evenArray(array)));
        System.out.println(Arrays.toString(inverseArray(array)));
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int maxArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minArray(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] positionArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                array = new int[]{i};
            }

        }
        return array;
    }

    public static int[] evenArray(int[] array) {
        int[] newArray = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray = array;
                break;
            }
        }
        return newArray;
    }

    public static int[] inverseArray(int[] array) {
        int[] rotate = new int[array.length];
        rotate[rotate.length - 1] = array[0];
        for (int index = 0; index < array.length - 1; index++) {
            rotate[index] = array[index + 1];
        }
        return rotate;
    }

    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }
}
