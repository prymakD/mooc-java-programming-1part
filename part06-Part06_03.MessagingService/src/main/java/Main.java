
public class Main {

    public static void main(String[] args) {

        Message massage = new Message("Me", "I dont know");
        MessagingService mes = new MessagingService();
        mes.add(massage);
        System.out.println(mes.getMessages());
    }
}
