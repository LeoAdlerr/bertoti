package compostos;

import interfaces.Component;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation.");
    }
}
