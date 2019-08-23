package main.java.server;

import java.util.Random;

public class Body {
    private static Random random = new Random();
    private String name;

    public Body() {
        this.name = "body" + random.nextInt(10);
    }

    @Override
    public String toString() {
        return "Body{" +
                "name='" + name + '\'' +
                '}';
    }
}
