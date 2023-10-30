import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        shuffleArray(array);

        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

           
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
