package bigDumbTestClass;

public class Main {

	public static void main(String[] args) {
		Frame frame = new Frame();
		(new Thread(frame)).start();
	}

}
