public class SalutToto {

    public static void saySalutToto(int numberTimes) throws InterruptedException {
        if(numberTimes == 0){
            return;
        }

        print("Salut ");
        print("Toto ");

        saySalutToto(numberTimes-1);
    }

    private static void print(String text) throws InterruptedException {
        final Thread thread = new Thread(() -> System.out.print(text));

        thread.start();
        thread.join();
    }

}
