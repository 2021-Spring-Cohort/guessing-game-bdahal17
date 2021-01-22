public class GuessingGameApp {

    public static void main(String[] args) {
        System.out.println("Guessing Game");
        System.out.println("-------------");
        System.out.println("Guess a number between 1 - 10");
        int bound = 10;
        Random rand = new Random(bound);
        Scanner scan = new Scanner(System.in);
        int scanLine = scan.nextInt();
        if(scanLine != 10) {
            System.out.println("Keep guessing);
        } else if(scanLine == scanLine) {
            System.out.println("Great! You're correct");
        }
    }

}
