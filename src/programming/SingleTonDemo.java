package programming;

public class SingleTonDemo {

	public static void main(String[] args) {
		
		SingleTon tmp=SingleTon.getInstance();
		tmp.demoMethod();
	}

}
