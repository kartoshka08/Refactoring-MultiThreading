package org.example;

public class Main {
    public static void main(String[] args) {
        int poolSizeThreads = 64;
        int port = 8888;
        Server server = new Server(port, poolSizeThreads);
        server.start();
    }
}