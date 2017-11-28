public class Quiz2dot2 {

    public final int value = 4;

    public void doIt()
    {
        int value = 6;

        Runnable r = new Runnable() {

            public final int value = 5;

            public void run() {

                int value = 10;
                System.out.println(this.value);
            }

        };
        r.run();
    }

    public static void main(String[] args) {
        Quiz2dot2 quiz2dot2 = new Quiz2dot2();
        quiz2dot2.doIt();


    }
}

