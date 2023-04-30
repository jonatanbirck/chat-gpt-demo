public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        final String message = "I need to create a javascript code that receives a list of values and returns the largest";
        String response = ChatGPTClient.sendMessage(message);
        System.out.println(response);
    }

}