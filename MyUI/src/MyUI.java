import java.awt.*;

public class MyUI extends Frame {
    MyUI() {
        setLayout(new FlowLayout());
        add(new Button("Click Me"));
        add(new Label("MyUI!"));
        add(new TextField("Enter text",25 ));

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyUIWithClose();
    }
}