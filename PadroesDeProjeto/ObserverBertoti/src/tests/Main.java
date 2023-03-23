package tests;

import contexts.MessageBoard;
import objects.User;

public class Main {
    public static void main(String[] args) {
        MessageBoard board = new MessageBoard();

        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        board.attach(alice);
        board.attach(bob);
        board.attach(charlie);

        board.notifyObservers("Hello, world!");

        board.detach(bob);

        board.notifyObservers("Goodbye, world!");
    }
}