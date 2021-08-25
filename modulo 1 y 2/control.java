public class control{
    public static void main(String[] args) {
        System.out.println("main method starting");
        message1();
        message2();
        System.out.println("done with main");
    }

    public static void message1(){
        System.out.println("all of message1");
    }
    public static void message2(){
        System.out.println("Start of message2");
        message1();
        System.out.println("End of message2");
    }
}