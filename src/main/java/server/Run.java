package main.java.server;

public class Run implements Runnable {
    private Body body;
    private HttpMethods request;

    public Run(Body body, HttpMethods request) {
        this.body = body;
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("This is " + request + " request in " + Thread.currentThread().getName() + " with " + body);

    }
}
