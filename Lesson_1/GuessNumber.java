public class GuessNumber {
    public static void main(String[] args) {
        int low = 1;
        int high = 100;
        int secretNumber = low + (int) (Math.random() * (high - low) + 1);
        int guessNumber = (low + high) / 2;

        System.out.println(secretNumber);
        while (guessNumber != secretNumber) {
            guessNumber = (low + high) / 2;

            if (guessNumber < secretNumber) {
                System.out.println(guessNumber + " меньше того, что загадал компьютер");
                low = guessNumber + 1;
            } else {
                System.out.println(guessNumber + " больше того, что загадал компьютер");
                high = guessNumber - 1;
            }
        }

        System.out.println("Вы победили! " + guessNumber);
    }
}