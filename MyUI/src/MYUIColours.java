import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MYUIColours extends Frame {

    public MYUIColours() {

        setLayout(new FlowLayout());

        add(new Label("MYUIColours"));
        add(new TextField("Enter text", 20));

        Button b = new Button("OK");
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);

        Font f = new Font("Arial", Font.BOLD, 18);
        b.setFont(f);

        add(b); 


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MYUIColours.this.dispose();  // close window
                System.exit(0);              // exit program
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MYUIColours();
    }
}
