public class SalutTotoBis {

    public static void saySalutToto(int numberTimes) {
        if (numberTimes == 0) {
            return;
        }

        final ThreadContext threadContext = new ThreadContext(numberTimes);
        final Thread salutThread = new Thread(new SalutThread(threadContext));
        final Thread totoThread = new Thread(new TotoThread(threadContext));

        salutThread.start();
        totoThread.start();
    }

    private final static class ThreadContext {

        private final int numberTimes;

        private int numberSalut = 0;
        private int numberToto = 0;

        private ThreadContext(int numberTimes) {
            this.numberTimes = numberTimes;
        }

        public int getNumberTimes() {
            return numberTimes;
        }

        public int getNumberSalut() {
            return numberSalut;
        }

        public int getNumberToto() {
            return numberToto;
        }

        public ThreadContext incrementNumberSalut() {
            this.numberSalut++;
            return this;
        }

        public ThreadContext incrementNumberToto() {
            this.numberToto++;
            return this;
        }
    }

    private final static class SalutThread implements Runnable {

        private static final int TIMEOUT = 1000;

        private final ThreadContext threadContext;

        public SalutThread(ThreadContext threadContext) {
            this.threadContext = threadContext;
        }

        @Override
        public void run() {
            synchronized (threadContext) {
                while(threadContext.getNumberSalut() < threadContext.getNumberTimes()) {
                    if(threadContext.getNumberSalut() == threadContext.getNumberToto()){
                        System.out.print("Salut ");
                        threadContext.incrementNumberSalut();
                    }

                    threadContext.notify();

                    try {
                        threadContext.wait(TIMEOUT);
                    } catch (InterruptedException e) {
                        throw new RuntimeException("Cannot obtain lock after " + TIMEOUT + "ms.", e);
                    }
                }
            }
        }
    }

    private final static class TotoThread implements Runnable {

        private static final int TIMEOUT = 1000;

        private final ThreadContext threadContext;

        public TotoThread(ThreadContext threadContext) {
            this.threadContext = threadContext;
        }

        @Override
        public void run() {
            synchronized (threadContext) {
                while(threadContext.getNumberToto() < threadContext.getNumberTimes()) {
                    if(threadContext.getNumberToto() < threadContext.getNumberSalut()){
                        System.out.print("Toto ");
                        threadContext.incrementNumberToto();
                    }

                    threadContext.notify();

                    try {
                        threadContext.wait(TIMEOUT);
                    } catch (InterruptedException e) {
                        throw new RuntimeException("Cannot obtain lock after " + TIMEOUT + "ms.", e);
                    }
                }
            }
        }
    }
}
