public class Game {
    public static void main(String[] args) {
        int low = 1;
        int high = 100;
        int secretNumber = low + (int) (Math.random() * (high - low) + 1);
        int guessNumber;

        System.out.println(secretNumber);
        while (true) {
            guessNumber = (low + high) / 2;

            if (guessNumber == secretNumber) {
                System.out.println("Число угадано! " + guessNumber);
                break;
            } else if (guessNumber < secretNumber) {
                System.out.println(guessNumber + " меньше того, что загадал компьютер");
                low = guessNumber + 1;
            } else {
                System.out.println(guessNumber + " больше того, что загадал компьютер");
                high = guessNumber - 1;
            }
        }
    }
}