
public class MyGraphics  {

	public MyGraphics() {
		// TODO Auto-generated constructor stub
		public void paint(Graphics g) {
		    g.drawString("Hello Graphics", 50, 50);
		    g.drawLine(20, 70, 120, 70);
		    g.drawRect(40, 80, 100, 50);
		    g.setColor(Color.RED);
		    g.fillOval(40, 150, 80, 80);
		}
	}

}
