package bigDumbTestClass;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Frame extends JFrame implements Runnable{
	Panel[] panels = new Panel[25*25];
	public boolean stop = false;
	
	public Frame(){
		this.setSize(300,300);
		this.setLayout(new GridLayout(25,25));
		for(int i=0;i<panels.length;i++){
			panels[i]=new Panel();
			panels[i].num=i;
			this.add(panels[i]);
			(new Thread(panels[i])).start();	
		}
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}


	public void run() {
		
		while(!stop){
			this.revalidate();
			this.repaint();
		}
	}
}
