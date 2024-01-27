package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int poolSizeThreads = 64;
        int port = 9999;
        Server server = new Server(port, poolSizeThreads);
        server.start();
    }
}