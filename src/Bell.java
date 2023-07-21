public class Bell {
    static int count = 0;
    public static void sound() {
        if(count % 2 == 0) {
            System.out.println("ding");
            count++;


            }
        else {
            System.out.println("dong");
            count++;
        }
    }
}
