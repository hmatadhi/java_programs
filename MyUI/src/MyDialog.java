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

public class MyDialog extends Frame {


	    public MyDialog() {

	        setLayout(new FlowLayout());
	        Label lbl = new Label("MyDialog");
	        add(lbl);
	        
	        
	        Dialog d = new Dialog(this, "Message", true);
	        d.add(new Label("This is a dialog box"));
	        d.setSize(200,100);

	        d.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	            	d.dispose();  // close dialog
	            }
	        });
	        d.setVisible(true);
	        
	        	        
	        addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	            	MyDialog.this.dispose();  // close window
	                System.exit(0);              // exit program
	            }
	        });	        

	        setSize(300, 200);
	        setVisible(true);
	    }

}

