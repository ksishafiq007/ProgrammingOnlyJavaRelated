package programming;

public class SingleTon {
	
private static SingleTon singleTon=new SingleTon();

private SingleTon() {}

public static SingleTon getInstance() {
	return singleTon;
}

protected static void demoMethod() {
	System.out.println("DemoMethod for singleton check");
}
}
