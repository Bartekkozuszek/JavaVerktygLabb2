public class TestGuessser {

    public static void main(String []args){

        Guesser guesser = new Guesser(0,10);
        if(guesser.toString().equals("low: 0 high: 10")){
            System.out.println("Test with 0, 10 passed!");
        }else{
            System.err.println("Test with 0, 10 failed!");
        }

        System.out.println(guesser.toString());
        guesser.start();
    }
}


