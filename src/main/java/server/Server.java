package main.java.server;

public class Server {
    public static void main(String[] args) {

        for (HttpMethods request : HttpMethods.values()) {
            new Thread(new Run(new Body(), request)).start();
        }
    }
}
