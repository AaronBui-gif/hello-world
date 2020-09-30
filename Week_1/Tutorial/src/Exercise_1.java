import java.util.ArrayList;

public class Exercise_1 {
    public static void main(String[] args) {
        int[] step1 = new int[100];
        System.out.println("|\tNumber\t\t|\t\tStep\t|");
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            step1[i] = function(i);
            System.out.println("---------------------------------");
            System.out.println("|\t"+i + "\t\t\t|" + "\t\t" + step1[i] + "\t\t|");
            if(i == step1[i]){
               number.add(i);
            }
        }
        int max = findMaxStep(step1);

        System.out.println("Max: " + max);

        System.out.println("The number has step equal to it original value: ");
        for (Integer integer : number) System.out.println(integer);
    }
    public static int function(int n) {
        int step = 0;
        while (n > 1) {
            step++;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return step;
    }
    public static int findMaxStep(int[] step) {
        int max = step[0];

        for (int i = 1; i < step.length; i++) {
            if (step[i] >= max) {
                max = step[i];
            }
        }

        return max;
    }
}
