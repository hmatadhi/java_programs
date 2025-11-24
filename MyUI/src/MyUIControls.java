import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class MyUIControls extends Frame {


	    public MyUIControls() {

	        setLayout(new FlowLayout());
	        Label lbl = new Label("MyUIControls");
	        add(lbl);
	        
	        TextField txtField = new TextField("Enter text", 20);
	        add(txtField);

	        Button b = new Button("OK");
	        b.setBackground(Color.BLUE);
	        b.setForeground(Color.WHITE);

	        Font f = new Font("Arial", Font.BOLD, 18);
	        b.setFont(f);

	        add(b); 

	        Checkbox c1 = new Checkbox("Java");
	        Checkbox c2 = new Checkbox("Python");
	        add(c1);
	        add(c2);
	        
	        CheckboxGroup g = new CheckboxGroup();
	        Checkbox male = new Checkbox("Male", g, true);
	        Checkbox female = new Checkbox("Female", g, false);
	        
	        add(male);
	        add(female);
	        
	        Choice ch = new Choice();
	        ch.add("Apple");
	        ch.add("Banana");
	        ch.add("Orange");
	        add(ch);
	        
	        
	        List lst = new List(5, true);
	        lst.add("India");
	        lst.add("USA");
	        lst.add("UK");
	        add(lst);
	        
	        Scrollbar sb = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 100);
	        add(sb);
	        
	        MenuBar mb = new MenuBar();
	        Menu file = new Menu("File");
	        file.add(new MenuItem("Open"));
	        file.add(new MenuItem("Exit"));
	        mb.add(file);

	        setMenuBar(mb);
	        
	        /*Dialog d = new Dialog(this, "Message", true);
	        d.add(new Label("This is a dialog box"));
	        d.setSize(200,100);
	        d.setVisible(true);*/
	        
	        
	        addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	            	MyUIControls.this.dispose();  // close window
	                System.exit(0);              // exit program
	            }
	        });
	        
	        

	        setSize(300, 200);
	        setVisible(true);
	    }

}

