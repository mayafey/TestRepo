package bigDumbTestClass;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel implements Runnable, MouseListener{
	
	public boolean isIn = false;
	public int num;
	public boolean stop = false;
	public int green = 85;
	Color bg = new Color(85,85,200);

	public Panel(){
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		isIn=true;
		System.out.println("in on "+num);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		isIn=false;
		System.out.println("out on "+num);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		while(!stop){
			try{
				Thread.sleep(5);
			}catch(Exception e){
				System.out.println(e);
			}
			this.setBackground(bg);
			if(isIn){
				green = 200;		
			} else {
				if(green>85){
					green--;
				}
			}
			bg = new Color(green+(int)(Math.random()*30),green+(int)(Math.random()*30),200);
			this.repaint();
		}
		
	}
	
}
