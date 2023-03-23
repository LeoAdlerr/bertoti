package compostos;

import java.util.ArrayList;
import java.util.List;

import interfaces.Component;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int index) {
        return children.get(index);
    }

    @Override
    public void operation() {
        System.out.println("Composite operation.");
        for (Component component : children) {
            component.operation();
        }
    }
}

