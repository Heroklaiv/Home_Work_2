import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // max/min
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);

        //mod2
        int[] numbers2 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        for (int i : numbers2) if (i % 2 == 0) System.out.println(i);

        // max and min length
        int[] numbers3 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        int max = 0, min = Integer.MAX_VALUE, maxIndex = 0, minIndex = 0;
        for (int i = 0; i != numbers3.length; i++) {
            String copyNumbers3 = Integer.toString(numbers3[i]);
            if (copyNumbers3.length() > max) {
                max = copyNumbers3.length();
                maxIndex = i;
            }
            if (copyNumbers3.length() < min) {
                min = copyNumbers3.length();
                minIndex = i;
            }
        }
        System.out.print(numbers3[minIndex] + " " + numbers3[maxIndex]);
        System.out.println(" ");

        // 4ая в порядке возрастания +1
        int[] numbers4 = {1234, 5678, 16, 99, 26, 92, 34, -234, 35, 80};
        for (int i : numbers4) {
            int copyNumber = i;
            boolean flag = false;
            if (i < 0) i = Math.abs(i);
            while (i > 10) {
                int mod = i % 10;
                i /= 10;
                if (mod == i % 10 + 1) flag = true;
                else flag = false;
            }
            if (flag) System.out.println(copyNumber);
        }

        // Палиндро́м
        int[] numbers5 = {1001, 412214, 16, 99, 26, 92, 34, 7887, 35, 80};

        for (int i : numbers5) {
            boolean flag = false;
            String copyNumber = Integer.toString(i);
            char[] array = copyNumber.toCharArray();
            for (int j = 0; j < copyNumber.length() / 2; j++)
                if (array[j] == array[copyNumber.length() - 1 - j]) flag = true;
                else flag = false;
            if (flag) System.out.println(i);
        }
    }
}
