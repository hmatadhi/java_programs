import java.awt.*;
import java.awt.event.*;

	
public class MyUIWithClose extends Frame {

	public MyUIWithClose() {
		
		/*
		 * FlowLayout

            GridLayout

           CardLayout
           
           BorderLayout
		 */
		
		
	        setLayout(new FlowLayout());

	        add(new Button("Click Me"));
	        add(new Label("MyUIWithClose"));
	        add(new TextField("Enter text", 20));

	        // ✔ Proper close handler
	        addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                dispose();       // closes the frame
	                System.exit(0);  // terminates the program
	            }
	        });

	        setSize(300, 200);
	        setVisible(true);
	}

   /*public static void main(String[] args) {
	        new MyUIWithClose();
   }*/

}
