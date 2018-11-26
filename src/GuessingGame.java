public class GuessingGame {

    public static void main(String []args){
        int low;
        int high;

        try {
             low = Integer.parseInt(args[0]);
             high = Integer.parseInt(args[1]);
        }
        catch (Exception e) {
            low = 0;
            high = 1000;
        }
        Guesser guesser = new Guesser(low, high);
        guesser.start();



    }
}
